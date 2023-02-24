package study.reflection.classstudy;

import java.time.Month;
import java.util.Comparator;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 14:08
 */
public class ClassTest2 {
    public static void main(String[] args) {
        //基本数据类型
        Class<Integer> integerClass = int.class;
        //void类型
        Class<Void> voidClass = void.class;
        //类
        Class<String> stringClass = String.class;
        //类
        Class<Object> objectClass = Object.class;
        //类
        Class<Class> classClass = Class.class;
        //接口
        Class<Comparator> comparatorClass = Comparator.class;
        //注解
        Class<Override> overrideClass = Override.class;
        //枚举
        Class<Month> monthClass = Month.class;
        //对于数组： 只要元素类型与维度一样，就是同一个class对象
        Class<int[]> cls1 = int[].class;
        int[] arr1 = new int[5];
        int[] arr2 = new int[10];
        System.out.println(cls1 == arr2.getClass());
        System.out.println(cls1 == arr1.getClass());
        //如果元素类型或维度不一样，就不是同一个Class对象
        Class<String[]> cls2 = String[].class;
        Class<int[][]> cls3 = int[][].class;
        System.out.println(cls1.equals(cls2));
        System.out.println(cls1 .equals(cls3));
    }
}
