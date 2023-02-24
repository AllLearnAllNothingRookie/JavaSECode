package study.polymorphic.study.objectanalysis.equals;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/28 22:19
 *  todo: equals方法:
 *      == 与 equals方法的对比:
 *       == 是一个关系运算符
 *          1. ==: 既可以判断基本类型，有可以判断引用类型
 *          2. == ： 如果判断基本类型，判断的是值是否相等
 *          3. ==：如果判断的是引用类型，判断的是地址是否相等，即判断是不是同一个对象
 *       equals:是一个方法
 *          1.equals:是Object类中的方法，只能判断引用类型
 *          2.默认判断的是地址是否相等，子类中往往重写该方法用于判断内容是否相等
 *              如：包装类，String
 */
public class Equals {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = a;
        //todo:==：如果判断的是引用类型，判断的是地址是否相等，即判断是不是同一个对象
        //true
        System.out.println(a == b);
        //true
        System.out.println(a == c);
        //true
        System.out.println(b == c);
        A d = new A();
        //false
        System.out.println(a == d);
        // todo:== 比较的是地址，只要两个对象地址相等则返回true
        B b1 = new B();
        A a1 = b1;
        //true
        System.out.println(b1 == a1);

        //todo:equals:是Object类中的方法，只能判断引用类型
        System.out.println("hello".equals("abc"));
        Integer i1 = new Integer(5);
        Integer i2 = new Integer(5);
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }
}
