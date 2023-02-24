package study.iostream.transformation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import org.junit.Test;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/8 21:23
 * todo:转换流： 可以把字节流转换为字符流，可以指定编码进行转换
 *      转换流： InputStreamReader和OutStreamWriter
 *      1.InputStreamReader是Reader的子类，可以将InputStream(字节流)包装为Reader(字符流)
 *      2.OutStreamWriter是Writer的子类，实现见OutStream(字节流)包装成Writer(字符流)
 *      3.当处理纯文本数据时,如果使用字符流效率更高，并且可以有效解决中文问题，所以建议将字节流
 *        转换成字符流
 *      4.可以在使用时指定编码格式(比如utf-8,jbk,gb2312,iso8859-1等)
 *
 */
public class TransformationStream {
    /**
     * 演示使用转换流解决中文乱码问题
     * @param args
     */
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\a.txt";
        //使用转换流
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "gbk");
        //将转换流包装到 BufferedReader 流中提高读取效率
        BufferedReader br = new BufferedReader(isr);
        //开发时可以将上两行代码合成一行
        BufferedReader br1 = new BufferedReader(new InputStreamReader(
                                                new FileInputStream(filePath), "gbk"));
        String str = null;
        while ((str = br.readLine()) != null){
            System.out.println(str);
        }
        //后创建的流先关闭，关闭流时也可以只关闭外层的流
        br.close();
        isr.close();
    }

    /**
     * 演示OutStreamWriter的使用
     * 把FileOutputStream字节流转成字符流OutStreamWriter，指定处理的编码格式 gbk/utf-8/utf8
     */
    @Test
    public void outStreamWriterStudy() throws IOException {
        String filePath = "d:\\hap.txt";
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(filePath), "utf8");
        out.write("hi,认真学习Java的小伙伴");
        out.flush();
        out.close();
        System.out.println("按照utf80编码方式保存文件成功");
    }
}
