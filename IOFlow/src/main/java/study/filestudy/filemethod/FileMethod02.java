package study.filestudy.filemethod;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 14:58
 */
public class FileMethod02 {
    public static void main(String[] args) {
        File file = new File("../FileStudy.java");
        long time = file.lastModified();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String format = sf.format(new Date(time));
        System.out.println("最后的修该时间:" + format);
        System.out.println("文件大小:" + file.length());
    }
}
