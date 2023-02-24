package exercise.exercise13;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/2 15:36
 */
public class Workbench {
    /**
     * 工作台最大能存放快餐数量
     */
    private static final  int MAX_VALUE = 1;
    /**
     * 工作台上快餐数量
     */
    private int num;
    /**
     * 厨师制作快餐
     * 同步非静态方法锁是this
     */
    public synchronized void put(){
        while (num >= MAX_VALUE){
            try {
                //厨师线程等待，wait方法由锁对象this调用
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //加入睡眠时间放大现象
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        num ++;
        System.out.println("厨师制作了一份快餐，现在工作台上有" + num + "份快餐");
        //工作台上有快餐了，唤醒服务员线程取快餐
        this.notifyAll();
    }
    /**
     * 服务器取走快餐
     * 同步非静态方法锁是this
     */
    public synchronized void take(){
        while (num <= 0){
            try {
                //工作台上没有快餐了，服务员线程暂停
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //服务员取走快餐
        num --;
        System.out.println("服务员取走了一份快餐，现在工作台上有:" + num + "快餐");
        //服务员取走了快餐，工作台上没有快餐了，唤醒厨师制作快餐
        this.notifyAll();

    }
}

