package study.filestudy.filemethod;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 16:22
 * 列出目录内容并加入过滤条件
 */
public class ListFilesFilter {
    public static void main(String[] args) {
        File dir = new File("D:\\hash\\tidalab");
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".dll");
            }
        });
        if (files != null){
            for (File file : files) {
                System.out.println(file);
            }
        }
    }
}
