package unidimensionalarray.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/19 21:09
 */
public class Array03 {
    public static void main(String[] args) {
        // 创建数组
        int[] array = {1,2,3,4,5,6,7};
        //获取数组长度
        int len = array.length;
        System.out.println("数组长度为:" + len);
        // 获取数组中下标为2的元素
        int element = array[2];
        System.out.println("数组下标为2的元素:" + element);
        // 更新数组下标为2的元素
        array[2] = 8;
        System.out.println("数组下标为2的元素更新后：" + array[2]);
        // 获取数组中最后一个元素
        int lastElement = array[array.length - 1];
        //错误写法 数组下标范围为[0,数组长度 - 1 ]
        //int lastElement = array[array.length ];
        System.out.println("数组中最后一个元素为:" + lastElement);
    }
}
