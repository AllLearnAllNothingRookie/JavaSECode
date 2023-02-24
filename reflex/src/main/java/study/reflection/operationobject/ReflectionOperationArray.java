package study.reflection.operationobject;

import java.lang.reflect.Array;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 21:09
 * 使用反射的方式创建一个长度为5的String 数组，并且给[0]和[1]元素赋值，然后获取[0]、[1]、[2]元素值
 */
public class ReflectionOperationArray {
    public static void main(String[] args) {
        //使用反射的方式创建一个长度为5的String 数组
        Object arr = Array.newInstance(String.class, 5);
        System.out.println(arr.getClass());
        //并且给[0]和[1]元素赋
        Array.set(arr,0,"array");
        Array.set(arr,1,"object");
        //获取[0]、[1]、[2]元素值
        Object o1 = Array.get(arr, 0);
        Object o2 = Array.get(arr, 1);
        Object o3 = Array.get(arr, 2);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
    }
}
