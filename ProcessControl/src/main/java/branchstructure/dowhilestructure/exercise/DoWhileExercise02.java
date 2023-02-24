package branchstructure.dowhilestructure.exercise;

import java.util.Scanner;
import sun.security.util.AuthResources_it;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/6 12:41
 * 统计1-200 之间能被5整除但不能被3整除的个数
 */
public class DoWhileExercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = 1;
        System.out.println("请输入开始值:");
        start = input.nextInt();
        int end = 200;
        System.out.println("请输入结束值:");
        end = input.nextInt();
        int num1 = 3;
        System.out.println("请输入不能整除的数:");
        num1 = input.nextInt();
        int num2 = 5;
        System.out.println("请输入可以整数的主");
        num2  = input.nextInt();
        int index = start;
        int count = 0;
        do {
            if (index % num2 == 0 && index % num1 != 0){
                System.out.println(index);
                count ++;
            }
            index ++;
        }while (index <= end);
        System.out.println(start + "~" + end + "之间可以被" + num2 + "整除但不能被" + num1 +"整除的个数为:" + count);
    }
}
