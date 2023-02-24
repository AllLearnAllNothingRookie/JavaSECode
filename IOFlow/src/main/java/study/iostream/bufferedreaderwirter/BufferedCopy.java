package study.iostream.bufferedreaderwirter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/7 22:37
 * 使用BufferedReade和BufferedWriter进行文件拷贝
 */
public class BufferedCopy {
    public static void main(String[] args) throws IOException {
        String srcFilePath = "d:\\b.txt";
        String destFilePath = "d:\\java.txt";
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFilePath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFilePath));
        while ((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            //写入一次后刷新流
            bufferedWriter.flush();
        }
        bufferedWriter.close();
        bufferedReader.close();
        System.out.println("拷贝完成");
    }
}
