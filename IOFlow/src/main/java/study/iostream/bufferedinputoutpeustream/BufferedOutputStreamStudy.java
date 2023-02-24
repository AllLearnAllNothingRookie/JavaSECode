package study.iostream.bufferedinputoutpeustream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/8 10:45
 * todo:BufferedOutputStream是字节流，实现缓冲的输出流，可以将多个字节写入到底层输出流中
 *      而不必对每隔字节写入调用底层系统
 */
public class BufferedOutputStreamStudy {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\in.txt";
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(filePath));
        bufferedOutputStream.write(97);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
}
