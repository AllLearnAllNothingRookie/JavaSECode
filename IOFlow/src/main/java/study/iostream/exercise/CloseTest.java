package study.iostream.exercise;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/13 9:33
 */
public class CloseTest {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("d:\\print.txt");
            //读取一字节的内容
            System.out.println(fileInputStream.read());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
