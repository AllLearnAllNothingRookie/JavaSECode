package exercise.exercise13;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/2 15:50
 * 案例需求：上个案例的快餐店经营良好，开始出现顾客增多的良好趋势，
 * 但是取餐口仍然只能放一份快餐，厨师做完快餐后将快餐放在工作台上，
 * 服务员从取餐口的工作台取出快餐给顾客，但是可以有多个厨师和多个服务员可以同时工作。
 * 请编写代码模拟这个工作场景。
 */
public class ManyAndManyTest {
    public static void main(String[] args) {
        Workbench workbench = new Workbench();
        Cook cook1 = new Cook(workbench);
        Cook cook2 = new Cook(workbench);
        Waiter waiter1 = new Waiter(workbench);
        Waiter waiter2 = new Waiter(workbench);
        cook1.start();
        cook2.start();
        waiter1.start();
        waiter2.start();
    }
}
