package study.multiplethreads.example1;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 10:12
 */
public class Example01 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new T1());
        Thread thread2 = new Thread(new T2());
        //启动第一个线程
        thread1.start();
        //启动第二个线程
        thread2.start();
    }
}
