package study.bigdata;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/2 21:20
 * todo:
 *    1. BigInteger:适合保存比较大的整数
 *    2. BigDecimal:适合保存精度更高的浮点数
 */
public class BigDataStudy {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("12345678998875522221");
        System.out.println(bigInteger);
        //在对 BigInteger进行加减乘除是要调用对应的方法
        //加
        BigInteger add = bigInteger.add(new BigInteger("22"));
        System.out.println(add);
        //减
        BigInteger sub = bigInteger.subtract(new BigInteger("1"));
        System.out.println(sub);
        //乘
        BigInteger multiply = bigInteger.multiply(new BigInteger("100"));
        System.out.println(multiply);
        //除
        BigInteger divide = bigInteger.divide(new BigInteger("1000"));
        System.out.println(divide);

        //浮点数处理  -- 当需要保存精度很高的数时需要使用BigDecimal
        BigDecimal bigDecimal = new BigDecimal("1.85555885562545224521252245512233");
        System.out.println(bigDecimal);
        // 对BigDecimal进行运算要调用对应的方法
        // 加
        BigDecimal add1 = bigDecimal.add(new BigDecimal("1.1100"));
        System.out.println(add1);
        //减
        BigDecimal subtract = bigDecimal.subtract(new BigDecimal(0.855));
        System.out.println(subtract);
        //乘
        BigDecimal multiply1 = bigDecimal.multiply(new BigDecimal(10000.00));
        System.out.println(multiply1);
        //除
        // 可能抛出异常 -- 当结果是无限循环小数时
        //java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
        BigDecimal divide1 = bigDecimal.divide(new BigDecimal("100"));
        System.out.println(divide1);
        //解决结果是无限循环是抛出异常的问题 --- 提供一个精度
        //BigDecimal.ROUND_CEILING : 保留到分子的精度
        divide1 = bigDecimal.divide(new BigDecimal("1.255"),BigDecimal.ROUND_CEILING);
        System.out.println(divide1);
    }
}
