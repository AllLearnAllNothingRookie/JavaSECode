package study.iostream.printstreamwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 9:23
 */
public class PrintWriterStudy {
    /**
     * 演示字符打印流PrintWriter
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //传入System.out时输出的位置为显示器
        PrintWriter writer = new PrintWriter(System.out);
        writer.println("你好，我是字符打印流");
        writer.close();
        //输出到文件
        PrintWriter out = new PrintWriter(new FileWriter("d:\\h1.txt"));
        out.print("输出位置变化了哦，记得去文件里找我");
        out.flush();
        out.close();
    }
}
