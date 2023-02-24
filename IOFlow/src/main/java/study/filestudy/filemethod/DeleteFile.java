package study.filestudy.filemethod;

import java.io.File;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 15:29
 * 删除文件
 */
public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("d:\\HelloIO.java");
        file.delete();
    }
}
