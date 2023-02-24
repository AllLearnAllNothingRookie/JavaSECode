package branchstructure.forstructure.exercise;

import java.util.Scanner;

/**
 * @Author AllLearnAllNothingRookie
 * @Date 2022/10/5 17:08
 * @Version 1.0
 * 利用for循环打印1~100之间所有是9的倍数的整数，统计个数及总数
 */
public class ForExercise01 {
    public static void main(String[] args) {
        //个数
        int count = 0;
        //和
        int sum = 0;
        //开始值
        int start = 0;
        System.out.println("请输入开始值:");
        Scanner input = new Scanner(System.in);
        start = input.nextInt();
        //结束值
        int end = 0;
        System.out.println("请输入结束值:");
        end = input.nextInt();
        //求倍数值
        int num = 0;
        System.out.println("请输入要求倍数的值:");
        num = input.nextInt();
        for (int i = start ;i <= end ;i ++){
            if (i % num == 0){
                count ++;
                sum += i;
            }
        }
        System.out.println(start + "到" + end+"之间是"+ num + "倍数的个数有:" + count + "个");
        System.out.println(start + "到" + end+"之间是"+ num + "倍数的总和为:" + sum);
    }
}
