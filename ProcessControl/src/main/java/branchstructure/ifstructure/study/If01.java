package branchstructure.ifstructure.study;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/21 10:58
 * @Version 1.0
 */
public class If01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年龄:");
        int age = input.nextInt();
        if (age >= 18){
            System.out.println("你已经成年了，要对自己的行为负责！");
        }
    }
}
