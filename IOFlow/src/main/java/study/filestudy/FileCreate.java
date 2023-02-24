package study.filestudy;

import java.io.File;
import java.io.IOException;
import org.junit.Test;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/4 20:30
 * 用三种方式创建三个文件
 */
public class FileCreate {
    /**
     * 方式1：new File(String pathname) : 根据路径创建一个File对象
     * @throws IOException
     */
    @Test
    public void create01() throws IOException {
        //1.new File(String pathname) : 根据路径创建一个File对象
        String filePath = "d:\\news1.txt";
        File file = new File(filePath);
        //创建文件
        file.createNewFile();
        System.out.println("文件创建成功");
    }

    /**
     * 方式2：new File(File parent,String child):根据父目录文件 + 子路径构建
     * @throws IOException
     */
    @Test
    public void create02() throws IOException {
        //1.new File(File parent,String child):根据父目录文件 + 子路径构建
        File fileParent = new File("d:\\");
        String filePath = "news2.txt";
        //此时file只是一个Java对象
        File file = new File(fileParent,filePath);
        //真正的创建创建文件
        file.createNewFile();
        System.out.println("文件创建成功");
    }

    /**
     * 方式3：new File(String parent,String child):根据父目录 + 子路径构建
     */
    @Test
    public void create03() throws IOException {
        //3.new File(String parent,String child):根据父目录 + 子路径构建
        File file = new File("d:\\", "news3.txt");
        file.createNewFile();
        System.out.println("文件创建成功");
    }
}
