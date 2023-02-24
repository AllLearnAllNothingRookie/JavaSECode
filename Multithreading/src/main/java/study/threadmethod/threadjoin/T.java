package study.threadmethod.threadjoin;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 17:06
 */
public class T extends Thread{
    @Override
    public void run() {

        for (int i = 1;i <= 20;i ++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("子线程hello" + i);
        }
    }
}
