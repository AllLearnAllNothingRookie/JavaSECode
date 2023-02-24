package study.iostream.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/5 20:08
 * 使用FileInputStream和FileOutputStream实现文件拷贝
 */
public class FileCopy {
    public static void main(String[] args) {
        //文件输出字节流将读取到的文件输出到指定位置
        FileOutputStream fileOutputStream = null;
        //文件输入字节流将文件读入到程序
        FileInputStream fileInputStream = null;
        byte [] data = new byte[1024];
        int len = -1;
        try {
            fileInputStream = new FileInputStream("d:\\GoDate.png");
            fileOutputStream = new FileOutputStream("D:\\录屏\\Go.png");
            // 读取一部分数据则就写入一部分数据
            //循环读取文件
            while ((len = fileInputStream.read(data)) != -1){
                //将文件拷贝到指定的位置
                fileOutputStream.write(data,0,len);
            }
            System.out.println("拷贝成功");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
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
