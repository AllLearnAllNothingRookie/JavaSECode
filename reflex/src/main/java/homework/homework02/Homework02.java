package homework.homework02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 14:25
 * 利用Class类的forName方法得到File方法的构造器
 * 在控制台打印File类的所有构造器
 * 通过newInstance()方法创建File对象，并创建一个文件
 */
public class Homework02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //得到File的Class对象
        Class<?> fileClass = Class.forName("java.io.File");

        //得到File类的所有构造器
        Constructor<?>[] declaredConstructors = fileClass.getDeclaredConstructors();
       //将File类的构造器打印到控制台
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        //通过反射得到指定参数的构造器
        Constructor<?> constructor = fileClass.getConstructor(String.class);
        //通过构造器创建对象
        Object o = constructor.newInstance("d:\\myNew.txt");
        //通过反射得到创建文件的方法
        Method createNewFile = fileClass.getMethod("createNewFile");
        //调用方法，在磁盘上创建文件
        createNewFile.invoke(o);
        System.out.println("创建文件成功");
    }
}
