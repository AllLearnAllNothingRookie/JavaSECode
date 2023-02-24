package branchstructure.whilestructure.exercise;

import java.util.Scanner;

/**
 * @Author AllLearnAllNothingRookie
 * @Date 2022/10/6 12:13
 * @Version 1.0
 * 使用后while打印40 - 200之间的偶数
 */
public class WhileExercise02 {
    public static void main(String[] args) {
        int start = 40;
        System.out.println("请输入开始值:");
        Scanner input = new Scanner(System.in);
        start = input.nextInt();
        int end =200;
        System.out.println("请输入结束值:");
        end = input.nextInt();
        System.out.println(start + "~" + end +"之间的偶数为:");
        int num = start;
        while (num <= end){
            if (num % 2 == 0){
                System.out.println(num);
            }
            num ++;
        }
    }
}
