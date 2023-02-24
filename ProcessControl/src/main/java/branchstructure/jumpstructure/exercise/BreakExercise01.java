package branchstructure.jumpstructure.exercise;

import branchstructure.forstructure.study.For01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/6 21:31
 * 1-100之间的数求和，求出当和第一次大于20的数
 */
public class BreakExercise01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i <= 100; i ++){
            sum += i;
            if (sum > 20){
                System.out.println(i);
                break;
            }
        }
    }
}
