package branchstructure.homework;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/8 21:14
 *  输入一个年份判断暖是否为闰年
 */
public class HomeWork03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个年份:");
        int year = input.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + "是闰年");
        }else {
            System.out.println(year + "不是闰年");
        }
    }
}
