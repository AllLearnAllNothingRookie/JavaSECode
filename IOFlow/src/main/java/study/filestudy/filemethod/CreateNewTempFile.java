package study.filestudy.filemethod;

import java.io.File;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 15:16
 * 创建临时新文件
 */
public class CreateNewTempFile {
    public static void main(String[] args) throws IOException {
        File tempFile = File.createTempFile("hello",".tmp");
        System.out.println(tempFile.getAbsolutePath());
    }
}
