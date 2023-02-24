package study.threadstate;

import study.threadmethod.daemonthread.MyDaemonThread;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 20:54
 * todo: 线程的状态
 *     1.NEW [新建]:尚未启动的线程处于此状态。
 *     2.RUNNABLE [可运行/就绪]:在Java虚拟机中执行的线程处于此状态。
 *      RUNNABLE的状态有可以分为以下两种
 *          1. Ready: 就绪
 *          2.Running：执行(运行)
 *     3.BLOCKED [阻塞]：被阻塞等待监视器锁定的线程处于此状态。
 *     4.WAITING [等待]：正在等待另一个线程执行特定动作的线程处于此状态。
 *     5.TIMED_WAITING [超时等待]：正在等待另一个线程执行动作达到指定等待时间的线程处于此状态。
 *     7.TERMINATED [终止] ：已退出的线程处于此状态。
 */
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        System.out.println(thread.getName() + "线程的状态是：" + thread.getState());
        thread.start();
        while (Thread.State.TERMINATED != thread.getState()){
            System.out.println(thread.getName() + "线程的状态是：" + thread.getState());
            Thread.sleep(500);
        }
        System.out.println(thread.getName() + "线程的状态是：" + thread.getState());
    }
}
