package study.multiplethreads.selltickets.implementsrunnable;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 10:37
 */
public class Tickets implements Runnable{
    /**
     * 总票数
     */
     int ticketsNum = 100;
    @Override
    public void run() {
        while (true){
            if (ticketsNum <= 0){
                System.out.println("没有票了.....");
                break;
            }
            System.out.println(Thread.currentThread().getName() + ":当前票号:" + ticketsNum);
            ticketsNum --;
        }

    }
}
