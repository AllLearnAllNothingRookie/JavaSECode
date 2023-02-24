package study.filestudy;

import java.io.File;
import java.io.IOException;
import org.junit.Test;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/4 22:03
 */
public class Directory {
    public static void main(String[] args) {

    }

    /**
     * 判断文件是否存在，如果存在则删除
     */
    @Test
    public void m1(){
        String filePath = "d:\\news1.txt";
        File file = new File(filePath);
        if (file.exists()){
            //delete():删除文件或空目录
            if (file.delete()){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("该文件不存在");
        }
    }

    /**
     * 判断目录是否存在，如果存在则将其删除
     */
    @Test
    public void m2(){
        String filePath = "D:\\demo";
        File file = new File(filePath);
        if (file.exists()){
            if (file.delete()){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("目录不存在");
        }
    }

    /**
     * 判断目录是否存在，如果不存在则创建
     */
    @Test
    public void m3() throws IOException {
        String filePath = "D:\\demo\\a";
        File file = new File(filePath);
        if (file.exists()){
            System.out.println("文件存在");
        }else {
            if (file.mkdirs()){
                System.out.println("创建成功");
            }else {
                System.out.println("创建失败");
            }

        }
    }
}
