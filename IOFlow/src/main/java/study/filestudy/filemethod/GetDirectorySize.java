package study.filestudy.filemethod;

import java.io.File;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 17:56
 * 获取某个目录的总大小，如获取“D:/atguigu”目录的总大小。
 */
public class GetDirectorySize {
    public static void main(String[] args) {
        File file = new File("D:\\Android");
        long dirLength = getDirLength(file);
        System.out.println(file + "文件夹的总大小为:" + dirLength + "字节");
    }
    public static long getDirLength(File dir){
        if (dir != null && dir.isDirectory()){
            File[] files = dir.listFiles();
            if (files != null){
                long num = 0;
                for (File file : files) {
                    num += getDirLength(file);
                }
                return  num;
            }
        }else if (dir != null && dir.isFile()){
            return  dir.length();
        }
        return  0;
    }
}
