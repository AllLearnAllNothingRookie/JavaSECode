package study.filestudy.filemethod;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 15:33
 * 重命名文件夹
 */
public class ReNameFile {
    public static void main(String[] args) {
        File src = new File("d:\\hap.txt");
        File dest = new File("d:\\io.txt");
        src.renameTo(dest);
    }
}
