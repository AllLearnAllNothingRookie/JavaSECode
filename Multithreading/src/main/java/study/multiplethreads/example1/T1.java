package study.multiplethreads.example1;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 10:09
 */
public class T1 implements Runnable{
    int count = 0;
    /**
     * 每隔一秒输出hello world ，输出10次
     */
    @Override
    public void run() {
        while (true){
            ++ count;
            System.out.println("Hello,World" + count + "\t" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 10){
                break;
            }
        }
    }
}
