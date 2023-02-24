package study.reflection.classstudy;

import java.io.Serializable;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/19 16:41
 * todo: 那些类型有Class对象
 *  1.外部类，成员内部类，静态内部类，局部内部类，匿名内部类
 *  2.interface ： 接口
 *  3.数组
 *  4.enum ： 枚举
 *  5.annotation ： 注解
 *  6.基本数据类型
 *  7.void
 */
public class AllTypeClass {
    public static void main(String[] args) {
        //外部类
        Class<String> stringClass = String.class;
        //接口
        Class<Serializable> serializableClass = Serializable.class;
        //数组
        Class<Integer[]> aClass = Integer[].class;
        //二维数组
        Class<Integer[][]> aClass1 = Integer[][].class;
        //注解
        Class<Deprecated> deprecatedClass = Deprecated.class;
        //枚举
        Class<Thread.State> stateClass = Thread.State.class;
        //基本数据类型
        Class<Integer> integerClass = int.class;
        //包装类
        Class<Character> characterClass = Character.class;
        //void
        Class<Void> voidClass = void.class;
        //Class类型
        Class<Class> classClass = Class.class;

    }
}
