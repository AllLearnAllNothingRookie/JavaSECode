package branchstructure.homework;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/8 21:39
 * 求出1 + (1 + 2) + (1 + 2 + 3) +
 * (1 + 2 + 3 + 4) + …… + (1 + 2 + …… + 100) 的结果
 */
public class HomeWork08 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i <= 100 ;i ++){
            for (int j = 1;j <= i; j ++){
                sum += j;
            }
        }
        System.out.println("1 + (1 + 2) + (1 + 2 + 3) + …… + (1 + 2 + …… + 100)的结果为:" + sum);
    }

}