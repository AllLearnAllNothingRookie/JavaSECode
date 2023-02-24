package study.threadexit;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 14:04
 * todo：线程终止:
 *      1.当线程完成任务后会自动退出
 *      2.可以通过使用变量来控制run方法退出的方式停止线程，即通知方式
 */
public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        T t1 = new T();
        t1.start();
        //主线程10秒后停止t1线程
        Thread.sleep(10000);
        //希望主线程控制t1线程终止，必须可修改 loop，让t1退出run方法，从而终止t1线程
        t1.setLoop(false);
    }
}
