package branchstructure.whilestructure.exercise;

import java.util.Scanner;

/**
 * @Author AllLearnAllNothingRookie
 * @Date 2022/10/6 12:08
 * @Version 1.0
 * 打印1-100之间所有能被3整数的数
 */
public class WhileExercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = 1;
        System.out.println("请输入开始值:");
        start = input.nextInt();
        int end = 100;
        System.out.println("请输入结束值:");
        end = input.nextInt();
        int num = 3;
        System.out.println("请输入要求的倍数的值:");
        num = input.nextInt();
        int index = start;
        System.out.println(start + "~" + end +"之间能被" + num + "整除的数为:");
        while (index <= end){
            if (index % num == 0){
                System.out.println(index);
            }
            index ++;
        }
    }
}
