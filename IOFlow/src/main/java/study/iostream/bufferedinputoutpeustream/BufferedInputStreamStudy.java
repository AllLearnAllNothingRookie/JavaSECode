package study.iostream.bufferedinputoutpeustream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/8 10:45
 * todo:BufferedInputStream是字节流，在创建BufferedInputStream时会创建一个内存缓冲数组
 *  当创建BufferedInputStream时，将创建一个内部缓冲区数组。 当从流中读取或跳过字节时，
 *  内部缓冲区将根据需要从所包含的输入流中重新填充，一次有多个字节。
 *
 *  todo:字节流可以操作文本文件只是输出控制台时，一个字的字节可能被分割出现乱码，
 *      如果字节输入到文件中则不会出现问题
 */
public class BufferedInputStreamStudy {
    public static void main(String[] args) throws IOException {
        String filePtah = "d:\\b.txt";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePtah));
        byte [] data = new byte[8];
        int len = -1;
        while ((len = bufferedInputStream.read(data)) != -1){
            String info = new String(data,0,len);
            System.out.print(info);
        }
        System.out.println();
        bufferedInputStream.close();
        System.out.println("读取完毕");
    }
}
