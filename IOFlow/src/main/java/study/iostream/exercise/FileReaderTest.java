package study.iostream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/10 10:13
 * 从message.txt文件中读取用户留言信息。
 */
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("d:\\message.txt");
            char[] data = new char[1024];
            int len;
            //每次read，将数据读入到data数组中，并返回data数组中字符的个数
            //如果是行尾，则返回-1
            while ((len = fr.read(data)) != -1){
                System.out.println(new String(data,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
