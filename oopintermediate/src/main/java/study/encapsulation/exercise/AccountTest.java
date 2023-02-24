package study.encapsulation.exercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/20 19:57
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setPassword("66666666");
        account.setName("12346");
        account.setBalance(12);
        account.info();
        account.setPassword("789654");
        account.setName("小张");
        account.setBalance(99999);
        account.info();
        System.out.println(null + "");
    }
}
