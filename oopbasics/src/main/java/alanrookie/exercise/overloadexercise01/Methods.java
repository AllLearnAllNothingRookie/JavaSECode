package alanrookie.exercise.overloadexercise01;

import javax.swing.plaf.PanelUI;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/9 21:05
 *   类中定义三个重载方法并调用，方法名为m，三个方法分别接收一个int参数，两个int参数，
 *   一个字符串参数，分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息
 *   定义三个重载方法max，第一个方法返回两个int值中最大的值，第二个方法返回两个double中
 *   最大值，第三个方法返回三个double中最大值
 */
public class Methods {
    /**
     * 执行平方运算并输出结果
     * @param num
     * @return
     */
    public void m(int num){
        System.out.println(num + "的平方为:" + num * num);
    }

    /**
     * 相乘并输出结果
     * @param num1
     * @param num2
     */
    public void m(int num1,int num2){
        System.out.println(num1 + "*" + num2 + "的结果为:" + (num1 * num2));
    }

    /**
     * 输出字符串信息
     * @param msg
     */
    public void m(String msg){
        System.out.println(msg);
    }

    /**
     * 返回两个int值中最大的值
     * @param num1
     * @param num2
     * @return
     */
    public int max(int num1,int num2){
        return num1 > num2 ? num1 : num2;
    }

    /**
     * 返回两个double值中最大的值
     * @param num1
     * @param num2
     * @return
     */
    public double max(double num1,double num2){
        return num1 > num2 ? num1 : num2;
    }

    /**
     * 返回三个double中最大值
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public double max(double num1,double num2,double num3){
        return ( num1 > num2 ? num1 : num2) > num3 ?  num1 > num2 ? num1 : num2 : num3;
    }
}
