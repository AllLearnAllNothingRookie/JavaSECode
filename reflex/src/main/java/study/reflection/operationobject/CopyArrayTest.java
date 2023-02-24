package study.reflection.operationobject;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 21:16
 * 实现数组工具类的copyOf方法，可以实现根据一个任意引用类型的数组，复制一个指定长度的新数组。
 */
public class CopyArrayTest {
    public static void main(String[] args) {
        String[] arr = {"int","long","char","boolean","short","byte"
                        ,"float","double","Object"};
        String[] copyof = copyof(arr, 8);
        System.out.println(Arrays.toString(copyof));
    }

    /**
     * 实现数组拷贝
     * @param original
     * @param newLength
     * @return
     * @param <T>
     */
    public static <T>T[] copyof(T [] original,int newLength){
        if (newLength < 0){
            throw new IllegalArgumentException(newLength + "不能为负数");
        }
        Class<? extends Object[]> originalClass = original.getClass();
        Class<?> componentType = originalClass.getComponentType();
        Object o = Array.newInstance(componentType, newLength);
        T [] newArr = (T[]) o;
        for (int i = 0;i < original.length && i < newLength; i ++){
            newArr[i] = original[i];
        }
        return newArr;
    }
}
