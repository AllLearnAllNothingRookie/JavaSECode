package branchstructure.mulforstructure;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/9 21:09
 * 打印金字塔
 */
public class Stars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入行数:");
        int colNum = input.nextInt();
        //打印一个三角形
        for (int i = 1;i <= colNum;i ++){
            for (int j = 1;j <= i;j ++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //打印三角形
        for (int i = 1;i <= colNum;i ++){
            for (int j = 1;j <= (colNum - i );j ++){
                System.out.print(" ");
            }
            for (int j = 1;j <= (2 * i - 1);j ++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // 打印空心金字塔
        for (int i = 1;i <= colNum;i ++){
            for (int j = 1;j <= (colNum - i );j ++){
                System.out.print(" ");
            }
            for (int j = 1;j <= (2 * i - 1);j ++){
                if (j == 1 || j == (2 * i - 1) || i== colNum ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //空心菱形
        for (int i = 1;i <= colNum;i ++){
            for (int j = 1;j <= (colNum - i );j ++){
                System.out.print(" ");
            }
            for (int j = 1;j <= (2 * i - 1);j ++){
                if (j == 1 || j == (2 * i - 1)  ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1;i <= (colNum - 1); i ++ ){
            for (int j = 1;j <= i;j ++){
                System.out.print(" ");
            }
            for (int j = 1;j <= ((2 * (colNum - 1)) - (i * 2) + 1) ;j ++){
                if (j == 1 || j == ((2 * (colNum - 1)) - (i * 2) + 1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
