package study.iostream.characterstream.readerstudy.filereaderstudy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.Test;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/5 20:30
 * todo: FileReader和FileWriter是字符流，及按照字符来操作io
 * todo:构造器
 *     1.FileReader(File file) ：创建一个新的 FileReader ，给出 File读取。
 *     2.FileReader(FileDescriptor fd) ：创建一个新的 FileReader ，给定 FileDescriptor读取
 *     3.FileReader(String fileName) ：创建一个新的 FileReader ，给定要读取的文件的名称。
 * todo:常见方法:
 *    1.java.io.InputStreamReader中的方法
 *      void close() ：关闭流并释放与之相关联的任何系统资源。
 *      String getEncoding() ：返回此流使用的字符编码的名称。
 *      int read():读一个字符，读到文件末尾返回-1
 *      int read(char[] cbuf, int offset, int length):将字符读入数组的一部分。读到文件末尾返回-1
 *      boolean ready():告诉这个流是否准备好被读取。
 *    2. java.io.Reader的方法
 *      abstract void close():关闭流并释放与之相关联的任何系统资源。
 *      void mark(int readAheadLimit):标记流中的当前位置。
 *      boolean markSupported():告诉这个流是否支持mark（）操作。
 *      int read():读一个字符，读到文件末尾返回-1
 *      int read(char[] cbuf):将字符读入字符数组，读到文件末尾返回-1
 *      abstract int read(char[] cbuf, int off, int len):将字符读入数组的一部分。读到文件末尾返回-1
 *      int read(CharBuffer target):告诉这个流是否准备好被读取。
 *      boolean  ready():告诉这个流是否准备好被读取。
 *      void reset(): 重置流。
 *      long skip(long n): 跳过字符
 *   3.java.lang.Object中的相关方法
 *      略
 */
public class FileReaderStudy {
    /**
     * 用字符流读取文件到控制台,使用单个字符进行读取
     */
    @Test
    public void func1(){
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("d:\\b.txt");
            int data = -1;
            //返回读取到字符对印的编码值，返回-1表示读取到文件末尾
            while ((data = fileReader.read()) != -1){
                System.out.print((char) data);
            }
            System.out.println("文件读取完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    /**
     * 用字符流读取文件到控制台,使用字符数组进行读取
     */
    @Test
    public void func2(){
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("d:\\b.txt");
            int len = -1;
            char [] datas = new char[10];
            //返回读取到字符的长度，返回-1表示读取到文件末尾
            while ((len = fileReader.read(datas)) != -1){
                String data = new String(datas,0,len);
                System.out.print(data);
            }
            System.out.println("文件读取完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
