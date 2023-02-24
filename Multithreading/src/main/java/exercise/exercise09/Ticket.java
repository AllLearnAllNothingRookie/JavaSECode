package exercise.exercise09;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/2 9:33
 * 票
 */
public class Ticket {
    private  int total = 100;
    public void sale(){
        //使用同步代码块，来确保线程同步
        synchronized (this){
            if (total > 0){
                --total;
                System.out.println(Thread.currentThread().getName() + "卖出一张票，剩余:" + total);
            }else {
                throw  new RuntimeException("没票了");
            }
        }
    }
}
