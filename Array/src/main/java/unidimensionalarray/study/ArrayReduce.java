package unidimensionalarray.study;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/12 21:54
 * 数组缩容
 */
public class ArrayReduce {
    /**
     * 数组缩容，当数组长度为1或者是输入为n时退出
     * @param args
     */
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,5,34,2};
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("是否要缩容:");
            char choice = input.next().charAt(0);
            if (choice == 'n' || array.length == 1){
                break;
            }
            int [] newArray = new int[array.length - 1];
            for (int i = 0;i < newArray.length;i ++){
                newArray[i] = array[i];
            }
            array = newArray;
            System.out.println("缩容后的数组为:");
            for (int i = 0;i < array.length;i ++){
                System.out.print(array[i] + "\t");
            }
            System.out.println();
        }
        System.out.println("缩容结束");
        System.out.println("缩容后的数组为:");
        for (int i = 0;i < array.length;i ++){
            System.out.print(array[i] + "\t");
        }
    }
}
