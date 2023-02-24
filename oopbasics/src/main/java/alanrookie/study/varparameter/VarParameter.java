package alanrookie.study.varparameter;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/9 21:41
 * 可变参数
 */
public class VarParameter {
    /**
     * 计算2个数的和
     * @param n1
     * @param n2
     * @return
     */
    public int sum(int n1,int n2){
        return  n1 + n2;
    }

    /**
     * 计算3个数的和
     * @param n1
     * @param n2
     * @param n3
     * @return
     */
    public int sum(int n1,int n2,int n3){
        return  n1 + n2 + n3;
    }

    /**
     * 计算4个数的和
     * @param n1
     * @param n2
     * @param n3
     * @param n4
     * @return
     */
    public int sum(int n1,int n2,int n3,int n4){
        return  n1 + n2 + n3 + n4;
    }
    //优化

    /**
     * 利用可变参数求和
     * @param nums
     * @return
     *  int... ： 表示接收的时可变参数
     *            类型是int
     *            可以接收多个参数[0,无穷]
     *   使用可变参数时nums可以当作数组使用
     */
    public int sum(int... nums){
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
