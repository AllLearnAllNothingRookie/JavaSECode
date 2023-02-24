package study.threadmethod.threadjoin.exercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 17:21
 */
public class ChildThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1;i <= 10;i ++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("子线程 ： hello " + i);
        }
        System.out.println("子线程执行完毕");
    }
}
