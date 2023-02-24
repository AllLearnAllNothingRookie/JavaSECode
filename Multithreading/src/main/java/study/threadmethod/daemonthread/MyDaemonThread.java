package study.threadmethod.daemonthread;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 20:46
 */
public class MyDaemonThread extends Thread{
    @Override
    public void run() {
        for (;;){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("自定义线程");
        }
    }
}
