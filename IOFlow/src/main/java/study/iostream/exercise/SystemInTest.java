package study.iostream.exercise;


import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/10 16:44
 */
public class SystemInTest {
    public static void main(String[] args) {
        Scanner input = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("d:\\info.txt");
            //重定向文件输入
            System.setIn(fis);
            input = new Scanner(System.in);
            while (input.hasNext()){
                String str = input.nextLine();
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (input != null){
                input.close();
            }
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }finally {
                    //重定向会键盘输入
                    System.setIn(new FileInputStream(FileDescriptor.in));
                }
            }
        }

    }
}
