package exercise.exercise02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/1 16:26
 * 使用多线程模拟两个售票窗口，共同出售100张票。两个线程分别命名为普通窗口和紧急窗口。
 * 获取主线程的优先级查看器是否是NORM_PRIORITY，并且把紧急窗口线程的优先级设置为
 * MAX_PRIORITY，把普通窗口的线程优先级设置为MIN_PRIORITY。启动线程，
 * 实现两个窗口同时售票。
 */
public class TestThreadPriority {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            private int tickets = 100; //票数
            @Override
            public void run() {
                while (true){
                    if (tickets <= 0){
                        System.out.println("票已经售罄。");
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + "" +
                            "卖了一张票，当前票数:" + (--tickets));
                }
            }
        };
        Thread thread1 = new Thread(runnable,"普通窗口");
        Thread thread2 = new Thread(runnable,"紧急窗口");
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("普通窗口的优先级:" + thread1.getPriority());
        System.out.println("紧急窗口的优先级:" + thread2.getPriority());
        System.out.println("主线程的优先级:" + Thread.currentThread().getPriority());
        thread1.start();
        thread2.start();
    }
}
