package study.filestudy.filemethod;

import java.io.File;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 16:19
 * 列出目录内容
 */
public class ListFiles {
    public static void main(String[] args) {
        File dir = new File("d:\\hash");
        File[] files = dir.listFiles();
        if (files != null){
            for (int i = 0;i < files.length; i ++){
                System.out.println(files[i]);
            }
        }
    }
}
