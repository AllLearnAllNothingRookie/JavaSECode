package branchstructure.forstructure.exercise;

import java.util.Scanner;

/**
 * @Author AllLearnAllNothingRookie
 * @Date 2022/10/5 17:19
 * @Version 1.0
 * 完成下列表达式输出
 *  0 + 5 = 5
 *  1 + 4 = 5
 *  2 + 3 = 5
 *  4 + 1 = 5
 *  5 + 0 = 5
 */
public class ForExercise02 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("请输入一个值:");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        for (int i =0;i <= num; i ++){
            System.out.println(i +" + " + (num - i) + " = " + num);
        }
    }
}
