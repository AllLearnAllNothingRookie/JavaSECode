package study.threadmethod.threadinterrupt;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 16:10
 */
public class T extends Thread{
    @Override
    public void run() {
        while (true){
            for (int i = 0;i < 100;i ++){
                System.out.println(Thread.currentThread().getName() + "吃包子~~~" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠中~~~");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                //当该线程执行到一个interrupt 方法时，就会catch一个异常，可以加入自己写的业务代码
                //  InterruptedException : 捕获到一个中断异常
                System.out.println(Thread.currentThread().getName() + "被interrupt了");
            }
        }
    }
}
