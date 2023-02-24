package twodimensional.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/16 21:38
 * 二维数组初始化 -- 静态初始化
 */
public class TwoDimensionalArray04 {
    public static void main(String[] args) {
        //静态初始化
        //二维数组中一维数组长度相同
        int [][] array = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        // 二维数组中一维数组长度不同
        // 不可以省略大括号
        int [][] array1 = {{1},{1,2},{1,2,3}};
        //错误写法  -- 一维数组只有一个元素时省略大括号
       // int [][] array1 = {1,{1,2},{1,2,3}};
    }
}
