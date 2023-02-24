package study.exercise;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/28 21:35
 * 如果用户输入的不是整数则提示反复输入，直到输入一个整数为止
 */
public class TryExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("请输入一个整数:");
        while (true){
            String str = input.next();
            try{
                num =  Integer.parseInt(str);
                break;
            }catch (Exception e){
                System.out.println("你输入的数不是一个整数。");
                System.out.println("请输入一个整数:");

            }
        }
        System.out.println("输入的整数为:"   + num);
    }
}
