package study.threadmethod.threadinterrupt;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 16:08
 */
public class ThreadInterrupt {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("线程1");
        //设置线程优先级
        t.setPriority(Thread.MIN_PRIORITY);
        //启动线程
        t.start();


        //主线程打印5句hi后中断子线程的休眠
        for (int i = 0;i < 5; i ++){
            Thread.sleep(1000);
            System.out.println("hi" + i);
        }
        //获取线程的优先级
        System.out.println(t.getName() + "线程的优先级：" + t.getPriority());
        //中断线程
        //当执行到次数代码时就会中断线程的休眠
        t.interrupt();
    }
}
