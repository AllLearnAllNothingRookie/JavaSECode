package alanrookie.exercise.recursionexercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/31 22:13
 */
public class RecursionExercise01 {
    public static void main(String[] args) {
        RecursionExercise01 exercise01 = new RecursionExercise01();
        int i = exercise01.eatPeach(1);
        System.out.println("第一天有：" + i + "个桃子");
        int sequence = exercise01.fibonacciSequence(20);
        System.out.println("斐波拉契数列的第20个数为:" + sequence);
    }

    /**
     * 请用递归求出斐波拉契数列数 1,1,2,3,5,8,13……给你一个数你，求出它的时是多少
     * @param n
     * @return
     */
    public int fibonacciSequence(int n){
       if (n <= 0){
           return -1;
       }else {
           if (n == 1 || n ==2){
               return  1;
           }else {
               return fibonacciSequence(n -1) + fibonacciSequence(n -2);
           }
       }
    }

    /**
     * 有一堆桃子，第一天吃掉其中一半，并再多吃一个，以后开始每一天都吃其中一半，然后再多一个
     *  当第十天时，想吃时(还没吃)，发现只有一个桃子了，问最初有多少个桃子？
     *  解析
     *      day(10)   1
     *      day(9)   x / 2 - 1 = 1  ==>  x = 4     day(9) = (day(10) + 1) * 2
     *      day(8)  x / 2 - 1 = 4  ==> x =  10     day(8) = (day(9) + 1) * 2
     *      day(7)  x / 2 - 1 = 10  ==> x = 22     day(7) = (day(8) + 1) * 2
     *      day(6)  x / 2 - 1 = 22  ==> x = 36     day(6) = (day(7) + 1) * 2
     *
     * @return
     */
    public int eatPeach(int n){
        if (n == 10){
            return 1;
        }else if (n >= 1 && n <= 9){
            return  (eatPeach(n + 1) + 1) * 2;
        }else{
            return  -1;
        }
    }
}
