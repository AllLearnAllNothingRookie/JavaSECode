package unidimensionalarray.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/12 20:26
 * 数组反转
 */
public class ArrayReverse {
    public static void main(String[] args) {
        int [] array = {11,22,33,44,55,66,77};
        //方法1：
        for (int i = 0,j = array.length - 1; i < j;i ++,j -- ){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        for (int i = 0;i < array.length;i ++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        //方法2：
        for (int i = 0;i < array.length / 2;i ++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int i = 0;i < array.length;i ++){
            System.out.print(array[i] + "\t");
        }
        //方法3
        int [] temps = new int[array.length];
        for (int i = array.length - 1,j = 0;i >= 0;i -- ,j ++){
            temps[j] = array[i];
        }
        array = temps;
        System.out.println();
        for (int i = 0;i < array.length;i ++){
            System.out.print(array[i] + "\t");
        }
    }
}
