package homework;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/17 21:55
 * 冒泡排序
 */
public class HomeWork03 {
    public static void main(String[] args) {

        int [] array = {-6,2,4,1,-8,38,89,34,6,42,-11,90,33,21,46};
        System.out.println("排序前");
        for (int i = 0;i < array.length ; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        //冒泡排序
        for (int i =0;i < array.length - 1;i ++){
            for (int j = 0;j < array.length - 1 - i;j ++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后");
        for (int i = 0;i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
}
