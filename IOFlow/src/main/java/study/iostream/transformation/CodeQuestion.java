package study.iostream.transformation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/8 21:16
 * 中文乱码问题
 */
public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        //默认情况下，读取文件是按照UTF-8编码
        String filePath = "d:\\a.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String str = null;
        while ((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
    }
}
