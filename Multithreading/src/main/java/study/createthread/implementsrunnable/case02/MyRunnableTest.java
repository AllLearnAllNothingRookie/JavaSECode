package study.createthread.implementsrunnable.case02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/31 21:41
 * 主线程打印5~1，启动两个子线程打印 1~ 5，并实现这3个线程同时运行
 */
public class MyRunnableTest {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
        for (int i = 5;i >= 1;i --){
            System.out.println(Thread.currentThread().getName() + "线程:" + i);
        }
    }
}
