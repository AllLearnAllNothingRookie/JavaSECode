package branchstructure.ifstructure.exercise;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/21 18:11
 * @Version 1.0
 */
public class IfExercise02 {
    /**
     * 定义两个变量int，判断二者的和，是否能被3整除，又能被5整除
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数的值:");
        int  num1 = input.nextInt();
        System.out.println("请输入第二个数的值:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        if (sum % 3 == 0 && sum % 5 == 0){
            System.out.println("两个数的和既能被3整除又能被5整除");
        }else {
            System.out.println("两个数的和不能被3和5整除");
        }
    }
}
