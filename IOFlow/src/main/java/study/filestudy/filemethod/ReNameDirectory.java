package study.filestudy.filemethod;

import java.io.File;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 16:52
 * 重命名文件夹
 */
public class ReNameDirectory {
    public static void main(String[] args) {
        File src = new File("d:\\js");
        File dest = new File("d:\\jingtou");
        src.renameTo(dest);
    }
}
