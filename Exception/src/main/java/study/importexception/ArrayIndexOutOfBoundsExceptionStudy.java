package study.importexception;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/28 15:01
 * todo:ArrayIndexOutOfBoundsException 数组下标越界异常
 *   用非法索引访问数组时抛出的异常。如果索引为负或大于等于数组大小，则该索引为非法索引
 */
public class ArrayIndexOutOfBoundsExceptionStudy {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //java.lang.ArrayIndexOutOfBoundsException: 4
        System.out.println(arr[4]);
        System.out.println(arr[-1]);
    }
}
