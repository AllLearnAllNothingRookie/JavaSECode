package exercise.exercise06;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/1 21:28
 * 为主线启动一个守护线程，
 * 守护线程每1毫秒打印一句话"我是MyDaemon，我默默地守护你，只为你而存在。"，
 * 主线程打印1~10的数字。
 */
public class DaemonTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(){
            @Override
            public void run() {
                while (true){
                    System.out.println("我是MyDaemon，我默默地守护你，只为你而存在。");
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        //将线程设置为守护线程
        t.setDaemon(true);
        t.start();
        for (int i = 1;i <= 10;i ++){
            System.out.println("mian:" + i);
            Thread.sleep(10);
        }

    }
}
