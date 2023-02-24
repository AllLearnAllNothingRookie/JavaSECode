package branchstructure.ifstructure.exercise;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/21 19:44
 * @Version 1.0
 */
public class IfExercise05 {
    /**
     * 出票系统：
     *  4 - 10旺季:
     *      成人 (18-60): 60
     *      儿童 (< 18)： 半价
     *      老人 (> 60): 1/3
     *  淡季:
     *      成人 ： 40
     *      其他 : 20
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入月份:");
        int mouth = input.nextInt();
        if (mouth > 0 && mouth <= 12){
            System.out.println("请输入年龄:");
            int age = input.nextInt();
           if (age >= 0 && age <= 120){
               if (mouth >= 4 && mouth <= 10){
                   double price  = 60.0;
                   if(age <= 18){
                       System.out.println("票价为:" + price / 2);
                   }else if (age > 18 && age <= 60){
                       System.out.println("票价为:" + price);
                   }else {
                       System.out.println("票价为:" + price / 3);
                   }
               }else {
                    double price = 40;
                    if (age > 18 && age <= 60){
                        System.out.println("票价为:" + price);
                    }else {
                        System.out.println("票价为:" + price / 2);
                    }
               }
           }else {
               System.out.println("年龄输入错误");
           }
        }else {
            System.out.println("月份输入错误");
        }
    }
}
