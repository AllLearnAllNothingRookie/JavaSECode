package branchstructure.dowhilestructure.exercise;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/6 12:37
 * 打印1 -100
 */
public class DoWhileExercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = 1;
        System.out.println("请输入起始值:");
        start = input.nextInt();
        int end = 100;
        System.out.println("请输入截至值:");
        end = input.nextInt();
        int num = start;
        int sum = 0;
        System.out.println(start + "~" + end + "之间的整数为:");
        do {
            System.out.println(num);
            sum += num;
            num ++;
        }while (num <= end);
        System.out.println(start + "~" + end +"之间所有整数和为:" + sum);
    }
}
