package study.iostream.bytestream.inputstreamstudy.fileinputstreamstudy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.junit.Test;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/5 16:05
 * todo:FileInputStream
 *  构造器：
 *     1. FileInputStream(File file)：通过打开与实际文件的连接创建一个
 *               FileInputStream ，该文件由文件系统中的 File对象 file命名。
 *     2.FileInputStream(FileDescriptor fdObj) ：创建 FileInputStream通过使用
 *              文件描述符 fdObj ，其表示在文件系统中的现有连接到一个实际的文件。
 *     3.FileInputStream(String name) ：通过打开与实际文件的连接来创建一个
 *              FileInputStream ，该文件由文件系统中的路径名 name命名。
 * todo:常用方法：
 *  1.int available() :返回从此输入流中可以读取（或跳过）的剩余字节数的估计值，而不会被下一次调用此输入流的方法阻塞。
 *  2.void close():关闭此文件输入流并释放与流相关联的任何系统资源。
 *  3.protected void finalize():确保当这个文件输入流的 close方法没有更多的引用时被调用。
 *  4.FileChannel getChannel():返回与此文件输入流相关联的唯一的FileChannel对象。
 *  5.FileDescriptor getFD():返回表示与此 FileInputStream正在使用的文件系统中实际文件的连接的 FileDescriptor对象。
 *  6.int read():从该输入流读取一个字节的数据。如果达到文件的末尾返回 -1 。
 *  7.int read(byte[] b):从该输入流读取最多 b.length个字节的数据为字节数组。返回实际读取的字节数，返回-1表示读取完毕
 *  8.int read(byte[] b, int off, int len):从该输入流读取最多 len字节的数据为字节数组。
 *  9long skip(long n) :跳过并从输入流中丢弃 n字节的数据。
 *
 *
 * 需求：读取文件中的内容输出到控制台上
 */
public class FileInputStreamStudy {
    public static void main(String[] args) {
    }

    /**
     * 使用read()读取文件，效率比较低
     */
    @Test
    public void readFile01(){
        String filePath = "D:\\hello.txt";
        File file = new File(filePath);
        FileInputStream fileInputStream = null;
        int readDate = -1;
        try {
            //创建FileInputStream对象用于读取文件
            fileInputStream = new FileInputStream(filePath);
            //读取一个字节的数据，如果到达末尾则返回-1
            while ((readDate = fileInputStream.read()) != -1){
                System.out.print((char) readDate);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 是哟个read(byte[] b)读取文件，提高效率
     */
    @Test
    public void readFile02(){
        String filePath = "D:\\b.txt";
        File file = new File(filePath);
        FileInputStream fileInputStream = null;
        //一次读取8字节
        byte [] date = new byte[8];
        int readDateLength = -1;
        try {
            //创建FileInputStream对象用于读取文件
            fileInputStream = new FileInputStream(filePath);
            //读取一个字节的数据，如果到达末尾则返回-1
            while ((readDateLength = fileInputStream.read(date)) != -1){
                System.out.print(new String(date,0,readDateLength));
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
