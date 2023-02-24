package study.iostream.bytestream.outinputstreamstudy.fileinputstreamstudy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.junit.Test;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/5 16:50
 * todo: FileOutputStream在写入数据时如果文件不存在则会创建一个文件
 * todo: 常用构造器:
 *     1.FileOutputStream(File file) :创建文件输出流以写入由指定的 File对象表示的文件。写入的内容会覆盖原来的文件
 *     2.FileOutputStream(File file, boolean append) :创建文件输出流以写入由指定的 File对象表示的文件。如果第二个参数是true ，则字节将被写入文件的末尾而不是开头
 *     3.FileOutputStream(FileDescriptor fdObj) :创建文件输出流以写入指定的文件描述符，表示与文件系统中实际文件的现有连接。
 *     4.FileOutputStream(String name) :创建文件输出流以指定的名称写入文件。写入的内容会覆盖原来的文件
 *     5.FileOutputStream(String name, boolean append):创建文件输出流以指定的名称写入文件。如果第二个参数是true ，则字节将被写入文件的末尾而不是开头
 *
 * todo:常用方法：
 *    1.void close() :关闭此文件输出流并释放与此流相关联的任何系统资源。
 *    2.protected void finalize() :清理与文件的连接，并确保当没有更多的引用此流时，将调用此文件输出流的 close方法。
 *    3.FileChannel getChannel():返回与此流相关联的文件描述符。
 *    4.FileDescriptor getFD() :返回与此流相关联的文件描述符。
 *    5.void write(byte[] b):将 b.length个字节从指定的字节数组写入此文件输出流。
 *    6.void write(byte[] b, int off, int len):将 len字节从位于偏移量 off的指定字节数组写入此文件输出流。
 *    7. void write(int b) :将指定的字节写入此文件输出流。
 */
public class FileOutputStreamStudy {
    /**
     * 写入一个字节
     * 向文件中写入数据，如果文件不存在则创建文件
     */
    @Test
    public void func(){
        String filePath = "d:\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //得到 FileOutputStream对象
            fileOutputStream = new FileOutputStream(filePath);
            //向文件中写入一个字节
            fileOutputStream.write('A');
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    /**
     * 写入一个字符串，使用默认编码
     * 向文件中写入数据，如果文件不存在则创建文件
     */
    @Test
    public void func2()  {
        String filePath = "d:\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //得到 FileOutputStream对象
            fileOutputStream = new FileOutputStream(filePath);
            //要写入的字符
            String info  = "Hello,Golang!";
            //将字符串转换为字节数据
            byte[] bytes = info.getBytes();
            //向文件中写入一个字节数组
            fileOutputStream.write(bytes);
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    /**
     * 写入一个字符串中的部分数据，使用默认编码
     * 向文件中写入数据，如果文件不存在则创建文件
     */
    @Test
    public void func3()  {
        String filePath = "d:\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //得到 FileOutputStream对象
            fileOutputStream = new FileOutputStream(filePath);
            //要写入的字符
            String info  = "Hello,Golang!";
            //将字符串转换为字节数据
            byte[] bytes = info.getBytes();
            //向文件中写入一个字节数组
            fileOutputStream.write(bytes,0,5);
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    /**
     * 在文件末尾追加一个字符串，使用默认编码
     * 向文件中最追加数据，如果文件不存在则创建文件
     */
    @Test
    public void func4()  {
        String filePath = "d:\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //得到 FileOutputStream对象
            fileOutputStream = new FileOutputStream(filePath,true);
            //要写入的字符
            String info  = "Hello,Golang!";
            //将字符串转换为字节数据
            byte[] bytes = info.getBytes();
            //向文件中写入一个字节数组
            fileOutputStream.write(bytes);
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
