package study.iostream.bufferedinputoutpeustream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.junit.Test;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/8 11:01
 * 使用BufferedOutputStream和BufferedInputStream拷贝图片音乐等
 */
public class BufferStreamCopy {
    public static void main(String[] args) throws IOException {
        String srcPath = "d:\\javaiodeatil.jfif";
        String destPath = "d:\\javaIo.jfif";
        byte [] data = new byte[1024];
        int len = -1;
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(srcPath));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destPath));
        while ((len = in.read(data)) != -1){
            out.write(data,0,len);
            out.flush();
        }
        in.close();
        out.close();
        System.out.println("拷贝完成");
    }
    /**
     * 字节流操作文本文件
     *  todo:字节流可以操作文本文件只是输出控制台时，一个字的字节可能被分割出现乱码，
     *    如果字节输入到文件中则不会出现问题
     */
    @Test
    public void func() throws IOException {
        String srcPath = "d:\\b.txt";
        String destPath = "d:\\hh.txt";
        byte [] data = new byte[1024];
        int len = -1;
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(srcPath));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destPath));
        while ((len = in.read(data)) != -1){
            out.write(data,0,len);
            out.flush();
        }
        in.close();
        out.close();
        System.out.println("拷贝完成");
    }
}
