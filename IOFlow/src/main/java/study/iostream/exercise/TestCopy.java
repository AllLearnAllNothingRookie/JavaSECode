package study.iostream.exercise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/13 10:13
 */
public class TestCopy {
    public static void main(String[] args) {
        File src = new File("d:\\mysql左外联接查询.wmv");
        File dest = new File("d:\\poji\\mysql左外联接查询11.wmv");
        try {
            copyFile(src,dest);
            System.out.println("文件复制成功");
        }catch (IOException e){
            System.out.println("文件复制失败");
            e.printStackTrace();
        }
    }
    public static void copyFile(File src,File dest) throws IOException {
        try(
                BufferedInputStream bis = new BufferedInputStream(
                        new FileInputStream(src));
                BufferedOutputStream bos = new BufferedOutputStream(
                        new FileOutputStream(dest));
                ){
            byte [] data = new byte[1024];
            int len = -1;
            while ((len = bis.read(data)) != -1){
                bos.write(data,0,len);
                bos.flush();
            }
        }
    }
}
