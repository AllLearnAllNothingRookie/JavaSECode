package study.iostream.exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/13 9:38
 */
public class CloseOrderTest {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("D:\\order.txt");
            bw = new BufferedWriter(fw);
            bw.write("你好");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    if (fw != null){
                        try {
                            fw.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
