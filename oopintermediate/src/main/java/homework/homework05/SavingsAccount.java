package homework.homework05;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 21:36
 * 每个月都有利息产生，并且每月有三次免手续费的存取款
 */
public class SavingsAccount extends BankAccount{
    private int free = 3;
    private double interest = 0.0005;
    public SavingsAccount(double balance) {
        super(balance);
    }

    public int getFree() {
        return free;
    }

    public void setFree(int free) {
        this.free = free;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void earnMonthlyInterest(){
        //利息每个月0.5%
        //setBalance(getBalance() * interest);
        super.deposit(getBalance() * interest);
        //重置免费存取款次数
        free = 3;
    }

    @Override
    public void deposit(double amount) {
        if (free <= 0){
            super.withdraw(1);
           // setBalance(getBalance() - 1);
        }
        free --;
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        if (free <= 0){
            super.withdraw(1);
           // setBalance(getBalance() - 1);
        }
        free --;
        super.withdraw(amount);
    }
}
