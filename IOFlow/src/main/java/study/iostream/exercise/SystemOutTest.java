package study.iostream.exercise;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/10 16:56
 */
public class SystemOutTest {
    public static void main(String[] args) {
        System.out.println("start");
        PrintStream printStream = null;
        try {
            printStream = new PrintStream("d:\\print.txt");
            //重定向
            System.setOut(printStream);
            System.out.println("Hello");
            System.out.println("我已经");
            System.out.println("到");
            System.out.println("文件里了");
            System.out.println("记得去文件里");
            System.out.println("找我");
            System.out.println(100);
            System.out.println(true);
            System.out.println(1001.3);
            System.out.println("拜拜");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (printStream != null){
                printStream.close();
            }
            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        }
        System.out.println("end");
    }
}
