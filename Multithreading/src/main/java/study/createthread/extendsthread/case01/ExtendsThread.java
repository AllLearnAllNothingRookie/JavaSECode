package study.createthread.extendsthread.case01;

import study.createthread.extendsthread.case01.Cat;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/29 20:40
 * todo:多线程的实现1： 继续Thread类
 * todo:主线程结束进程不一定结束，只有当所有的线程都结束了进程才会结束
 */
public class ExtendsThread {
    public static void main(String[] args) {
        //创建Cat对象，当作线程使用
        Cat cat = new Cat();
        //启动线程
        /*
         *
         * 底层源码：
         *   public synchronized void start() {
         *      if (threadStatus != 0)
         *      throw new IllegalThreadStateException();
         *      group.add(this);
         *
         *      boolean started = false;
         *      try {
         *          start0();
         *          started = true;
         *      } finally {
         *          try {
         *              if (!started) {
         *                  group.threadStartFailed(this);
         *              }
         *          } catch (Throwable ignore) {
         *      }
         *  }
         *  }
         *
         *  private native void start0();
         * 本质是start方法调用statr0方法
         *  而statr0是本地方法，是JVM调用，底层是c/c++实现
         *  真正的实现多线程效果，是start0() 而不是run()
         */
        cat.start();
        //run方法就是一个普通的方法，没有真正的启动一个线程，就会把run方法执行完毕，才向下执行
        //cat.run();
        //当main线程启动一个子线程，主线程不会阻塞，会继续执行
        for (int i = 0;i < 100;i ++){
            System.out.println("主线程" + i);
            //休眠
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
