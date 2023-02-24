package study.threadstate;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 21:06
 */
public class MyThread extends Thread{
    @Override
    public void run() {
       for (int i = 1;i <= 10;i ++){
           System.out.println(i);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
