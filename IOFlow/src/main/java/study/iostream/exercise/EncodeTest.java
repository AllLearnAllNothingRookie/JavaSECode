package study.iostream.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/10 14:00
 * 编写程序实现将一个编码为GBK的纯文本文件，复制为编码格式是UTF-8的文件
 */
public class EncodeTest {
    public static void main(String[] args) {
        try {
            copy(new File("d:\\message.txt"),"GBK"
                    ,new File("D:\\test.txt"),"utf8");
            System.out.println("拷贝文件成功");
        } catch (IOException e) {
            System.out.println("拷贝文件失败");
        }
    }

    /**
     * 复制文件指定字符集
     */
    public static void copy(File src,String srcCharset,File dest,String destCharset) throws IOException {
        BufferedReader ber = new BufferedReader(new InputStreamReader(new FileInputStream(src),srcCharset));
        BufferedWriter bew = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dest),destCharset));
        try {
            String str;
            while ((str = ber.readLine()) != null){
                bew.write(str);
                bew.newLine();
                bew.flush();
            }
        }finally {
            try {
                if (ber != null){
                    ber.close();
                }
            }finally {
                if (bew != null){
                    bew.close();
                }
            }
        }
    }
}
