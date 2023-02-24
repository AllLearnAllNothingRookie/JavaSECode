package alanrookie.study.varparameter;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/9 21:46
 */
public class VarParameterTest {
    public static void main(String[] args) {
        VarParameter varParameter = new VarParameter();
        /**
         * 如果传入的参数个数有对应的方法则优先调用该方法
         */
        System.out.println( varParameter.sum(2,3));
        System.out.println( varParameter.sum(2,3,4));
        System.out.println( varParameter.sum(2,3,4,5));
        //传多个参数
        System.out.println( varParameter.sum(2,3,4,5,6,7));
        //一个参数都不参
        System.out.println( varParameter.sum());
    }
}
