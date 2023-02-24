package unidimensionalarray.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/11 20:54
 * 数组使用细节
 */
public class ArrayDetail {
    public static void main(String[] args) {
        // 1.: 数组是多个相同类型数据(同一种类型或可以自动类型转换)的组合，实现对这些数据的统一管理
        int [] array1 = {1,2,3,45,6,'a'};
        // 错误 double类中的数据不能放在int类型的数组中
       // int [] array2 = {1,2,3,45,6,1.1};
        //正确 int -> double 满足字符类型转换
        double [] array2 = {1,3,4,5,6.7,43,100};

        // 2.: 数组中的元素可以是任何数据类型，包括基本数据类型和引用数据类型，但不能混用
        String [] array3 = {"北京","成都","南京"};

        // 3.: 数组创建以后，如果没有赋值，有默认值
        /**
         *   数据类型       默认值
         *   int            0
         *   short          0
         *   byte           0
         *   long           0
         *   float          0.0
         *   double         0.0
         *   char           \u0000
         *   boolean        false
         *   引用类型         null
         */
        int [] ints = new int[3];
        System.out.println("int数组默认值为:" + ints[0]);
        short[] shorts = new short[3];
        System.out.println("short数组默认值为:" + shorts[0]);
        byte[] bytes = new byte[3];
        System.out.println("byte数组默认值为:" + bytes[0]);
        long[] longs = new long[3];
        System.out.println("long数组默认值为:" + longs[0]);
        float [] floats = new float[3];
        System.out.println("float数组默认值为:" + floats[0]);
        double[] doubles = new double[3];
        System.out.println("double数组默认值为:" + doubles[0]);
        char[] chars = new char[3];
       // System.out.println("\\u0000输出为:" + '\u0000');
        System.out.println("char数组默认值为:" + chars[0]);
        //System.out.println('\u0000' == chars[0]);
        boolean[] booleans = new boolean[3];
        System.out.println("boolean数组默认值为:" + booleans[0]);
        String[] strs = new String[3];
        System.out.println("引用类型数组默认值为:" + strs[0]);

        // 4.:使用数组的步骤：1.声明数组并开辟空间 2. 给数组各个下标赋值 3.使用数组
        // 5.:数组的下标是从0开始的
        // 6.:数组下标必须在指定范围内使用，否则报：下标越界异常
        int [] array = new int[4];
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[3]);
        //会报下标越界异常 java.lang.ArrayIndexOutOfBoundsException: 4
        // System.out.println(array[4]);
        //会报下标越界异常 java.lang.ArrayIndexOutOfBoundsException: 5
        // System.out.println(array[5]);
        // 7.:数组属于引用类型，数组型数据是对象(object)
    }
}
