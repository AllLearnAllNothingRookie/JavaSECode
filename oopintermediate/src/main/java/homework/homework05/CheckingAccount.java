package homework.homework05;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 21:33
 * 每次存款和取款都收1元手续费
 */
public class CheckingAccount extends  BankAccount {

    public CheckingAccount(double balance) {
        super(balance);
    }
    @Override
    public void deposit(double amount) {
        //存钱时收取1元手续费
        setBalance(getBalance() - 1);
        //super. withdraw(1);
        super.deposit(amount);
        // super.deposit(amount -1);
    }

    @Override
    public void withdraw(double amount) {
        //存钱时收取1元手续费
       // setBalance(getBalance() - 1);
        super. withdraw(1);
        super.withdraw(amount);
        //super.withdraw(amount + 1);
    }
}
