package study.filestudy;

import java.io.File;
import org.junit.Test;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/4 20:52
 */
public class GetFileInfo {
    @Test
    public void fileInfo(){
        //创建文件
        String filePath = "d:\\news1.txt";
        File file = new File(filePath);
        //调用相应方法获取文件信息
        System.out.println("文件名字:" + file.getName());
        System.out.println("文件的绝对路径:" + file.getAbsolutePath());
        System.out.println("文件父级目录："  + file.getParent());
        System.out.println("文件大小:" + file.length() + "字节");
        System.out.println("文件是否存在：" + file.exists());
        System.out.println("是不是一个文件：" + file.isFile());
        System.out.println("是不是一个目录:" + file.isDirectory());
    }
}
