package study.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import study.introduce.Cat;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/19 14:13
 * todo: 反射优点和缺点
 *      1.优点： 可以动态的创建和使用对象(也是框架底层核心),使用灵活，没有反射机制，
 *          框架技术就失去了底层支持
 *      2.缺点： 使用反射基本就是解释执行，对执行速度有影响
 *
 *todo: 发射优化：
 *      1. Method和Field、Constructor对象都有setAccessible()方法
 *      setAccessible的作用时启动和禁止范文安全检查开关
 *      参数值为true表示 反射的对象在使用时取消访问检查，提高反射的效率
 *      参数值为false表示反射的对象执行访问检查
 */
public class ReflectionOptimization {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        method1();
        method2();
        method3();
    }

    /**
     * 传统方法调用方法
     */
    public static void method1(){
        Cat ca = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0;i <= 9000000;i ++){
            ca.method();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法耗时：" + (end - start));
    }
    /**
     * 通过反射调用方法
     */
    public static void method2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> cls = Class.forName("study.introduce.Cat");
        //创建一个对象
        Object o = cls.newInstance();
        //得到对象的方法
        Method method = cls.getMethod("method");
        long start = System.currentTimeMillis();
        for (int i = 0;i <= 9000000;i ++){
            method.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("通过反射调用方法耗时:" + (end - start));

    }

    /**
     * 通过反射调用方法-- 取消访问检查
     */
    public static void method3() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> cls = Class.forName("study.introduce.Cat");
        //创建一个对象
        Object o = cls.newInstance();
        //得到对象的方法
        Method method = cls.getMethod("method");
        method.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0;i <= 9000000;i ++){
            method.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("通过反射取消访问检查调用方法耗时:" + (end - start));

    }
}
