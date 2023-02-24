package study.iostream.exercise;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/10 15:19
 */
public class PrintWriteTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("D:\\write.txt");
            while (true){
                System.out.println("输入留言(stop结束):");
                String msg = input.nextLine();

                if ("stop".equals(msg)){
                    System.out.println("留言结束");
                    break;
                }
                pw.println(msg);
                pw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (input != null){
                input.close();
            }
            if (pw != null){
                pw.close();
            }
        }

    }
}
