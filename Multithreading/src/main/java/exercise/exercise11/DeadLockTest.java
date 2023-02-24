package exercise.exercise11;

import study.threadexit.T;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/2 14:19
 */
public class DeadLockTest {
    public static void main(String[] args) {
        Object goods = new Object();
        Object money = new Object();
        Owner owner = new Owner(goods,money);
        Customer customer = new Customer(goods,money);
        new Thread(owner).start();
        new Thread(customer).start();
    }
}
