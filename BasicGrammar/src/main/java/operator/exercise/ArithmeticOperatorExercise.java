package operator.exercise;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/20 13:26
 * @Version 1.0
 */
public class ArithmeticOperatorExercise {
    public static void main(String[] args) {
        //面试题1：
       int  i = 1;
        /**
         *  计算规则: 使用临时变量
         * 	(1) temp = i;
         *	(2) i = i + 1;
         *	(3) i = temp;
         */
        i = i ++;
        System.out.println(i);  // 1
        //面试题2：
        i = 1;
        /**
         *  计算规则: 使用临时变量
         * 	(1) i = i + 1;
         *	(2) temp = i;
         *	(3) i = temp;
         */
        i = ++ i ;
        System.out.println(i);  // 2
        int i1 = 10;
        int i2 = 20;
        int i3 = i1 ++;
        System.out.println("i3 = " + i3);   //10
        System.out.println("i1 = " + i1);   //11
        i3 = -- i2;
        System.out.println("i3 = " + i3);  // 19
        System.out.println("i2 = " + i2);  // 19
    }
}
