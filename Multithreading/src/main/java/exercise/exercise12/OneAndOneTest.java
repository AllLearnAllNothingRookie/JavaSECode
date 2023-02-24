package exercise.exercise12;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/2 15:50
 * 案例需求：有家快餐店规模比较小，后厨与饭堂之间的取餐口比较小，只能放一份快餐，
 * 厨师做完快餐后会放在取餐口的工作台上，服务员从取餐口的工作台取快餐给顾客，
 * 现在该餐馆只有一个厨师和服务员。厨师相当于生产者，服务员相当于消费者，
 * 他们两共享取餐口的工作台，请用代码模拟工作场景。
 * 案例分析：
 *   首先需要声明工作台这个资源类，厨师线程和服务员线程都要访问和操作工作台对象Workbench。
 * 工作台对象中需要有表示快餐数量的成员变量，并且需要设计两个方法，一个是put方法，
 * 用于实现厨师做好快餐访问工作台的需求，即快餐数量增加；另一个是take方法，
 * 用于实现服务员取走快餐访问工作台的需求，即快餐数量减少。
 *  其次，需要声明两个线程类，一个表示厨师线程(Cook)，在其run方法中，
 *通过工作台对象调用put方法；另一个表示服务员线程(Waiter)，
 *通过工作台对象调用take方法。这里要考虑到厨师线程和服务员线程操作的是同一个工作台，
 *所以需要在创建厨师线程对象和服务员线程对象时，同参数传入工作台对象。
 */
public class OneAndOneTest {
    public static void main(String[] args) {
        Workbench workbench = new Workbench();
        Cook cook = new Cook(workbench);
        Waiter waiter = new Waiter(workbench);
        cook.start();
        waiter.start();
    }
}
