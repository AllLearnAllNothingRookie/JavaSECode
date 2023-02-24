package study.iostream.printstreamwriter;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 9:22
 * todo:打印流：PrintStream和PrintWriter
 *      打印流只有输出流没有输入流
 */
public class PrintStreamStudy {
    /**
     * PrintStream字节打印流演示代码
     * @param args
     */
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        //在默认情况下，PrintStream输出数据的位置时标准输出即显示器
        out.println("hello");
        //因为PrintStream的底层时Writer，所以可以直接调用Writer进行打印输出
        out.write("你好,Java".getBytes());
        out.close();
        //修改打印流输出的位置
        System.setOut(new PrintStream("d:\\t1.txt"));
        System.out.println("我修改了位置，现在时输出到文件哦，记得去文件里找我哦");
    }
}
