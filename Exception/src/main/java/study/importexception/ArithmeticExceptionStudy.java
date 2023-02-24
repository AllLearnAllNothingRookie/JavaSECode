package study.importexception;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/28 14:57
 * todo:ArithmeticException 数学运算异常
 *    当出现异常的运算条件时，抛出此异常。例如，一个整数 除以 零时，抛出此类的一个实例
 */
public class ArithmeticExceptionStudy {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        //java.lang.ArithmeticException: / by zero
        int res = num1 / num2;
    }
}
