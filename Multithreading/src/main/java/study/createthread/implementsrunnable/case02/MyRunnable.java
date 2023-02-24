package study.createthread.implementsrunnable.case02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/31 21:40
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 1;i <= 5;i ++){
            System.out.println(Thread.currentThread().getName() + "线程:" + i);
        }
    }
}
