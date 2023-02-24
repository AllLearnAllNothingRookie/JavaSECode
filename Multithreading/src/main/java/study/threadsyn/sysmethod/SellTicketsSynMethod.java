package study.threadsyn.sysmethod;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 10:37
 */
public class SellTicketsSynMethod implements Runnable{
    /**
     * 总票数
     */
    static int ticketsNum = 100;
   static boolean loop = true;
    @Override
    public  void run() {
        while (loop){
           setTickets();
        }
    }
    /**
     * 同步方法，在某一个时刻只能有一个线程来执行setTickets方法
     * 同步方法(非静态) 当前锁为 this对象
     */
    public synchronized void setTickets(){
        if (ticketsNum <= 0){
            System.out.println("没有票了.....");
            loop = false;
            return;
        }
        -- ticketsNum;
        System.out.println(Thread.currentThread().getName() + ":当前票号:" + ticketsNum);
    }
}
