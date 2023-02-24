package exercise.exercise04;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/1 20:48
 */
public class YieldTest {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i = 1;i <= 5;i ++){
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                    Thread.yield();
                }
            }
        };
        Thread t1 = new Thread(runnable,"高");
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread t2 = new Thread(runnable,"低");
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
