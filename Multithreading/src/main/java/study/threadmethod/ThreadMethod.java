package study.threadmethod;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 14:18
 * todo:线程常用的方法
 *  1.setName : 设置线程名称
 *  2.getName: 返回线程名称
 *  3.start: 使该线程开始执行，Java虚拟机底层调用该线程的start0方法
 *  4.run: 调用线程对象的run方法
 *  5.setPriority: 更改线程的优先级
 *  6.getPriority: 获取线程的优先级
 *  7.sleep：在指定毫秒数内让当前正在执行的线程休眠
 *  8.interrupt: 中断线程
 *  注意事项和细节:
 *   1. start底层会创建新的线程，调用run，run方法就是一个简单的方法调用，不会启动新线程
 *   2.线程优先级范围：
 *      public final static int MIN_PRIORITY = 1; The minimum priority that a thread can have.
 *      public final static int NORM_PRIORITY = 5;  The default priority that is assigned to a thread.
 *      public final static int MAX_PRIORITY = 10; The maximum priority that a thread can have.
 *   3.interrupt方法，中断线程，但并没有真正的结束线程，所有一般用于中断正在休眠的线程
 *   4.sleep：静态方法面试当前线程休眠
 *
 * todo:线程常用方法2：
 *      1.yield:线程让步，让出cpu，让其他线程执行，但是让步时间不确定，所以也不一定能让步成功
 *      2.join: 线程插入，插入的线程一旦插入成功免责肯定先执行玩插入线程的所有的任务
 *
 *todo: 用户线程和守护线程
 *      用户线程: 也叫工作线程，当线程的任务执行完 或 通知方式 结束
 *      守护线程: 一般为工作线程服务的，当所有的用户线程结束，守护线程自动结束
 *      常见的守护线程： 垃圾回收机制
 */
public class ThreadMethod {

}
