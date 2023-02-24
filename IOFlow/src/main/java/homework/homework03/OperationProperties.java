package homework.homework03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 11:24
 * 要求编写一个dog.properties
 *  name=tom
 *  age=5
 *  color=red
 *  编写Dog类(name,age,color)，创建一个dog对象，读取dog.properties用相应内容完成初始化
 *  并输出
 */
public class OperationProperties {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Properties properties = new Properties();
        //将配置文件加载到Properties
        properties.load(new FileReader("D:\\code\\project\\JavaSECode\\IOFlow\\src\\main\\resources\\dog.properties"));
        //获取Properties中的k-v对
        String name = properties.getProperty("name");
        int age = Integer.parseInt(properties.getProperty("age"));
        String color = properties.getProperty("color");
        //如果配置文件里没该属性则返回null
        String pwd = properties.getProperty("pwd");
        System.out.println(pwd);
        //将读取到的信息保存到对象中
        Dog dog = new Dog(name,age,color);
        System.out.println(dog);
        //对对象进行序列化保存
        ObjectOutputStream oos = null;
       try {
           oos = new ObjectOutputStream(new FileOutputStream("d:\\dog.dat"));
           oos.writeObject(dog);
           oos.close();
           System.out.println("序列化完成");
       }finally {
           if (oos != null){
               oos.close();
           }
       }
       //反序列化
        ObjectInputStream ois = null;
       try {
           ois = new ObjectInputStream(new FileInputStream("d:\\dog.dat"));
           Dog dogDat = (Dog) ois.readObject();
           System.out.println("反序列化完成：");
           System.out.println(dogDat);
       }finally {
           if (ois != null){
               ois.close();
           }
       }

    }
}
