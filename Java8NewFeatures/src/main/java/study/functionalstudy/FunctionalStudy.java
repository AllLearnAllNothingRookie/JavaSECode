package study.functionalstudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.junit.Test;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 17:23
 * todo:函数式接口
 *      只包含一个抽象方法的接口，称为函数式接口
 *     可以通过Lambda表达式来创建该接口对象。(若Lambda表达式抛出一个受检异常(即非运
 *      行时异常)，那么该异常需要在目标接口抽象方法上进行声明)
 *     可以在一个接口上使用@FunctionalInterface注解，这样可以检查它是否是一个函数式
 *       接口。同时javadoc也会包含一条声明，说明这个接口是一个函数式接口。
 *     在java.util.function包下定义了 Java8的丰富的函数式接口
 *
 * todo: Java内置四大函数式接口
 *    函数式接口         参数类型        返回类型            用途
 *     Consumer<T>          T           void       对类型为T的对象应用操作，包含方法
 *      消费型接口                                       void accept(T t)
 *     Supplier<T>           无          T         返回类型为T的对象，包含方法
 *       供给型接口                                      T get()
 *     Function<T,R>          T           R        对类型为T的对象应用操作，并返回结果，结果是R类型的对象，包含方法
 *       函数型接口                                          R apply(T t)
 *     Predicate<T>           T          boolean    确定类型为T的对象是否满足某约束，并返回boolean值，包含方法
 *       断定型接口                                          boolean test(T t)
 *
 */
public class FunctionalStudy {
    @Test
    public void test1(){
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println(aDouble);
            }
        });
        //Lambda表达式
        happyTime(500,money -> System.out.println("消费：" + money));

    }
    public void happyTime(double money, Consumer<Double> con){
        con.accept(money);
    }
    @Test
    public void test2(){
        List<String> strings = Arrays.asList("北京", "南京", "天津", "东京", "普京", "哈哈");
        ArrayList<String> filterString = filterString(strings, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(filterString);
        //Lambda表达式
        ArrayList<String> list = filterString(strings, str -> str.contains("京"));
        System.out.println(list);

    }

    /**
     * 根据给定的规则过滤字符串
     * @param list
     * @param pre
     * @return
     */
    public ArrayList<String> filterString(List<String> list, Predicate<String> pre){
        ArrayList<String> filerList = new ArrayList<>();
        for (String s : list) {
            if (pre.test(s)){
                filerList.add(s);
            }
        }
        return filerList;
    }
}
