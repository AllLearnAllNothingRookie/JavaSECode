package twodimensional.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/16 20:50
 * 二维数组动态初始化
 */
public class TwoDimensionalArray02 {
    public static void main(String[] args) {
        // 动态初始化方式1：
        // 声明数组后直接开辟空间
       // int [][] array = new int[2][3];
        // 动态初始化方式2：
        // 声明二维数组
        int [][] array ;
        // 开辟空间
        array =   new int[2][3];
        //遍历二维数组
        /**
         * 二维数组的默认之和一维数组一样
         */
        for (int i = 0;i < array.length ;i ++){
            for (int j = 0;j < array[i].length;j ++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("=========================");
        array[1][1] = 9;
        for (int i = 0;i < array.length ;i ++){
            for (int j = 0;j < array[i].length;j ++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
