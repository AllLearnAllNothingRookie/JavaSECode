package unidimensionalarray.exercise;

import com.sun.corba.se.impl.oa.toa.TOA;
import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/11 21:25
 * 求出一个数组的和和平均值
 */
public class ArrayExercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数组的长度:");
        //数组长度
        int len = input.nextInt();
        //数组
        int [] array = new int[len];
        //数组总和
        int total = 0;
        //数组平均值
        double avg = 0;
        //为数组赋值
        for (int i = 0;i < array.length;i ++){
            System.out.println("请输入第" + (i + 1) +"个元素的值:");
            array[i] = input.nextInt();
        }
        //求数组的总和
        for (int i = 0;i < array.length;i ++){
            total += array[i];
        }
        //求数组的平均值
        avg = total / array.length;
        System.out.println("数组的和为" + total);
        System.out.println("数组的平均值为:" + avg);

    }
}
