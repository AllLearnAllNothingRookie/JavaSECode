package homework.homework01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 11:01
 * 判断是否有文件夹mytemp，没有则创建，判断mytemp文件夹下是否有hello.txt,没有则创建
 * 如果存在了则提示文件已经存在
 */
public class FileOperation {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\mytemp");
        if (file.exists()){
            System.out.println("文件夹加已经存在");
        }else {
            file.mkdirs();
        }
        file = new File("d:\\mytemp\\hello.txt");
        if (file.exists()){
            System.out.println("文件已经存在");
        }else {
            file.createNewFile();
            FileWriter fileWriter = null;
            try {
                 fileWriter = new FileWriter("d:\\mytemp\\hello.txt");
                fileWriter.write("hello");
                fileWriter.flush();
                System.out.println("创建成功");
            }finally {
                if (fileWriter != null){
                    fileWriter.close();
                }
            }
        }
    }
}
