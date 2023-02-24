package study.encapsulation.exercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/20 17:55
 * Account要求属性姓名(长度为2位、3位或者4位),余额(大于20),密码(必须是6位),如果不满足
 * 给出提示并给默认值
 */
public class Account {
    private  String name;
    private double balance;
    private String password;
    public Account(){

    }
    public Account(String name,double balance,String password){
        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4){
            this.name = name;
        }else {
            System.out.println("你输入的姓名不符合规范");
            this.name = "佚名";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 20){
            this.balance = balance;
        }else {
            System.out.println("余额太少啦，默认为0");
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6){
            this.password = password;
        }else {
            System.out.println("密码位数不对，设置为默认密码:666666");
            this.password = "666666";
        }
    }
    public void info(){
        System.out.println("姓名:" + name +"余额:" + balance + "密码:" + password);
    }
}
