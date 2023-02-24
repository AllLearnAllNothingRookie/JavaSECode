package study.threaddeadlock;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/31 14:43
 * 死锁模拟
 */

public class Deadlock extends Thread{
    static Object o1= new Object();
    static Object o2 = new Object();
    boolean flag ;

    public Deadlock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag){
            synchronized (o1){
                System.out.println(Thread.currentThread().getName() + "进入1");
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName() + "进入2");
                }
            }
        }else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "进入3");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + "进入4");
                }
            }
        }
    }
}
