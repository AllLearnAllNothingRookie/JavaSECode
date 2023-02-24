package study.iostream.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/10 10:21
 *从message.txt文件中读取用户留言信息，要求按行读取留言消息。
 */
public class BufferedReaderTest {
    public static void main(String[] args) {
        BufferedReader bfr = null;
        try {
            bfr = new BufferedReader(new FileReader("d:\\message.txt"));
            String line = null;
            //按行读取，每次读取一行数据，如果是行尾，则返回null
            while ((line = bfr.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bfr != null){
                try {
                    bfr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
