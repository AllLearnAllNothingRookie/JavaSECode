package operator.exercise;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/20 13:37
 * @Version 1.0
 */
public class ArithmeticOperatorExercise01 {
    /**
     * 假如还有59天放假，问合计XX个星期零XX天
     */
    public static void main(String[] args) {
        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入天数:");
        num = input.nextInt();
        int week = num / 7;
        int day = num % 7;
        System.out.println(num + "天合计是" + week + "周" + day + "天");
    }
}
