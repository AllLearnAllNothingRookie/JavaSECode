package study.filestudy.filemethod;

import java.io.File;
import java.io.FileFilter;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 17:40
 * 编写代码列出某个目录，如“d:/atguigu/javase”下的所有java文件，
 * 如果下一级仍然是一个目录（文件夹），那么就继续在它的下一级中查找.java文件。
 *
 */
public class ListAllJavaFile {
    public static void main(String[] args) {
        File file = new File("D:\\jt\\jt-eos");
        listByFileFilter(file);
    }
    public static void listByFileFilter(File file){
        if (file != null && file.isDirectory()){
            File[] files = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.isDirectory() || pathname.getName().endsWith(".java");
                }
            });
            if (files != null){
                for (File sub : files) {
                    if (sub.isFile()){
                        System.out.println(sub);
                    }else {
                        listByFileFilter(sub);
                    }
                }
            }

        }
    }
}
