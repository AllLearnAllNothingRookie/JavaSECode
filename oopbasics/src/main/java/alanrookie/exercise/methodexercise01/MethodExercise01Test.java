package alanrookie.exercise.methodexercise01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/30 20:57
 */
public class MethodExercise01Test {
    public static void main(String[] args) {
        MethodExercise01 method = new MethodExercise01();
        method.printChar(4,4,'*');
        boolean evenNumbers = method.isEvenNumbers(3);
        System.out.println(evenNumbers ? "偶数" : "奇数");
        boolean evenNumbers1 = method.isEvenNumbers(4);
        System.out.println(evenNumbers1 ? "偶数" : "奇数");
    }
}
