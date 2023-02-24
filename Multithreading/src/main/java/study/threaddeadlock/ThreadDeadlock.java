package study.threaddeadlock;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/31 14:39
 * todo：线程死锁
 *   多个线程都占用了对方的锁资源，但不肯想让，导致了死锁，在编程里一定要避免死锁的发生
 */
public class ThreadDeadlock {
    public static void main(String[] args) {
        //模拟死锁现象
        Deadlock a  = new Deadlock(true);
        a.setName("A线程");
        Deadlock b  = new Deadlock(false);
        b.setName("B线程");
        a.start();
        b.start();
    }
}
