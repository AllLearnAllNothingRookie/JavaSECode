package exercise.exercise03;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/1 20:32
 * 通过Thread类的sleep方法实现新年倒计时效果
 */
public class SleepTest {
    public static void main(String[] args) {
        for (int i = 10 ;i >= 0 ;i --){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("新年快乐！");
    }
}
