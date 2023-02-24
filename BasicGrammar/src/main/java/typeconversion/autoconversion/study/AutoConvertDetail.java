package typeconversion.autoconversion.study;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/10/2 19:22
 * @Version 1.0
 * 自定类型转换细节
 */
public class AutoConvertDetail {
    public static void main(String[] args) {
        //自定类型转换细节
        //1.有多种类型的数据混合运算时，系统首先自动将所有数据转换为表达式中容量最大的那种数据类型，然后在进行计算
        int n1 = 10;
        //  n1 + 1.1 int + double 最后结果为double类型
        double d1 = n1 + 1.1;
        //n1 + 1.1f int + float  最后结果为float类型
        float f1 = n1 + 1.1f;

        //2.当把精度(容量)大的数据类型赋值给精度(容量)小的数据类型时就会报错，反之就会进行自动类型转换\
        // 错误 double -> int
        //int n2 = 1.1;
        //正确  int -> double
        double d2 = 10;

        // 3.(byte,short)和char之间不会自动转换
        byte b = 10;
        //错误 (byte,short)和char之间不会自动转换
        // char c1 =  b;
        //当把具体的数赋给byte/short时，先判断数是否在byte/short的范围内，如果在则赋值成功，不在则赋值失败
        // 如果是变量赋值则判断类型
        byte b1 = 10;
        int n3 = 1;
        //错误 int -> byte
        //如果是变量赋值则判断类型
        //byte b2 = n3;

        //4. byte、short、char三者计算时，自动转换为int类型，在进行运算
        byte b2 = 10;
        byte b3 = 10;
        short s = 20;
        //错误  int -> short
        // short s1 = b2 + s;
        int n4 = b2 + s;
        //错误 int -> byte
       // byte b4 = b2 + b3;
        int n5 = b2 + b3;

        //5.boolean不参与转转
        boolean pass = true;
        //错误 boolean不参与自动类型转换
       // int num = pass;

        //6.自动提升原则:表达式结构的类型自动提升为操作数中最大的类型
        byte b5 = 1;
        short s2 = 100;
        int n6 = 200;
        float f2= 2.0f;
        double d3 = 1.34;
        double d4 = b5 + s2 + n6 + f2 + d3;
    }
}
