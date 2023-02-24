package operator.exercise;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/20 19:23
 * @Version 1.0
 */
public class TernaryOperatorExercise {
    /**
     * 用三元运算符求三个数中的最大值
     */
    public static void main(String[] args) {
        int a  = 565;
        int b = 4590;
        int c = 4569776;








        int max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println("三个数中的最大值是:"  + max);
        //方式二:
        max = (a > b ? a : b) >  c ? (a > b ? a : b) : c;
        System.out.println("三个数中的最大值时:" + max);
    }
}
