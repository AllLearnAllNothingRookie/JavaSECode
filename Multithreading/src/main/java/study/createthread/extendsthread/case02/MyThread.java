package study.createthread.extendsthread.case02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/31 21:23
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 1;i <= 5;i ++){
            System.out.println(getName() + "线程：" + i);
        }
    }
}
