package study.iostream.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/10 15:46
 */
public class FileCopyUtilsTest {
    public static void main(String[] args) throws IOException {
        copyDirectory(new File("D:\\hash"),new File("D:\\a\\b"));
        System.out.println("复制完成");
    }
    /**
     * 复制文件
     */
    public static  void copyFile(File src,File dest) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);
        try {
            byte[] data = new byte[1024];
            int len;
            while ((len = fis.read(data)) != -1){
                fos.write(data,0,len);
                fos.flush();
            }
        }finally {
            try {
                if (fis != null){
                    fis.close();
                }
            }finally {
                if (fos != null){
                    fos.close();
                }
            }

        }
    }
    /**
     * 复制文件夹
     */
    public static void copyDirectory(File srcDir,File destDir) throws IOException {
        //父目录不能复制到子目录中
        if (destDir.getAbsolutePath().contains(srcDir.getAbsolutePath())){
            throw new IOException("父目录不能复制到子目录中");
        }
        if (destDir.exists() && !destDir.isDirectory()){
            throw new IOException("目标对象不是目录");
        }
        File dest = new File(destDir,srcDir.getName());
        //如果srcDir是个文件则直接复制到destDir中
        if (srcDir.isFile()){
            copyFile(srcDir,dest);
        }else {
            //心啊在destPath目录中创建srcDir对应的文件夹
            dest.mkdirs();
            //复制src中的字目录或文件
            File[] files = srcDir.listFiles();
            for (File file : files) {
                copyDirectory(file,dest);
            }
        }

    }
}
