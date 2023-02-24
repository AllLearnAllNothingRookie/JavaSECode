package study.multiplethreads.selltickets.extendsthread;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 10:35
 */
public class Window {
    public static void main(String[] args) {
        //三个窗口
        SellTickets window1 = new SellTickets();
        window1.setName("窗口1");
        SellTickets window2 = new SellTickets();
        window2.setName("窗口2");
        SellTickets window3 = new SellTickets();
        window3.setName("窗口3");
        //启动线程
        window1.start();
        window2.start();
        window3.start();
    }
}
