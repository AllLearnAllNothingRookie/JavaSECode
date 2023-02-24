package alanrookie.study.overload;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/9 20:27
 */
public class MyCalculatorTest {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.println("两个整数的和:" + myCalculator.calculator(10,20));
        System.out.println("一个整数集合一个浮点数的和:" + myCalculator.calculator(10,20.5));
        System.out.println("一个浮点数和一个整数的和:" + myCalculator.calculator(10.8,20));
        System.out.println("三个整数的和:" + myCalculator.calculator(10,20,30));
    }
}
