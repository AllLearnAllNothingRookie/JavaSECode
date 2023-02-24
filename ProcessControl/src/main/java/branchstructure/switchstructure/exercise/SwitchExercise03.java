package branchstructure.switchstructure.exercise;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/23 15:42
 * @Version 1.0
 */
public class SwitchExercise03 {
    /**
     * 根据月份输出季节 3、4、5 春季 6、7、8 夏季 9、10、11 秋季 12、1、2 冬季
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入月份:");
        int month = input.nextInt();
            switch (month){
                case 3:
                case 4:
                case 5:
                    System.out.println("春季");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("夏季");
                    break;
                case 9:
                case  10:
                case 11:
                    System.out.println("秋季");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("冬季");
                    break;
                default:
                    System.out.println("很抱歉你输入的月份不正确!!!");
                    break;

            }
        }

}
