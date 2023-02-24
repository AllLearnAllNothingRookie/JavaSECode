package unidimensionalarray.study;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/11 20:33
 * 循环输入5个成绩保存到double数组中，并输出
 */
public class Array02 {
    public static void main(String[] args) {
        // 声明并开辟空间
        //第一种动态分配
        // double [] scores = new double[5];
        // 第二种动态分配方式  先声明在分配空间
        // 声明数组，此时scores 是null
        double [] scores;
        // 分配空间，可以存放数据
        scores = new double[5];
        Scanner input = new Scanner(System.in);
        //输入
        for (int i = 0;i < scores.length ;i ++){
            System.out.println("请输入" + (i + 1) + "个同学的成绩:");
            scores[i] = input.nextDouble();
        }
        //输出
        for (int i = 0;i < scores.length ;i ++){
            System.out.println("第" + (i + 1) +"个同学的成绩为:" + scores[i]);
        }
    }
}
