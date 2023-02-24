package twodimensional.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/14 20:42
 * 二维数组快速入门
 */
public class TwoDimensionalArray01 {
    /**
     * 用二维数组输出如下图形
     *  0 0 0 0 0 0
     *  0 0 1 0 0 0
     *  0 2 0 3 0 0
     *  0 0 0 0 0 0
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 二维数组:
         *   定义形式  数据类型[][]
         *   相当于一维数组的每个元素为一维数组
         */
        // 定义方式1 ：静态初始化
        int [][] arr = {
                {0,0,0,0,0,0},
                {0,0,1,0,0,0},
                {0,2,0,3,0,0},
                {0,0,0,0,0,0}
        };
        // 定义方式2： 动态初始化
        int[][] array = new int[4][6];
        array[1][2] =  1;
        array[2][1] =  2;
        array[2][3] = 3;
        //遍历二维数组
        // 遍历二维数组的每一个元素
        for (int i =0;i < array.length;i ++){
            //得到二维数组中保存的一位数组长度
            for (int j = 0;j < array[i].length; j ++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("=================");
        for (int i = 0;i < arr.length;i ++){
            for (int j = 0;j < arr[i].length;j ++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
