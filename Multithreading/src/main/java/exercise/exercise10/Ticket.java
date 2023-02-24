package exercise.exercise10;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/2 9:33
 * 票
 */
public class Ticket {
    private  int total = 100;

    /**
     * 使用同步方法解决线程安全问题，锁为this
     */
    public synchronized void sale(){
        if (total > 0){
            --total;
            System.out.println(Thread.currentThread().getName() + "卖出一张票，剩余:" + total);
        }else {
            throw  new RuntimeException("没票了");
        }
    }
}
