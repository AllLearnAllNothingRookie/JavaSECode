package study.createthread.extendsthread.case01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/29 20:33
 * todo:当一个类继承了Thread类，该类可以当作线程使用
 *      run方法时Thread类实现了Runnable接口的run方法
 *     run方法源码
 *     @Override
 *     public void run() {
 *         if (target != null) {
 *             target.run();
 *         }
 *     }
 */
public class Cat extends Thread{
    int times = 0;
    /**
     * 重写run方法。写自己的业务逻辑
     */
    @Override
    public void run() {
        while (true){
            times ++;
            //每隔一秒输出 “喵喵，我是小猫咪”
            System.out.println("喵喵，我是小猫咪" + times +
                    "线程：" + Thread.currentThread().getName());
            //System.out.println("线程名称：" + Thread.currentThread().getName());
            //让线程休眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 80){
                break;
            }
        }
    }
}
