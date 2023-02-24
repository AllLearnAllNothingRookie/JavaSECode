package operator.exercise;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/20 13:45
 * @Version 1.0
 */
public class ArithmeticOperatorExercise02 {
    /**
     * 华氏温度转摄氏温度  公式: 摄氏温度 =   5 / 9 * (华氏温度 - 100)
     */
    public static void main(String[] args) {
        double k = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入华氏温度:");
        k = input.nextDouble();
        double c = 5.0 / 9.0 * (k - 100);
        System.out.println("华氏温度:" +  k + "对应的摄氏温度计是:" + c);
    }
}
