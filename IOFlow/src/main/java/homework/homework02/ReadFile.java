package homework.homework02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 11:15
 * 使用BufferedReader读取文本文件，并为每行添加行号，输出到屏幕上
 */
public class ReadFile {
    public static void main(String[] args) {
        BufferedReader bf = null;
        String line = null;
        int lineNumber = 0;
        try {
            bf = new BufferedReader(new FileReader("D:\\b.txt"));
            while ((line = bf.readLine()) != null){
                System.out.println((++lineNumber) + ". " + line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(bf != null){
                try {
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("文档读取完毕，共" + lineNumber + "行");
    }
}
