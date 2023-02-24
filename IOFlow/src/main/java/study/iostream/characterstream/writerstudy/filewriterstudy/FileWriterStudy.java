package study.iostream.characterstream.writerstudy.filewriterstudy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.Test;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/5 21:35
 * todo:FileWriter使用后必须要关闭(close)或刷新(flush)，否则写入不到指定的文件
 * todo: 构造器
 *      1.FileWriter(File file):给一个File对象构造一个FileWriter对象。
 *      2.FileWriter(File file, boolean append):给一个File对象构造一个FileWriter对象, 如果第二个参数是true ，则字节将写入文件的末尾而不是开头
 *      3.FileWriter(FileDescriptor fd):构造与文件描述符关联的FileWriter对象。
 *      4.FileWriter(String fileName):构造一个给定文件名的FileWriter对象。
 *      5.FileWriter(String fileName, boolean append):构造一个FileWriter对象，给出一个带有布尔值的文件名，表示是否附加写入的数据。 如果第二个参数是true ，则字节将写入文件的末尾而不是开头
 *todo:常用方法
 *  1.java.io.OutputStreamWriter中的方法
 *      void close():关闭流，先刷新。
 *      void flush():刷新流。
 *      String getEncoding():写入字符数组的一部分。
 *      void write(char[] cbuf, int off, int len):写入字符数组的一部分。
 *      void write(int c):写一个字符串的一部分。
 *      void write(String str, int off, int len):写一个字符串的一部分。
 *  2. java.io.Writer中的方法
 *      Writer append(char c)：将指定的字符追加到此Writer流
 *      Writer append(CharSequence csq):将指定的字符序列附加到此Writer流
 *      Writer append(CharSequence csq, int start, int end):将指定字符序列的子序列附加到此Writer流
 *      abstract void close():关闭流，先刷新。
 *      abstract void flush():刷新流。
 *      void write(char[] cbuf):写入一个字符数组。
 *      abstract void write(char[] cbuf, int off, int len):写入字符数组的一部分。
 *      void write(int c):写一个字符
 *      void write(String str):写一个字符串
 *      void write(String str, int off, int len):写一个字符串的一部分。
 */
public class FileWriterStudy {
    /**
     * 向文件中写入单个字符
     * todo:void write(int c):写一个字符
     */
    @Test
    public void func1(){
        String filePath = "d:\\note.txt";
        FileWriter fileWriter = null;
        try {
             fileWriter = new FileWriter(filePath);
             //void write(int c):写一个字符
             fileWriter.write('H');
             //刷新流
            //对于FileWriter，一定要关闭流(close())，或者刷新流(flush()),才能把数据真正写入文件
             fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //对于FileWriter，一定要关闭流(close())，或者刷新流(flush()),才能把数据真正写入文件
            if (fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("写入成功");
    }
    /**
     * 向文件中写入一个字符数组
     * todo:void write(char[] cbuf):写入一个字符数组
     */
    @Test
    public void func2(){
        String filePath = "d:\\note.txt";
        FileWriter fileWriter = null;
        char [] data = {'H','l','l','o'};
        try {
            fileWriter = new FileWriter(filePath);
            //void write(char[] cbuf):写入一个字符数组
            fileWriter.write(data);
            //刷新流
            //对于FileWriter，一定要关闭流(close())，或者刷新流(flush()),才能把数据真正写入文件
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //对于FileWriter，一定要关闭流(close())，或者刷新流(flush()),才能把数据真正写入文件
            if (fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("写入成功");
    }
    /**
     * 向文件中写入一个字符数组的一部分
     * todo: void write(char[] cbuf, int off, int len):写入字符数组的一部分。
     */
    @Test
    public void func3(){
        String filePath = "d:\\note.txt";
        FileWriter fileWriter = null;
        char [] data = {'H','l','l','o',',','W','o','r','l','d','!'};
        try {
            fileWriter = new FileWriter(filePath);
            //void write(char[] cbuf, int off, int len):写入字符数组的一部分。
            fileWriter.write(data,0,5);
            //刷新流
            //对于FileWriter，一定要关闭流(close())，或者刷新流(flush()),才能把数据真正写入文件
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //对于FileWriter，一定要关闭流(close())，或者刷新流(flush()),才能把数据真正写入文件
            if (fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("写入成功");
    }
    /**
     * 向文件中写一个字符串
     * todo: void write(String str):写一个字符串
     */
    @Test
    public void func4(){
        String filePath = "d:\\note.txt";
        FileWriter fileWriter = null;
       String data = "你好呀,Java";
        try {
            fileWriter = new FileWriter(filePath);
            //void write(String str):写一个字符串
            fileWriter.write(data);
            //刷新流
            //对于FileWriter，一定要关闭流(close())，或者刷新流(flush()),才能把数据真正写入文件
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //对于FileWriter，一定要关闭流(close())，或者刷新流(flush()),才能把数据真正写入文件
            if (fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("写入成功");
    }
    /**
     * 向文件中写一个字符串
     * todo: void write(String str, int off, int len):写一个字符串的一部分。
     */
    @Test
    public void func5(){
        String filePath = "d:\\note.txt";
        FileWriter fileWriter = null;
        String data = "你好呀,Java";
        try {
            fileWriter = new FileWriter(filePath);
            //void write(String str, int off, int len):写一个字符串的一部分。
            fileWriter.write(data,4,4);
            //刷新流
            //对于FileWriter，一定要关闭流(close())，或者刷新流(flush()),才能把数据真正写入文件
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //对于FileWriter，一定要关闭流(close())，或者刷新流(flush()),才能把数据真正写入文件
            if (fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("写入成功");
    }
    /**
     * 向文件中写追加字符串
     */
    @Test
    public void func6(){
        String filePath = "d:\\note.txt";
        FileWriter fileWriter = null;
        String data = ",Golang,Python,C/C++,Matlab";
        try {
            //append为true表示向文件追加
            fileWriter = new FileWriter(filePath,true);
            fileWriter.write(data);
            //刷新流
            //对于FileWriter，一定要关闭流(close())，或者刷新流(flush()),才能把数据真正写入文件
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //对于FileWriter，一定要关闭流(close())，或者刷新流(flush()),才能把数据真正写入文件
            if (fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("写入成功");
    }
}
