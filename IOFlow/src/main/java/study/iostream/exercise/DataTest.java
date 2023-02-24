package study.iostream.exercise;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/10 14:15
 * 存储如下一组数据到game.dat 文件中，并在后面使用时可以重新读取。
 * String name="巫师";
 * int age = 300;
 * char gender ='男';
 * int energy = 5000;
 * double price =75.5;
 * boolean relive = true;
 */
public class DataTest {
    public static void main(String[] args) throws IOException {
        save();
        reload();
    }

    /**
     * 写入数据
     */
    public static  void save() throws IOException {
        String name="巫师";
        int age = 300;
        char gender ='男';
        int energy = 5000;
        double price =75.5;
        boolean relive = true;
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("d:\\game.dat"));
        dataOutputStream.writeUTF(name);
        dataOutputStream.writeInt(age);
        dataOutputStream.writeChar(gender);
        dataOutputStream.writeInt(energy);
        dataOutputStream.writeDouble(price);
        dataOutputStream.writeBoolean(relive);
        dataOutputStream.flush();
        dataOutputStream.close();
        System.out.println("写入成功");
    }
    /**
     * 读取数据
     */
    public static  void reload() throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("d:\\game.dat"));
        try {
            String name=dataInputStream.readUTF();
            int age = dataInputStream.readInt();
            char gender = dataInputStream.readChar();
            int energy = dataInputStream.readInt();
            double price = dataInputStream.readDouble();
            boolean relive = dataInputStream.readBoolean();
            System.out.println(name + "," + age + "," + gender + "," +
                    energy + "," + price + "," + relive);
        }finally {
            if (dataInputStream != null){
                dataInputStream.close();
            }
        }
    }
}
