package study.filestudy.filemethod;

import java.io.File;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 17:48
 * 删除某个目录，如D:/atguigu/temp，这个目录可能是个空目录也可能是个非空目录。
 */
public class DeleteNotEmptyDirectory {
    public static void main(String[] args) {
        File file = new File("D:\\360Downloads");
        forceDeleteDir(file);
        System.out.println("删除完成");
    }
    public static void forceDeleteDir (File dir){
        if (dir != null && dir.isDirectory()){
            File[] files = dir.listFiles();
            if (files != null){
                for (File file : files) {
                    if (file.isDirectory()){
                        forceDeleteDir(file);
                    }else {
                        file.delete();
                    }

                }
            }
        }
        if (dir != null){
            dir.delete();
        }
    }
}
