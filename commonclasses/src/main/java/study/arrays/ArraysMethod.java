package study.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/2 19:55
 * todo：Arrays里面包含了一系列的静态方法，用于管理或操作数组
 */
public class ArraysMethod {
    public static void main(String[] args) {
        Integer [] arrays = {1,20,90};
        //遍历数组
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
        //Arrays.toString显示数组信息
        System.out.println(Arrays.toString(arrays));
        //排序
        Integer arr[] = {1,-1,7,0,9,89};
        //默认排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //定制排序 通过Comparator实现定制排序
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr));
        //二分查找，要求数组有序(升序) 如果数组中不存在则返回负数 -(low + 1)
        // 不能存在则返回元素应该在的位置 + 1
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, 0);
        System.out.println(index);

        //数组元素的赋值
        //将arrays中arrays.length个元素拷贝到新数组中
        Integer[] integers = Arrays.copyOf(arrays, arrays.length);
        System.out.println(Arrays.toString(integers));
        integers = Arrays.copyOf(arrays, arrays.length - 1);
        System.out.println(Arrays.toString(integers));
        //如果拷贝的元素个数大于，拷贝元素个数的则全部拷贝数组，多余的位置是数组的默认值
        integers = Arrays.copyOf(arrays, arrays.length +  1);
        System.out.println(Arrays.toString(integers));

        //数组填充
        Integer [] num = {1,2,3,4,5};
        //将数组的元素全部替换为指定的元素，即替换原来的所有元素
        Arrays.fill(num,99);
        System.out.println(Arrays.toString(num));

        // 比较
        Integer [] arrays1 = {1,23,4,6};
        Integer [] arrays2 = {1,2,34};
        //完全一样返回true否则返回false
        System.out.println(Arrays.equals(arrays1,arrays2));

        //将数组转换为集合
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 4);
        List<Integer> integerList = Arrays.asList(arr);
    }
}
