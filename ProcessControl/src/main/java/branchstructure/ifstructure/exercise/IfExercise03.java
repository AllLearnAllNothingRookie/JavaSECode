package branchstructure.ifstructure.exercise;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/21 18:15
 * @Version 1.0
 */
public class IfExercise03 {
    /**
     * 判断一个年份是否为闰年: 闰年: 年份能被4整除但不能被100整除或年份能被400整除
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个年份:");
        int year = input.nextInt();
        if ((year % 4 == 0 && year % 100 !=0) || year % 400 == 0){
            System.out.println(year + "年是闰年");
        }else {
            System.out.println(year + "年不是闰年");
        }
    }
}
