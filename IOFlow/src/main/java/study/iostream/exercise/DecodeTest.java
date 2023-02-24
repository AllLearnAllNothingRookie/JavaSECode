package study.iostream.exercise;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/10 13:51
 * 当前系统平台的字符编码方式是UTF-8，现在需要读取一个GBK编码的文件到当前系统中。
 */
public class DecodeTest {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("d:\\message.txt"),"GBK"));
            String str;
            while ((str = br.readLine()) != null){
                System.out.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
