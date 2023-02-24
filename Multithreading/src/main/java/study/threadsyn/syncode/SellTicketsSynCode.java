package study.threadsyn.syncode;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 10:37
 */
public class SellTicketsSynCode implements Runnable{
    /**
     * 总票数
     */
    static int ticketsNum = 100;
    boolean loop = true;
    @Override
    public void run() {
        while (loop){
            /**
             * 同步代码块锁可以是任意的对象
             * 但是要求多个线程的锁要是同一个对象
             */
           synchronized (SellTicketsSynCode.class){
               if (ticketsNum <= 0){
                   loop = false;
                   System.out.println("没有票了.....");
                   return;
               }
               System.out.println(Thread.currentThread().getName() + ":当前票号:" + ticketsNum);
               ticketsNum --;
           }
        }

    }
}
