package branchstructure.switchstructure.exercise;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/23 15:36
 * @Version 1.0
 */
public class SwitchExercise02 {
    /**
     * 判断学生成绩 >= 60 输出几个 >60不及格
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生成绩:");
        double score = input.nextDouble();
        if (score < 0 || score > 100){
            System.out.println("很抱歉你输入的成绩不对");
        }else {
            switch ((int)(score / 60)){
                case  1 :
                    System.out.println("恭喜你。及格了！");
                break;
                default:
                    System.out.println("很遗憾你没有及格，下次继续努力!!!");
                    break;
            }
        }
    }
}
