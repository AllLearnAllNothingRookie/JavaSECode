package alanrookie.study.method01.methoddetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/29 22:28
 */
public class MethodDetailTest {
    public static void main(String[] args) {
        MethodDetail methodDetail = new MethodDetail();
        int[] sumAndSub = methodDetail.getSumAndSub(10, 5);
        System.out.println("和为:" + sumAndSub[0]);
        System.out.println("差为:"+sumAndSub[1]);
        //方法参数的实参与形参兼容
        methodDetail.method(1,1);
    }
}
