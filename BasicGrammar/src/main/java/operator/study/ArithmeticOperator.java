package operator.study;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/9 22:46
 * @Version 1.0
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        // /使用
        //数学中 10 / 2的结果为 2.5是double类型
        //数学的结构为2.5  但是Java中10和2都是int类型故结果也为int类型 即(int) 2.5 = 2
        System.out.println(10 / 4);
        // 但是Java中10.0为double类型 ，2为是int类型故结果也为doublet类型 即 2.5
        System.out.println(10.0 / 2);
        //10和2都是int类型故结果也为int类型 即(int) 2.5 = 2  然后将 int类型的2 赋值给 double类型 即为2.0
        double d = 10 / 2;
        System.out.println(d);
        //% 取模 取余
        //取模运算的本质为： a % b = a - a / b * b
        // 结果为:1  10 % 3 = 10 - 10 / 3 * 3
        System.out.println(10 % 3 );
        // 结果为:-1  -10 % 3 = -10 - (-10)/ 3 * 3
        System.out.println(-10 % 3 );
        // 结果为:1   10 % -3 = 10 - 10/ (-3) * (-3)
        System.out.println(10 % -3 );
        // 结果为:-1  -10 % -3 = -10 - (-10)/ (-3) * (-3)
        System.out.println(-10 % -3 );

        // ++ 使用
        //1.独立使用
        int i = 10;
        i ++;
        i ++;
        System.out.println(i);
        /**
         * 作为表达式使用
         * 前 ++；先自增后赋值
         * 后 ++：先赋值后自增
         */
        int j = 9;
        int k = ++ j; //等价于: j = j + 1; k = j;
        System.out.println(j +"\t" + k);  //10  10
        int m = 9;
        int n = m ++; //等价于: n = m; m = m + 1;
        System.out.println(m + "\t" + n); //10  9


    }
}
