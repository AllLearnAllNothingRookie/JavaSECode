package unidimensionalarray.study;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/12 22:08
 * 数组缩容之长度减少，数组长度不变
 */
public class ArrayReduce2 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8};
        Scanner input = new Scanner(System.in);
        //表示数组长度
        int length = array.length;
        while (true){
            System.out.println("是否要缩容:");
            char choice = input.next().charAt(0);
            if ('n' == choice || length == 1){
                break;
            }
            length --;
            System.out.println("缩容后的数组:");
            for (int i =0;i < length;i ++){
                System.out.print(array[i] + "\t");
            }
            System.out.println();
        }
        System.out.println("缩容结束");
        System.out.println("缩容后的数组:");
        for (int i =0;i < length;i ++){
            System.out.print(array[i] + "\t");
        }
    }
}
