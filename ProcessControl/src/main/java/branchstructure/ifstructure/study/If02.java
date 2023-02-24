package branchstructure.ifstructure.study;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/21 17:56
 * @Version 1.0
 */
public class If02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的年龄:");
        int age = input.nextInt();
        if (age >= 18){
            System.out.println("你已经成年了，要对自己的的行为负责");
        }else {
            System.out.println("你还没有成年");
        }
    }
}
