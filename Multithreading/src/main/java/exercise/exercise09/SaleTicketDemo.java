package exercise.exercise09;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/2 9:38
 */
public class SaleTicketDemo {
    public static void main(String[] args) {
      
        Ticket ticket = new Ticket();
        SaleThread t1 = new SaleThread("窗口一",ticket);
        SaleThread t2 = new SaleThread("窗口二",ticket);
        SaleThread t3 = new SaleThread("窗口三",ticket);
        t1.start();
        t2.start();
        t3.start();
    }
}
