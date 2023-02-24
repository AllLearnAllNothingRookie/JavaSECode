package branchstructure.ifstructure.study;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/20 23:41
 * @Version 1.0
 */
public class LeapYear {
    /**
     * 输入一个年份判断式闰年还是平年
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个年份:");
        int year = input.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + "是闰年");
        }else {
            System.out.println(year + "是平年");
        }
    }
}
