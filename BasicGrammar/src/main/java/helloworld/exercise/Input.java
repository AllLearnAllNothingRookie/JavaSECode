package helloworld.exercise;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/20 20:07
 * @Version 1.0
 */
public class Input {
    /**
     * 接受用户输入
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入名字:");
        //接收用户输入
        //当程序执行到此处是程序会等待用户输入
        String name = input.next();
        System.out.println("请输入年龄:");
        int age = input.nextInt();
        System.out.println("请输入薪水:");
        double sal = input.nextDouble();
        System.out.println(name + "年龄为:" + age +"岁,薪水是:" + sal + "美元。");
    }
}
