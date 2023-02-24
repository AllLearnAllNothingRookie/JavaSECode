package exercise.exercise14;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/2 21:03
 */
public class PrintNumTest {
    public static void main(String[] args) {
        PrintNum printNum = new PrintNum();
        Thread t1 = new Thread(printNum);
        Thread t2 = new Thread(printNum);
        t1.start();
        t2.start();
    }
}
