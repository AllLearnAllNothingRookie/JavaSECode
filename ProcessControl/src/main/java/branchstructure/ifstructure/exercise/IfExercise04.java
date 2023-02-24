package branchstructure.ifstructure.exercise;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/21 19:02
 * @Version 1.0
 */
public class IfExercise04 {
    /**
     * 请输入芝麻信用分：
     * 信用分为100分时，输出信用极好
     * 信用分为(80,99]时，输出信用优秀
     * 信用分为【60，80)时，输出信用一般
     * 其他情况，输出信用不结果
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的信用分:");
        int score = input.nextInt();
        if (score > 0 &&  score <= 100){
            if (score == 100) {
                System.out.println("信用极好");
            }else  if (score > 80 && score <= 99){
                System.out.println("信用优秀");
            }else  if (score > 60 && score < 80){
                System.out.println("信用一般");
            }else {
                System.out.println("信用不及格");
            }
        }else {
            System.out.println("你的输入不符合");
        }

    }
}
