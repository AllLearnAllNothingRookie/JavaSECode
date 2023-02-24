package study.genericstudy.genericinheritanceandwildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/19 17:20
 * todo:泛型的继承和通配符
 *    1.泛型不具备继承性
 *    2.<?>:支持任意泛型类型
 *    3.<? extends A>: 支持A类以及A类的子类规定了泛型的上限
 *    4.<? super A>:支持A类以及A类的父类，不限于直接父类，规定了泛型的下限
 */
public class GenericInheritanceAndWildcard {
    public static void main(String[] args) {
        //泛型没有继承性
        //List<Object> list = new ArrayList<String>();
       List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<A> list3 = new ArrayList<>();
        List<B> list4 = new ArrayList<>();
        List<C> list5 = new ArrayList<>();
        //List<?>：表示任意的泛型类型都可以接收
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);
        //? extends  A：表示上限，可以接收A或A的子类
       // printCollection2(list1);
       // printCollection2(list2);
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);
       // ? super   A:支持A类以及A类的父类，不限于直接父类
        printCollection3(list1);
       // printCollection3(list2);
        printCollection3(list3);
        //printCollection3(list4);
        //printCollection3(list5);
    }
    //List<?>：表示任意的泛型类型都可以接收
    public static void printCollection1(List<?> c){
        for (Object o : c) {
            System.out.println(o);
        }
    }
    //? extends  A：表示上限，可以接收A或A的子类
    public static void printCollection2(List<? extends  A> c){
        for (Object o : c) {
            System.out.println(o);
        }
    }
    //? super   A:支持A类以及A类的父类，不限于直接父类
    public static void printCollection3(List<? super   A> c){
        for (Object o : c) {
            System.out.println(o);
        }
    }
}
