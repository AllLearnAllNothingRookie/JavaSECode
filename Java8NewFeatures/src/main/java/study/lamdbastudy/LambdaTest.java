package study.lamdbastudy;

import java.util.Comparator;
import org.junit.Test;

/**
 * Lambda表达式的使用举例
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 16:06
 *
 */
public class LambdaTest {
    @Test
    public void test1(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };
        r1.run();
        System.out.println("=============使用lambda表达式==============");
        Runnable r2 = () -> System.out.println("我爱北京故宫");
        r2.run();
    }
    @Test
    public void test2(){
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,02);
            }
        };
        int reset1 = com.compare(12, 21);
        System.out.println(reset1);
        System.out.println("=============使用lambda表达式==============");
        Comparator<Integer> comparator = (o1,o2) -> Integer.compare(o1,o2);
        int compare = comparator.compare(12, 34);
        System.out.println(compare);
        System.out.println("========方法引用=======");
        Comparator<Integer> com3 = Integer ::compare;
        int compare1 = com3.compare(12, 12);
        System.out.println(compare1);
    }
}
