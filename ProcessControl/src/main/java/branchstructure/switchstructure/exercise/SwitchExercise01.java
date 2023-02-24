package branchstructure.switchstructure.exercise;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/23 15:29
 * @Version 1.0
 */
public class SwitchExercise01 {
    /**
     * 把a、b、c、d、e转换为大写，其他输入输出other
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符:");
        char ch = input.next().charAt(0);
        String  upper = "other";
        switch (ch){
            case 'a':
                upper = "A";
                break;
            case 'b':
                upper = "B";
                break;
            case 'c':
                upper = "C";
                break;
            case 'd':
                upper = "D";
                break;
            case 'e':
                upper = "E";
                break;
            default:
                upper = "other";
                break;
        }
        System.out.println("转换后:" + upper);
    }
}
