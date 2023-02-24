package study.filestudy.filemethod;

import java.io.File;
import java.lang.reflect.Field;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 16:44
 * 删除目录
 */
public class DeleteDirectory {
    public static void main(String[] args) {
        File file = new File("d:\\hello");
        file.delete();
    }
}
