package twodimensional.exercise;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/16 21:52
 * 打印10行的杨辉三角
 */
public class TwoDimensionalArrayExercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要打印杨辉三角的行数:");
        int cols = input.nextInt();
        if (cols <= 0){
            System.out.println("行数输入不合法");
        }else {
            int [][] array = new int[cols][];
            //为杨辉三角赋值
            for (int i = 0;i < array.length;i ++){
                // 给每个一维数组开辟空间
                array[i] = new int[i + 1];
                for ( int j = 0;j < array[i].length;j ++){
                    // 杨辉三角规律
                   // if (i == 0 || i == 1 || j == 0 || j == array[i].length - 1){
                    if ( j == 0 || j == array[i].length - 1){
                        array[i][j] = 1;
                    }else {
                        array[i][j] = array[ i - 1][j - 1] + array[i -1][j];
                    }
                }
            }
            //打印
            for (int i = 0;i < array.length;i ++){
                for (int j = 0;j < array[i].length;j ++){
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
