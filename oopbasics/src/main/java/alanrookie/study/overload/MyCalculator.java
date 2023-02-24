package alanrookie.study.overload;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/9 20:23
 * 方法重载
 *      1.方法名相同，参数列表不同
 *      2.参数名不同： 参数的个数不同，参数的顺序不同，参数的类型不同
 *      3.返回值类型不会影响方法重载[返回类型可以相同也可以不同]
 *      4.参数名不同不是方法重载
 *      5.当没有相同参数类型的方法时会发生自动类型转换匹配能自动转换的方法，
 *         但是如果有类型相同的方法时先匹配参数类型相同的方法
 *         案例见方法重载练习
 */
public class MyCalculator {
    /**
     * 计算两个整数的和
     * @param n1
     * @param n2
     * @return
     */
    public int calculator(int n1,int n2){
        return n1 + n2;
    }
    /*
    错误，不是方法的重载而是重复定义
    public int calculator(int num1,int num2){
        return n1 + n2;
    }
    */
    /**
     * 计算一个整数一个浮点数的和
     * @param n1
     * @param n2
     * @return
     */
    public double calculator(int n1,double n2){
        return n1 + n2;
    }

    /**
     * 计算一个浮点数和一个整数的和
     * @param n1
     * @param n2
     * @return
     */
    public double calculator(double n1, int n2){
        return  n1 + n2;
    }

    /**
     * 计算三个整数的和
     * @param n1
     * @param n2
     * @param n3
     * @return
     */
    public int calculator(int n1,int n2,int n3){
        return n1 + n2 + n3;
    }
}
