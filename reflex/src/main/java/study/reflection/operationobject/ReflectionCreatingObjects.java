package study.reflection.operationobject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 10:27
 * todo: 通过反射创建对象
 *      1.方法1： 调用类中的public修饰的无参构造器
 *      2.方法2： 调用类中的指定构造器
 *    Class常用方法
 *      newInstance: 调用类中的无参构造器，获取对应类的对象
 *      getConstructor(Class... clazz):根据参数列表，获取对应的构造器对象
 *      getDeclaredConstructor(Class... clazz):根据参数列表，获取对应的构造器对象
 *   Constructor：
 *       setAccessible：将此对象的 accessible标志设置为指示的布尔值。
 *       newInstance(Object... initargs) ：使用此 Constructor对象表示的构造函数，使用指定的初始化参数来创建和初始化构造函数的声明类的新实例。
 *
 */
public class ReflectionCreatingObjects {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //获取Class对象
        Class<?> cls = Class.forName("study.reflection.operationobject.User");
        //1.通过public的无参构造器创建对象
        Object o = cls.newInstance();
        System.out.println(o);
        //2.通过public的有参构造器创建对象
        //得到对应参数列表的构造器
        /**
         * 即constructor 表示
         * public User(String name,int age ) {
         *         this.age = age;
         *         this.name = name;
         *     }
         */
        //只能得到public修饰的构造器
        Constructor<?> constructor = cls.getConstructor(String.class,int.class);
        //通过构造器创建对象
        Object alan = constructor.newInstance("alan",24);
        System.out.println(alan);
        //3.通过非public的有参构造器创建对象
        //获取对应参数的构造器(包括私有构造器)
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(String.class);
        //setAccessible(true):[爆破] 使用反射可以使用私有的成员
        declaredConstructor.setAccessible(true);
        Object tom = declaredConstructor.newInstance("tom");
        System.out.println(tom);
    }
}
