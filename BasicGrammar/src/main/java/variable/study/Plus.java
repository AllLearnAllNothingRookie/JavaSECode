package variable.study;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/5 22:21
 * @Version 1.0
 */
public class Plus {
    /**
     * 加号的使用
     *  1: 当左右两边都是数值类型时，做加法运算
     *  2：当左右一边有一方为字符串时，则做怕拼接运算
     */
    public static void main(String[] args) {
        //两边都为数值类型   98
        System.out.println(100 + 98);
        //有一边为字符串类型  10098
        System.out.println("100" + 98);
        //复合时   103100  运算顺序时从左到右
        System.out.println(100 + 3 + "100");
        // 1003100
        System.out.println("100" + 3 + 100);
    }
}
