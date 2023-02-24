package unidimensionalarray.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/12 23:11
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {1,4,2,32,5,42,3,52,54,21,23,-5,0,6};
        System.out.println("排序前:");
        for (int i = 0;i < array.length;i ++){
            System.out.print(array[i] + "\t");
        }
        for (int i =0;i < array.length - 1;i ++){
            for (int j = 0;j < array.length - 1 - i; j ++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("\n排序后:");
        for (int i = 0;i < array.length;i ++){
            System.out.print(array[i] + "\t");
        }
    }
}
