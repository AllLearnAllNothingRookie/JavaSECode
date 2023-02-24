package study.introduce;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/18 20:25
 * 反射问题的引入
 * 根据配置文件，创建类并调用方法
 */
public class Introducereflex {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Properties properties = new Properties();
        //从配置文件中读取内容
        properties.load(new FileReader("D:\\code\\project\\JavaSECode\\reflex\\src\\main\\resources\\re.properties"));
        String classFullPath = properties.getProperty("classfullpath");
        String method = properties.getProperty("method");
        System.out.println(classFullPath);
        System.out.println(method);
        //通过反射创建对象
        // 1.加载类
        Class<?> aClass = Class.forName(classFullPath);
        //2。 通过aClass对象得到加载的类的对象实例
        Object o = aClass.newInstance();
        System.out.println(o.getClass());
        //3.通过aClass得到加载类的方法 即在反射中可以将方法视为对象 --- 万物皆对象
        Method method1 = aClass.getMethod(method);
        // 4.通过method1调用方法： 即通过方法对象来实现调用方法
        method1.invoke(o);

    }
}
