package study.iostream.bufferedreaderwirter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.Test;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/7 22:13
 */
public class BufferedWriterStudy {
    /**
     * 使用BufferedWriter向文件中写入数据
     */
    @Test
    public void func() throws IOException {
        String filePtah = "d:\\ok.txt";
        //创建BufferedWriter
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePtah));
        bufferedWriter.write("你好Java");
        //换行---根据系统提供换行符
        bufferedWriter.newLine();
        bufferedWriter.write("好好学习");
        //关闭包装流即可
        bufferedWriter.close();
    }
    /**
     * 使用BufferedWriter向文件中追加数据
     *
     */
    @Test
    public void func2() throws IOException {
        String filePtah = "d:\\ok.txt";
        //创建BufferedWriter
        //todo:new BufferedWriter(new FileWriter(filePtah,true));表示追加
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePtah,true));
        bufferedWriter.write("你好GoLang");
        //换行---根据系统提供换行符
        bufferedWriter.newLine();
        bufferedWriter.write("好好学习");
        //关闭包装流即可
        bufferedWriter.close();
    }
}
