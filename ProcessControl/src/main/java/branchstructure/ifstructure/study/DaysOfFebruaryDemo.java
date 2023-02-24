package branchstructure.ifstructure.study;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/20 23:23
 * @Version 1.0
 */
public class DaysOfFebruaryDemo {
    /**
     * 用键盘输入一个年份，得到该年2月份的天数
     */
    public static void main(String[] args) {
        int days = 28;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = input.nextInt();
        //闰年判断
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            //闰年天数是29天
            days = 29;
           // days ++;
        }
        System.out.println(year + "年的2月有" + days +"天");

    }
}
