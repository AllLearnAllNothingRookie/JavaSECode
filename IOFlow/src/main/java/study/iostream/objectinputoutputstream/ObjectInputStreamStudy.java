package study.iostream.objectinputoutputstream;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.junit.Test;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/8 14:00
 * todo:对象流： ObjectInputStream和ObjectOutputStream
 *   功能: ObjectInputStream和ObjectOutputStream提供了对基本数据类型活对象数据类型的序列化
 *        和反序列化的方法
 *        ObjectInputStream:提供反序列化功能
 *        ObjectOutputStream:提供序列化功能
 *  注意细节:
 *      1.读写顺序要一致
 *      2.要求实现序列化或反序列化对象，需要实现Serializable
 *      3.序列化类中建议添加SerialVersionUID,为了提高版本的兼容性
 *      4.序列化对象时，默认将里面所有属性都进行序列化，但除了static和transient修饰的成员
 *      5.序列化对象时，要求里面的属性也需要实现序列化接口
 *      6.序列化具备可继承性，也就是说如果某类已经实现了序列化，则它的所有子类也已经默认实现了
 *        序列化。
 *
 * todo:序列化和反序列化
 *  1.序列化就是在保存数据时，保存数据的值和数据类型
 *  2.反序列化就是在恢复数据时，恢复数据的值和数据类型
 *  3.需要让某个对象支持序列化机制，则必须让其类是可序列化的，为了让某类是可序列化的，
 *    该类必须实现如下两个接口之一:
 *      1.Serializable  //推荐，标记接口，声明式，不用实现方法
 *      2.Externalizable //该接口需要实现方法
 */
public class ObjectInputStreamStudy {
    /**
     * 使用ObjectInputStream读取序列化文件实现反序列化
     * @param args
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePtah = "d:\\out.dat";
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePtah));
        //todo:读取(反序列化)的顺序需要和写入(序列化)的顺序一致,否则回报错
        int intDate = in.readInt();
        boolean b = in.readBoolean();
        char c = in.readChar();
        String s = in.readUTF();
        Dog dog = (Dog)in.readObject();
        in.close();
        System.out.println(intDate);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(dog);
        System.out.println("数据读取完毕");
    }
    /**
     *  todo  注意细节:
     *        1.读写顺序要一致
     *        2.要求实现序列化或反序列化对象，需要实现Serializable
     *        3.序列化类中建议添加SerialVersionUID,为了提高版本的兼容性
     *        4.序列化对象时，默认将里面所有属性都进行序列化，但除了static和transient修饰的成员
     *        5.序列化对象时，要求里面的属性也需要实现序列化接口
     *        6.序列化具备可继承性，也就是说如果某类已经实现了序列化，则它的所有子类也已经默认实现了
     *          序列化。
     */
    @Test
    public void test() throws IOException, ClassNotFoundException {
        String filePtah = "d:\\out2.dat";
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePtah));
        //todo:读取(反序列化)的顺序需要和写入(序列化)的顺序一致,否则回报错
        int intDate = in.readInt();
        boolean b = in.readBoolean();
        char c = in.readChar();
        String s = in.readUTF();
        Dog dog = (Dog)in.readObject();
        in.close();
        System.out.println(intDate);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(dog);
        System.out.println("数据读取完毕");
    }
}
