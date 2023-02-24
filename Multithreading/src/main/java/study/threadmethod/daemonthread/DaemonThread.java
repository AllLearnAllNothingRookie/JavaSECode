package study.threadmethod.daemonthread;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 17:55
 *todo: 用户线程和守护线程
 *      用户线程: 也叫工作线程，当线程的任务执行完 或 通知方式 结束
 *      守护线程: 一般为工作线程服务的，当所有的用户线程结束，守护线程自动结束
 *      常见的守护线程： 垃圾回收机制
 * 将一个线程设置为守护线程
 */
public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread daemonThread = new MyDaemonThread();
        //将子线程设置为守护线程，那么主线程结束后，子线程就会自动结束
        //todo:要先将线程设置为守护线程在启动线程
        daemonThread.setDaemon(true);
        daemonThread.start();
        for (int i = 1;i <= 10;i ++){
            System.out.println("主线程");
            Thread.sleep(1000);
        }
        System.out.println("主线程结束");
    }
}
