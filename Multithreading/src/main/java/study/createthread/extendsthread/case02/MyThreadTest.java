package study.createthread.extendsthread.case02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/31 21:24
 * 主线程打印5~1，启动两个子线程打印 1~ 5，并实现这3个线程同时运行
 */
public class MyThreadTest {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();
        for (int i = 5;i >= 1;i --){
            System.out.println(Thread.currentThread().getName() + "线程：" + i);
        }
    }
}
