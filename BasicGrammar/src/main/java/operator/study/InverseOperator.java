package operator.study;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/20 14:49
 * @Version 1.0
 */
public class InverseOperator {
    /**
     * 取反操作
     */
    public static void main(String[] args) {
        //! 是取反操作 T -> F   F-> T
        System.out.println(60 > 20);
        System.out.println(!( 60 > 20));
        //a ^ b :逻辑异或 当a和b不同时结果为true，否则结果为false
        boolean b = (10 > 1) ^ (3 < 5);
        System.out.println(b);
        b = (10 > 1) ^ (3 > 5);
        System.out.println(b);
    }
}
