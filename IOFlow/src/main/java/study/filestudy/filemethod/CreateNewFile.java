package study.filestudy.filemethod;

import java.io.File;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 15:13
 * 创建文件
 */
public class CreateNewFile {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\HelloIO.java");
        file.createNewFile();
    }
}
