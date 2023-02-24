package alanrookie.homework.homework06;

import java.rmi.ServerException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 19:22
 * 提供一个Cale类，其中定义两个变量表示操作数，定义四个方法实
 * 现求和、差、乘、商(要求除数为0的话提示)，并创建两个对象，分别测试
 */
public class Cale {
    double num1;
    double num2;
    public Cale(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * 两个操作数求和
     * @return 返回和
     */
    public double add(){
        return  num1 + num2;
    }

    /**
     * 求两个操作数的差
     * @return 返回差
     */
    public double diff(){
        return  num1 - num2;
    }

    /**
     * 求两个操作数的乘积
     * @return 返回乘积
     */
    public double ride(){
        return num1 * num2;
    }

    /**
     * 求两个数的商
     * @return
     */
    public Double merchant(){
        if (num2 == 0){
            System.out.println("除数不能为0");
            return null;
        }
        return num1 / num2;
    }
}
