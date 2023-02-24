package study.iostream.objectinputoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import org.junit.Test;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/8 14:00
 */
public class ObjectOutputStreamStudy {
    /**
     * 使用ObjectOutputStream完成数句序列输出
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //todo:序列化后保存的文件为dat文件
        String filePath = "d:\\out.dat";
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath));
        out.writeInt(100);
        //写入boolean类型，基本数据类型会自动包装为包装类
        out.writeBoolean(true);
        //写入char类型，基本数据类型会自动包装为包装类
        out.writeChar('A');
        //写入字符串
        out.writeUTF("啥也想学啥也不会");
        //保存一个对象
        out.writeObject(new Dog("旺财",3));
        out.flush();
        out.close();
        System.out.println("数据保存完毕");
    }

    /**
     * 序列化 static和transient修饰的属性，发现不能序列化，反序化是没有这两个
     * 修饰符修饰的属性的值
     * @throws IOException
     */
    @Test
    public void test() throws IOException {
        //todo:序列化后保存的文件为dat文件
        String filePath = "d:\\out2.dat";
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath));
        out.writeInt(100);
        //写入boolean类型，基本数据类型会自动包装为包装类
        out.writeBoolean(true);
        //写入char类型，基本数据类型会自动包装为包装类
        out.writeChar('A');
        //写入字符串
        out.writeUTF("啥也想学啥也不会");
        //保存一个对象
        out.writeObject(new Dog("旺财",3,"日本","白色"));
        out.flush();
        out.close();
        System.out.println("数据保存完毕");
    }
}
