package branchstructure.homework;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/8 21:11
 * 实现判断一个整数属于那个范围: 大于零 等于零 小于零
 */
public class HomeWork02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数:");
        int num = input.nextInt();
        if (num > 0){
            System.out.println("大于零");
        }else if (num < 0){
            System.out.println("小于零");
        }else {
            System.out.println("等于零");
        }
    }
}
