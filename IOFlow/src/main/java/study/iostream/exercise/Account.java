package study.iostream.exercise;

import java.io.Serializable;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/10 14:34
 */
public class Account implements Serializable {
    /**
     * 序列化版本ID[唯一识别]
     */
    private static final long serialVersionUID = 1L;
    /**
     * 利率
     */
    private static  double interestRate;
    /**
     * 账号
     */
    private String number;
    /**
     * 户主
     */
    private String name;
    /**
     * 密码
     */
    private String password;
    /**
     * 余额
     */
    private double balance;

    public Account() {
    }

    public Account(String number, String name, String password, double balance) {
        this.number = number;
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
