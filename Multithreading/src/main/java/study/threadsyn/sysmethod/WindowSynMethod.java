package study.threadsyn.sysmethod;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 10:40
 */
public class WindowSynMethod {
    public static void main(String[] args) {
        SellTicketsSynMethod synMethod = new SellTicketsSynMethod();
        //创建3个买票窗口
        Thread window1 = new Thread(synMethod);
        window1.setName("窗口1");
        Thread window2 = new Thread(synMethod);
        window2.setName("窗口2");
        Thread window3 = new Thread(synMethod);
        window3.setName("窗口3");
        //启动线程
        window1.start();
        window2.start();
        window3.start();

    }
}
