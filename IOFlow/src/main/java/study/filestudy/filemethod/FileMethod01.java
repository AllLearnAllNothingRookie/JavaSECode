package study.filestudy.filemethod;

import java.io.File;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 14:27
 */
public class FileMethod01 {
    public static void main(String[] args) throws IOException {
        File file = new File("../FileStudy.java");
        System.out.println("user.dir=" + System.getProperty("user.dir"));
        System.out.println("文件/目录的名：" + file.getName());
        System.out.println("文件/目录的路径名：" + file.getPath());
        System.out.println("文件/目录的绝对路径名：" + file.getAbsolutePath());
        System.out.println("文件/目录的规范路径名：" + file.getCanonicalPath());
        System.out.println("文件/目录的父目录名：" + file.getParent());
        System.out.println("文件/目录的父目录对象：" + file.getParentFile());

    }
}
