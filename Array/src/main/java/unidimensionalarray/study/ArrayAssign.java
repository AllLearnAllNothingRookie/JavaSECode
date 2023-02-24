package unidimensionalarray.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/11 22:27
 * 数组赋值机制
 */
public class ArrayAssign {
    public static void main(String[] args) {
        // 基本类型赋值 赋值方式为值拷贝
        // n2的变化不会影响到n1得值
        int n1 = 10;
        int n2 = n1;

        n2 =80;
        System.out.println(n1);
        System.out.println(n2);

        // 引用类型赋值：
        // 数组为引用类型，赋的值是地址，赋值方式为引用传递
        // 传递的是一个地址,array2的变化会影响到array1
        int [] array1 = {1,2,3};
        int [] array2 = array1;
        array2[2] = 100;
        for (int i = 0;i < array1.length; i++){
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
        for (int i = 0;i < array2.length; i++){
            System.out.print(array2[i] + "\t");

        }
    }
}
