package homework.homework02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/31 16:17
 * 由两个用户分别从一个银行卡上取钱每次取 1000 ，当余额不足的时候，就不能取款了
 */
public class Homework02 {
    public static void main(String[] args) {
        WithdrawMoney user1 = new WithdrawMoney();
        user1.setName("用户1");
        user1.start();
        WithdrawMoney user2 = new WithdrawMoney();
        user2.setName("用户2");
        user2.start();
    }
}
