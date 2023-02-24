package unidimensionalarray.exercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/11 21:21
 * 求出int数组{4，-1，9，10，23}的最大值及其对应的下标
 */
public class ArrayExercise02 {
    public static void main(String[] args) {
        int [] array = {41,-1,9,10,23};
        //数组的最大值
        int max = array[0];
        //数组最大值的小标
        int maxIndex = 0;
        for (int i = 1;i < array.length;i ++){
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("数组的最大值是:" + max);
        System.out.println("最大住对应的下标是:" + maxIndex);
    }
}
