package homework;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/17 20:22
 * 已知有一个升序数组，要求插入一个元素后数组依然升序
 */
public class HomeWork01 {
    public static void main(String[] args) {
        int [] array = {10,12,45,90};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int num = input.nextInt();
        //查找该元素存放的位置
        int index = -1;
        for (int i = 0;i < array.length;i ++){
            // 当插入的元素小于该元素时说明该元素在次位置
            if (num <= array[i]){
                index = i;
                break;
            }
        }
        //创建一个新数组
        int [] newArray = new int[array.length + 1];
        // 进行数组转移
        if (index == -1){
            newArray[array.length] = num;
        }else {
            newArray[index] = num;
        }
        for (int i = 0,j = 0;j < array.length;i ++){
            if (i == index){
                continue;
            }
            newArray[i] = array[j];
            j ++;
        }
        System.out.println("添加完元素前的数组为:");
        for (int i = 0;i < array.length;i ++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        array = newArray;
        System.out.println("添加完元素后的数组为:");
        for (int i = 0;i < array.length;i ++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        //方法2 将元素添加的最后然后进行排序
    }
}
