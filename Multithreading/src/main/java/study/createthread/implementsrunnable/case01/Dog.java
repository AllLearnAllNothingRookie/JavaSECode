package study.createthread.implementsrunnable.case01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/29 21:37
 */
public class Dog implements Runnable{
    int count = 0;
    /**
     * 每隔一秒输出一句 小狗汪汪叫
     */
    @Override
    public void run() {
        while (true){
            ++ count;
            System.out.println("小狗汪汪叫" + count + "\t线程名:" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            if (count == 10){
                break;
            }
        }
    }
}
