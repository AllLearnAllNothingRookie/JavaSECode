package study.iostream.exercise;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/10 14:38
 * 现在有一个银行账户类（Account 类）对象需要保存到account.dat 文件中。
 * Account 类包括静态变量利率，实例变量为账号、户主、密码、余额等。
 */
public class ObjectOutputStreamTest {
    public static void main(String[] args) {
        Account.setInterestRate(0.0024);
        Account account = new Account("10000111","李华","123456",1958.85);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("D:\\account.dat"));
            oos.writeObject(account);
            oos.flush();
            System.out.println("保存成功");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
