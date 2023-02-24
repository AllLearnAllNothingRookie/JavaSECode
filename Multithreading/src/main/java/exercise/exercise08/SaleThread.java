package exercise.exercise08;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/2 9:35
 */
public class SaleThread extends Thread{
    /**
     * 票资源对象
     */
    private  Ticket ticket;
    public SaleThread(String name,Ticket ticket){
        super(name);
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
                ticket.sale();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}
