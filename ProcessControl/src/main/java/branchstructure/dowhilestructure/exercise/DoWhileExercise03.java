package branchstructure.dowhilestructure.exercise;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/6 12:48
 * 使用do……while询问还钱吗
 */
public class DoWhileExercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("打一顿");
            System.out.println("还钱吗?y/n");
            String answer = input.next();
            char result = answer.charAt(0);
            if (result == 'y'){
                break;
            }
        }while (true);
        System.out.println("要钱成功");
    }
}
