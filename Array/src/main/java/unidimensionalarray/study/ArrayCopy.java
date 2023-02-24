package unidimensionalarray.study;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/12 19:55
 * 数组拷贝
 */
public class ArrayCopy {
    public static void main(String[] args) {
        //将数组1拷贝到数组2中
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数组的长度:");
        int len = input.nextInt();
        int [] array = new int[len];
        for (int i = 0;i < array.length;i ++){
            System.out.println("请输入数组第" + i + "个元素的值:");
            array[i] = input.nextInt();
        }
        //新建一个数组实现数组拷贝
        int [] newArray = new int[array.length];
        for (int i =0;i < array.length;i ++){
            newArray[i] = array[i];
        }
        System.out.println();
        System.out.println("打印源数组:");
        for (int i = 0;i < array.length;i ++){
            System.out.print(array[i] + "\t");
        }

        System.out.println("\n打印拷贝后数组:");
        for (int i = 0;i < newArray.length;i ++){
            System.out.print(newArray[i] + "\t");
        }
        //修改拷贝后的数组:
        newArray[0] = 34;
        System.out.println("\n打印源数组:");
        for (int i = 0;i < array.length;i ++){
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n打印拷贝后数组:");
        for (int i = 0;i < newArray.length;i ++){
            System.out.print(newArray[i] + "\t");
        }
    }
}
