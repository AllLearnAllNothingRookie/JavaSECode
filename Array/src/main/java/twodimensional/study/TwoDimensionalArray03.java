package twodimensional.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/16 21:18
 * 二维数组动态初始化  -- 列数不确定
 */
public class TwoDimensionalArray03 {
    /**
     * Java中二维数组允许数组中每个一维数组的长度不一致
     * 需求动态创建如下二维数组
     *  1
     *  1   2
     *  1   2   3
     *  1   2   3   4
     * @param args
     */
    public static void main(String[] args) {
        // 只为二维数组开辟了空间并未给二维数组中的每个一位数组开辟空间
        //创建一个二维数组但是不确定一位数组的个数
        int [][] array = new int[4][];
        // 输出null： 说明二维数组中的一维数组为null，并没有开辟空间，在使用时一定要
        //   为一维数组开辟空间，否则可能报空指针异常
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        // 为二维数组赋值
        for (int i = 0;i < array.length;i ++){
            //注意 在赋值时要为二维数组中的一维数组开辟空间
            array[i] = new int[i + 1];
             for (int j = 0;j < array[i].length;j ++){
                array[i][j] = j + 1;
            }
        }
        //输出
        for (int i = 0;i < array.length;i ++){
            for (int j = 0;j < array[i].length; j ++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
