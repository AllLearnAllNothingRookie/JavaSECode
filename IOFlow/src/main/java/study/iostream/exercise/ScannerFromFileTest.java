package study.iostream.exercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/10 17:42
 */
public class ScannerFromFileTest {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        Scanner input = null;
        try {
            fileInputStream = new FileInputStream("D:\\info.txt");
            input = new Scanner(fileInputStream);
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
