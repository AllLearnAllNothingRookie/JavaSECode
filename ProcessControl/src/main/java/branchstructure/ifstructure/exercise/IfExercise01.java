package branchstructure.ifstructure.exercise;

import javax.crypto.spec.PSource;
import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/21 18:06
 * @Version 1.0
 */
public class IfExercise01 {
    /**
     * 编写程序声明两个变量并赋值，如果第一个数大于10.0且第二个数小于20.0则大于两个数的和
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数的值:");
        double num1 = input.nextDouble();
        System.out.println("请输入第二个数的值:");
        double num2 = input.nextDouble();
        if (num1 >= 10.0 && num2 <= 20.0){
            System.out.println(num1 + num2);
        }
    }
}
