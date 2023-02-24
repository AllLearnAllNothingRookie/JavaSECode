package study.iostream.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/10 9:39
 * 输出纯文本数据
 */
public class FileWriterTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileWriter fw = null;
        try {
            //true表示追加，默认是覆盖模式
            fw = new FileWriter("d:\\message.txt",true);
            while (true){
                System.out.println("请输入留言(stop结束):");
                String message = input.nextLine();
                if ("stop".equals(message)){
                    break;
                }
                fw.write(message);
                //刷新流
                fw.flush();
            }
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
