package study.filestudy.filemethod;

import java.io.File;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 17:04
 *编写代码实现列出某个目录（文件夹)，如“d:/atguigu”下所有的下一级，
 * 如果下一级仍然是一个目录（文件夹），那么就继续列出它的下一级直到最后一级。
 * 方案1：直接打印返回
 */
public class ListAllSubs01 {
    public static void main(String[] args) {
        File dir = new File("d:\\hash");
        listSubFiles(dir);
    }
    public static  void listSubFiles(File dir){
        if (dir != null && dir.isDirectory()){
            File[] files = dir.listFiles();
            if (files != null){
                for (File file : files) {
                    listSubFiles(file);
                }
            }
        }
        System.out.println(dir);
    }
}
