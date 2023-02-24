package study.filestudy.filemethod;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 17:18
 * 方案2:使用集合返回所有下一级，并考虑异常处理
 */
public class ListAllSubs02 {
    public static void main(String[] args) {
        File dir = new File("d:\\hash");
        try {
            ArrayList<File> files = listSubFiles(dir);
            for (File file : files) {
                System.out.println(file);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<File> listSubFiles(File dir) throws FileNotFoundException {
        if (dir == null || !dir.exists()){
            throw new FileNotFoundException((dir + "不存在"));
        }
        if (dir.isFile()){
            throw  new IllegalArgumentException(dir + "不是一个目录");
        }
        ArrayList<File> all = new ArrayList<>();
        if (dir != null && dir.isDirectory()){
            File[] files = dir.listFiles();
            for (File file : files) {
                all.add(file);
                if (file.isDirectory()){
                    all.addAll(listSubFiles(file));
                }
            }
        }
        return all;
    }
}
