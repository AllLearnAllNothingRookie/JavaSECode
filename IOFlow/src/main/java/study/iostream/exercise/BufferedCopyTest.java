package study.iostream.exercise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/10 11:25
 * 提高文件复制的效率
 */
public class BufferedCopyTest {
    public static void main(String[] args) {
        try {
            copyFileHighSpeed(
                    new File("D:\\j280\\2021.12.27\\视频\\黄晓东_J280_20211227_day036_01_mysql左外联接查询.wmv"),
                    new File("D:\\mysql左外联接查询.wmv"));
            System.out.println("文件复制成功");
        } catch (IOException e) {
            System.out.println("文件复制失败");
        }
    }
    public static  void copyFileHighSpeed(File src, File dest) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
        try {
            byte [] data = new byte[1024];
            int len;
            while ((len = bis.read(data)) != -1){
                bos.write(data,0,len);
            }
            bos.flush();
        }finally {
            try {
                if (bis != null){
                    bis.close();
                }
            }finally {
                if (bos != null){
                    bos.close();
                }
            }
        }
    }
}
