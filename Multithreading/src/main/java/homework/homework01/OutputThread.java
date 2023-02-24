package homework.homework01;

import java.util.Map;
import java.util.Random;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/31 15:42
 */
public class OutputThread implements Runnable{
    boolean loop = true;
    Random random = new Random();
    @Override
    public void run() {
        while (loop){
            System.out.println(random.nextInt(100));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
