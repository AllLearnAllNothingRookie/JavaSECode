package study.filestudy.filemethod;

import java.io.File;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 16:06
 * 创建一级目录
 */
public class CreateDirectory {
    public static void main(String[] args) {
        File dir  = new File("d:\\tset\\j\\hello");
        dir.mkdir();
    }
}
