package exercise.exercise11;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/2 14:17
 */
public class Customer implements Runnable{
    /**
     * 商品
     */
    private Object goods;
    /**
     * 金钱
     */
    private Object money;

    public Customer(Object goods, Object money) {
        this.goods = goods;
        this.money = money;
    }

    @Override
    public void run() {
        synchronized (money){
            System.out.println("卖家先发货");
            synchronized (goods){
                System.out.println("顾客付钱");
            }
        }
    }
}
