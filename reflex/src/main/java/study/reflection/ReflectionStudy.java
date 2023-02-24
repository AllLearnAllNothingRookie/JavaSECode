package study.reflection;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/18 21:20
 * todo: 反射机制
 *      1.反射机制允许程序在执行期间借助Reflection API取得任何类的内部信息(比如
 *          成员变量、构造器、成员方法等)，并能操作对象的属性及方法。反射则设计模式
 *          和框架底层都会用到
 *      2.加载完类之后，在堆中就产生了一个Class类型的对象(一个类只有一个Class对象)
 *          ，这个对象包含了类的完整结构信息。通过这个对象得到类的结构。
 * todo: 反射机制可以完成
 *      1.在运行时判断任意一个对象所属的类
 *      2.在运行时构造任意一个类的对象
 *      3.在运行时得到任意一个类所具有的成员变量和方法
 *      4.在运行时调用任意一个对象的成员变量和方法
 *      5.生成动态代理
 *todo：反射相关的类：
 *      1.java.lang.Class: 代表一个类，Class对象表示某个类加载后在堆中的对象
 *      2.java.lang.reflect.Method: 代表类的方法
 *      3.java.lang.reflect.Field: 代表类的成员变量
 *      4.java.lang.reflect.Constructor: 代表类的构造方法
 *
 */
public class ReflectionStudy {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
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

        //java.lang.reflect.Field: 代表类的成员变量
        //getField:不能得到私有的属性
        Field nameFiled = aClass.getField("name");
        System.out.println(nameFiled.get(o));
        //java.lang.reflect.Constructor: 代表类的构造方法
        // getConstructor(): 无参构造器
        Constructor<?> constructor = aClass.getConstructor();
        System.out.println(constructor);
        // getConstructor(String.class)：有参构造器，传入对应参数的class对象
        Constructor<?> constructor1 = aClass.getConstructor(String.class);
        System.out.println(constructor1);

    }
}
