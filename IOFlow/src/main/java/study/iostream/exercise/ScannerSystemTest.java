package study.iostream.exercise;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/10 17:28
 */
public class ScannerSystemTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("姓名:");
        String name = input.nextLine();
        System.out.print("性别:");
        char gender = input.next().charAt(0);
        System.out.print("年龄:");
        int age = input.nextInt();
        System.out.print("电话:");
        String phone = input.next();
        System.out.print("邮箱:");
        String email = input.next();
        System.out.println("姓名：" + name);
        System.out.println("性别：" + gender);
        System.out.println("年龄：" + age);
        System.out.println("电话：" + phone);
        System.out.println("邮箱：" + email);
        input.close();
    }
}
