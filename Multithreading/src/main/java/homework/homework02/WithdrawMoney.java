package homework.homework02;

import study.threadmethod.threadjoin.T;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/31 16:15
 */
public class WithdrawMoney extends Thread {
    private static double  balance = 10006;
    private static boolean loop = true;
    @Override
    public void run() {
        while (loop){
            try {
                withdrawMoney(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public  void  withdrawMoney(double money) throws InterruptedException {
        synchronized (WithdrawMoney.class){
            if (balance < money){
                System.out.println("钱不够了");
                System.out.println("最后余额为:" + balance);
                loop = false;
                return;
            }
            balance -= money;
            System.out.println(Thread.currentThread().getName() + "取款：" + money);
            System.out.println("余额为:" + balance);
            Thread.sleep(1000);
        }
    }
}
