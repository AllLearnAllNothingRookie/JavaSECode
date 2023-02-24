package exercise.exercise11;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/2 14:14
 */
public class Owner implements Runnable{
    /**
     * 商品
     */
    private Object goods;
    /**
     * 金钱
     */
    private Object money;

    public Owner(Object goods, Object money) {
        this.goods = goods;
        this.money = money;
    }

    @Override
    public void run() {
        synchronized (goods){
            System.out.println("顾客先付钱");
            synchronized (money){
                System.out.println("卖家发货");
            }
        }
    }
}
