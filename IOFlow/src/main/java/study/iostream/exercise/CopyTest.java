package study.iostream.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/10 10:37
 */
public class CopyTest {
    public static void main(String[] args) {
        try {
            copyFile(new File("D:\\javaIo.jfif"),new File("d:\\1.jfif"));
            System.out.println("文件复制成功");
        } catch (IOException e) {
            System.out.println("文件复制失败");
        }
    }
    public static void copyFile(File src, File dest) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);
        try {
            byte[] data = new byte[1024];
            int len;
            while ((len = fis.read(data)) != -1){
                fos.write(data,0,len);
                fos.flush();
            }
        }finally {
            try {
                if (fis != null){
                    fis.close();
                }
            }finally {
                if (fos != null){
                    fos.close();
                }
            }
        }
    }
}
