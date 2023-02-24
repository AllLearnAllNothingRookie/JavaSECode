package study.threadmethod.threadjoin.exercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 17:21
 * 主线程每隔1s输出hi，一个10次，当输出到5次时，启动一个子线程，每隔1s输出hello，子线程
 * 输出10此后退出，主线程继续输出，直到线程退出
 */
public class ThreadJoinExercise {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ChildThread());
        System.out.println("主线程开始执行");
        for (int i = 1;i <= 10;i ++){
            Thread.sleep(1000);
            System.out.println("主线程 ： hi " + i);
            if (i == 5){
                System.out.println("子线程开始执行");
                //启动子线程
                thread.start();
                //让子线程插入，让子线程先执行
                thread.join();
            }
        }
        System.out.println("主线程执行完毕");
    }
}
