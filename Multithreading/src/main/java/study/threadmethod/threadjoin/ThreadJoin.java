package study.threadmethod.threadjoin;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 16:57
 * main线程创建一个子线程，每隔一秒输出 hello，输出20次，主线程每隔一秒输出 hi输出20次
 * 要求：两个线程同时执行，当主线程输出5次后，就让子线程输出完毕，主线程在继续
 */
public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();
        for (int i  = 1;i <= 20;i ++){
            Thread.sleep(1000);
            System.out.println("主线程 hi" + i);
            if (i == 5){
                System.out.println("主线程让子线程先运行");
                //线程插入
                //t.join();
                //线程让步，不一定成功
                Thread.yield();
                System.out.println("子线程执行完毕后，主线程继续执行");
            }
        }
    }
}
