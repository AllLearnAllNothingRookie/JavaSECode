package study.iostream.bufferedreaderwirter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.junit.Test;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/7 22:12
 * todo:BufferedReader和BufferedWriter属于字符流，是按照字符来读取数据的
 *      关闭处理流时，只需要关闭外层流即可
 */
public class BufferedReaderStudy {
    /**
     * 使用BufferedReader读取文本文件，并显示在控制台
     */
    @Test
    public  void func() throws IOException {
        String filePath = "d:\\b.txt";
        //创建一个BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //读取
        String line;
        //bufferedReader.readLine():按行读取，当达到尾部是返回null
        while ((line = bufferedReader.readLine()) != null){
            System.out.print(line);
            System.out.println();
        }
        //关闭处理流时，只需要关闭外层流即可
        bufferedReader.close();
        System.out.println("读取完毕");
    }
}
