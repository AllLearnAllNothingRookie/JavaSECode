package alanrookie.study.method02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/27 22:39
 * 使用方法输出数组
 */
public class PrintArray {
    public static void main(String[] args) {
        int [][] array = {{0,8,7},{6,7,4,3,40},{6,7,4,3,5}};
        //传统解决方式 -- 代码复用性差
        for (int i = 0;i < array.length;i ++){
            for (int j = 0;j < array[i].length;j ++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.println("===========================");
        //使用方法 -- 代码可以复用
        PrintArray printArray = new PrintArray();
        printArray.printArray(array);

    }

    /**
     * 使用方法遍历数组
     * @param array
     */
    public void printArray(int [][] array){
        for (int i = 0;i < array.length;i ++){
            for (int j = 0;j < array[i].length;j ++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
