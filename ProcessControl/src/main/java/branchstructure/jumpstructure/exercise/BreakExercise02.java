package branchstructure.jumpstructure.exercise;

import branchstructure.forstructure.study.For01;
import java.util.Scanner;
import javax.xml.transform.Source;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/6 21:40
 * 实现登录验证有3次机会，如果用户名输入正确则提示登录成功，否则提示还有几次机会
 */
public class BreakExercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean falg = false;
        for (int i = 2;i >= 0 ;i -- ){
            System.out.println("请输入用户名:");
            String name = input.next();
            System.out.println("请输入密码:");
            String pass = input.next();
            if ("admin".equals(name) && "666".equals(pass)){
                falg = true;
                System.out.println("登录成功");
                break;
            }
            System.out.println("登录失败，还有" + i + "次机会");
        }
        if (!falg){
            System.out.println("登录失败，一会在试试吧");
        }else {
            System.out.println("进入系统");
        }
    }
}
