package operator.study;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/20 15:59
 * @Version 1.0
 */
public class TernaryOperator {
    /**
     * 三元运算符
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        //解读:
        //1.a > b 为false
        //2. 返回 b -- ,先返回b的值，然后在 b -1
        //3. 返回的结果是99
        int result = a > b ? a ++ : b--;
        System.out.println(result);
    }
}
