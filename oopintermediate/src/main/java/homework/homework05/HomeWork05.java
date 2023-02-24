package homework.homework05;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 21:26
 *  在类上扩展新类CheckingAccount，对每次存款和取款都收1元手续费
 *  在类上扩展新类SavingsAccount,每个月都有利息产生，earnMonthlyInterest方法被调用
 *    并且每个月有三次免手续费的存取款，在earnMonthlyInterest方法中重置交易次数
 */
public class HomeWork05 {
    public static void main(String[] args) {
        System.out.println("==============BankAccount===============");
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.deposit(100);
        System.out.println("余额为:" + bankAccount.getBalance());
        bankAccount.withdraw(100);
        System.out.println("余额为:" + bankAccount.getBalance());
        CheckingAccount checkingAccount = new CheckingAccount(100);
        System.out.println("=============CheckingAccount===============");
        checkingAccount.deposit(100);
        System.out.println("余额为:" + checkingAccount.getBalance());
        checkingAccount.withdraw(100);
        System.out.println("余额为:" + checkingAccount.getBalance());
        SavingsAccount savingsAccount = new SavingsAccount(100);
        System.out.println("===========SavingsAccount=============");
        savingsAccount.deposit(100);
        System.out.println("余额为:" + savingsAccount.getBalance());
        savingsAccount.deposit(100);
        System.out.println("余额为:" + savingsAccount.getBalance());
        savingsAccount.deposit(100);
        System.out.println("余额为:" + savingsAccount.getBalance());
        savingsAccount.deposit(100);
        System.out.println("余额为:" + savingsAccount.getBalance());
        //下一个月
        savingsAccount.earnMonthlyInterest();
        System.out.println("余额为:" + savingsAccount.getBalance());
        savingsAccount.withdraw(100);
        System.out.println("余额为:" + savingsAccount.getBalance());
        savingsAccount.withdraw(100);
        System.out.println("余额为:" + savingsAccount.getBalance());
        savingsAccount.withdraw(100);
        System.out.println("余额为:" + savingsAccount.getBalance());
        savingsAccount.withdraw(100);
        System.out.println("余额为:" + savingsAccount.getBalance());
        savingsAccount.deposit(100);
        System.out.println("余额为:" + savingsAccount.getBalance());
    }
}
