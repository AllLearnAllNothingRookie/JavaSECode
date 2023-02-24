package operator.study;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/20 15:46
 * @Version 1.0
 */
public class AssignOperator {
    /**
     * 赋值运算符
     */
    public static void main(String[] args) {
        int n1 = 10;
        //等价于 n1 = n1 + 4;
        n1 += 4;
        System.out.println(n1);
        //等价于 n1 = n1 / 3;
        n1 /= 3;
        System.out.println(n1);
        //复合赋值运算符会进行类型强转
        byte  b = 3;
        //等价于 b = (byte) (b + 3);
        b += 3;
        //等价于 b = (byte) (b + 1);
        b++;
    }
}
