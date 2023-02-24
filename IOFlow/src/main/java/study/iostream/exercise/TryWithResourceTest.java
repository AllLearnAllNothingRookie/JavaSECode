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
 * @date 2023/2/13 10:04
 */
public class TryWithResourceTest {
    public static void main(String[] args) {
        File src = new File("d:\\mysql左外联接查询.wmv");
        File dest = new File("d:\\poji\\mysql左外联接查询.wmv");
        try (
                FileInputStream fis = new FileInputStream(src);
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream(dest);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
        ){
            byte[] data = new byte[1024];
            int len = -1;
            //读取
            while ((len = bis.read(data)) != -1){
                //写入
                bos.write(data,0,len);
                //bos.flush();
            }
            System.out.println("文件复制成功");
        }catch (IOException e){
            System.out.println("文件复制失败");
            e.printStackTrace();
        }

    }
}
