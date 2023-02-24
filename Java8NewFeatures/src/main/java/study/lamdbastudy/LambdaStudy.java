package study.lamdbastudy;

import java.util.Comparator;
import java.util.function.Consumer;
import org.junit.Test;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 16:29
 * todo: Lambda表达必须在函数式接口中使用
 *   1.举例： (o1,o2) -> Integer.compare(o1,02);
 *   2.格式：
 *       -> : lambda操作符 或 箭头操作符
 *       -> 左边: lambda形参列表,即原来方法中的形参列表，可以写参数类型，也可以省略
 *       -> 右边: lambda体，即原来方法的方法体
 *   3.Lambda表达式的本质: 作为函数式接口的实例
 *todo: 使用： 单条语句可以省略大括号
 *    语法格式1：  无参，无返回值
 *          Runnable r = () ->{System.out.println("语法格式1:外参无返回值");};
 *    语法格式2： Lambda 需要一个参数，但是没有返回值
 *          Consumer<String> con = (String str) -> {System.out.println(str);};
 *    语法格式3: 数据类型可以省略，因为编译器推断的出，称为”类型推断“
 *          Consumer<String> con = (str) -> {System.out.println(str);};
 *    语法格式4： Lambda若只需要一个参数时，参数的小括号可以省略
 *          Consumer<String> con = str -> {System.out.println(str);};
 *    语法格式5:  Lambda若需要两个或两个以上的参数，多条执行语句，并且有返回值
 *           Comparator<Integer> comparator1 = (o1,o2) -> {
 *             System.out.println("实现方法");
 *             return Integer.compare(o1,o2);
 *         };
 *     语法格式6:  当lambda体只有一条执行语句时，若有return或大括号，都可以省略
 *          Comparator<Integer> com = (o1,o2) -> Integer.compare(o1,o2);
 *    总结：
 *      -> 左边: lambda形参列表的参数类型可以省略(类型推断);
 *              如果参数列表只有一个参数则小括号也可以省略
 *      -> 右边: lambda体应该使用一对大括号包裹;如果lambda只有一条执行语句
 *              (可能时return语句),则可以省略大括号和return关键字,若省略大括号，则
 *              return关键字必须省略
 *
 * todo:函数式接口：
 *      函数式接口：如果一个接口中只声明了一个抽象方法，则次接口就称为函数式接口
 *
 */
public class LambdaStudy {
    /**
     * 语法格式1：  无参，无返回值
     */
    @Test
    public void test1(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("传统方式");
            }
        };
        runnable.run();
        //使用lambda表达式
        Runnable r = () -> {
            System.out.println("语法格式1:无参无返回值");
        };
        r.run();
    }

    /**
     * 语法格式2： Lambda 需要一个参数，但是没有返回值
     */
    @Test
    public void test2(){
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("alan");
        //使用lambda表达式
        Consumer<String> con = (String str) -> {
            System.out.println(str);
        };
        con.accept("lambda");
    }
    /**
     * 语法格式3： 数据类型可以省略，因为编译器推断的出，称为”类型推断“
     */
    @Test
    public void test3(){
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("alan");
        //使用lambda表达式
        Consumer<String> con = (str) -> {
            System.out.println(str);
        };
        con.accept("lambda");
    }
    /**
     * 语法格式4： Lambda若只需要一个参数时，参数的小括号可以省略
     */
    @Test
    public void test4(){
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("alan");
        //使用lambda表达式
        Consumer<String> con = str -> {
            System.out.println(str);
        };
        con.accept("lambda");
    }
    /**
     * 语法格式5:  Lambda若需要两个或两个以上的参数，多条执行语句，并且有返回值
     */
    @Test
    public void test5(){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("实现方法");
                return Integer.compare(o1,02);
            }
        };
        int compare1 = comparator.compare(23, 45);
        System.out.println(compare1);
        //使用Lambda表达式
        Comparator<Integer> comparator1 = (o1,o2) -> {
            System.out.println("实现方法");
            return Integer.compare(o1,o2);
        };
        int compare = comparator1.compare(45, 65);
        System.out.println(compare);
    }
    /**
     * 语法格式6:  当lambda体只有一条执行语句时，若有return或大括号，都可以省略
     */
    @Test
    public void test6(){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        System.out.println(comparator.compare(1,34));

        //使用Lambda表达式
        Comparator<Integer> com = (o1,o2) -> Integer.compare(o1,o2);
        System.out.println(com.compare(14, 12));
    }
}
