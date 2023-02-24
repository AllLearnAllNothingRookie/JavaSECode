package study.multiplethreads.selltickets.extendsthread;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 10:33
 * 三个窗口同时买票问题
 */
public class SellTickets extends Thread {
    /**
     * 总票数
     */
    static  int ticketNum = 100;
    @Override
    public void run() {
        while (true){
            if (ticketNum <= 0){
                System.out.println("没有票了.....");
                break;
            }
            System.out.println(Thread.currentThread().getName() + ":当前票号:" + ticketNum);
            ticketNum --;
        }
    }
}
