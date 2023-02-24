package twodimensional.exercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/16 21:45
 * 遍历数组并得到和
 */
public class TwoDimensionalArrayExercise01 {
    /**
     * {{4，6}，{1，4，5，7}.{-2}}遍历数组并求和
     * @param args
     */
    public static void main(String[] args) {
        int [][] array = {{4,6},{1,4,5,7},{-2}};

        int sum = 0;
        //遍历并求和
        for (int i = 0;i < array.length; i++){
            for (int j = 0;j < array[i].length;j ++){
                System.out.print(array[i][j] + "\t");
                sum += array[i][j];
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("二维数组总和为:" + sum);
    }
}
