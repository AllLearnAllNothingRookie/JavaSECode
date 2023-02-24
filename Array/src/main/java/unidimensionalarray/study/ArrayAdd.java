package unidimensionalarray.study;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/12 21:07
 * 数组扩容
 */
public class ArrayAdd {
    /**
     * 向一个数组循环添加一个元素当输入n是退出添加
     * @param args
     */
    public static void main(String[] args) {
        int [] array = {1,2,3};
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("是否继续添加元素:");
            char choice = input.next().charAt(0);
            if (choice == 'n'){
                break;
            }
            int [] newArray = new int[array.length + 1];
            System.out.println("请输入要添加的值:");
            newArray[array.length] = input.nextInt();
            for (int i = 0;i  < array.length ;i ++){
                newArray[i] = array[i];
            }
            array = newArray;
            System.out.println("添加元素后的数组:");
            for (int i = 0;i < array.length;i ++){
                System.out.print(array[i] + "\t");
            }
            System.out.println();
        }
        System.out.println("元素添加结束");
    }
}
