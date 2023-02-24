package homework.homework02;

import java.util.Scanner;
import java.util.SplittableRandom;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/3 11:02
 * 输入用户名，密码和邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象
 *  1. 用户名长度为2或3或4
 *  2. 密码长度为6，要求全为数字
 *  3. 邮箱中包含@和.并且@在.前面
 */
public class Homework02 {
    public static void main(String[] args) {
        String name, password, mailbox ;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入用户名:");
        name = input.nextLine();
        System.out.print("请输入密码:");
        password = input.nextLine();
        System.out.print("请输入邮箱:");
        mailbox = input.nextLine();
        String check = check(name, password, mailbox);
        System.out.println(check);
    }
    public static String check(String name,String password,String mailbox){
        if (!(name != null && password != null && mailbox != null)){
            throw new RuntimeException("参数不能为null");
        }
        if (name.length() < 2  || name.length() > 4){
            throw new RuntimeException("用户名长度为2-4");
        }
        if (password.length() != 6){
            throw new RuntimeException("密码长度为6位");
        }
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) < '0' || password.charAt(i) > '9'){
                throw new RuntimeException("密码必须全为数字");
            }
        }
        int index1 = mailbox.lastIndexOf("@");
        int index2 = mailbox.lastIndexOf(".");
        if (index1 <= 0){
            throw new RuntimeException("邮箱必须包含@,且不能为第一位");
        }
        if (index2 <= 0){
            throw new RuntimeException("邮箱必须包含.");
        }
        if (index2 <= index1){
            throw new RuntimeException("@必须在.前面");
        }
        return "注册成功";
    }
}
