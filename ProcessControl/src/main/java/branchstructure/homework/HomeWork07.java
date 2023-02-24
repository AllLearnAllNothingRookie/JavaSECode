package branchstructure.homework;

import branchstructure.forstructure.study.For01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/8 21:36
 * 求出 1-1/2+1/3-1/4……1/100的和
 */
public class HomeWork07 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1;i <= 100;i ++){
            if (i % 2 != 0){
                sum += 1.0 / i;
            }else {
                sum -= 1.0 / i;
            }
        }
        System.out.println("1-1/2+1/3-1/4……1/100的和为:" + sum);
    }
}
