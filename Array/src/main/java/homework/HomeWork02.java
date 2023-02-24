package homework;

import jdk.nashorn.internal.ir.annotations.Ignore;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/17 21:05
 * 生成1-100的10个随机数，并倒叙打印以及求平均值，最大值和最大值下标并查找里面是否有8
 */
public class HomeWork02 {
    public static void main(String[] args) {
        int [] array = new int[10];
        int max = array[array.length - 1];
        double sum = 0;
        double avg = 0;
        int maxIndex = array.length - 1;
        boolean flag = false;
        for (int i = 0;i < array.length;i ++){
            array[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("随机数组的结果为:");
        for (int i = 0;i < array.length;i ++){
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n随机数组逆序的打印的结果为:");
        for (int i = array.length - 1; i >= 0 ;i --){
            sum += array[i];
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
            }
            if (array[i] == 8){
                flag = true;
            }
           System.out.print(array[i] + "\t");
        }
        System.out.println();
        avg = sum / array.length;
        System.out.println("十个随机数的和为:" + sum);
        System.out.println("十个随机数的平均值为:" + avg);
        System.out.println("十个随机数的最大值为:" + max);
        System.out.println("十个随机数的最大值下标为:" + maxIndex);
        if (flag){
            System.out.println("随机数中有8");
        }else {
            System.out.println("随机数中没有8");
        }

    }
}
