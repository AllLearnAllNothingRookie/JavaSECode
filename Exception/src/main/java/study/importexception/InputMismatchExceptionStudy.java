package study.importexception;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/29 21:50
 * InputMismatchException:输入不匹配异常
 * 在使用Scanner时当输入的数据类型和要接收数据的类型不一致，那么将会发生输入不匹配异常。
 */
public class InputMismatchExceptionStudy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //当输入的数不是整数时就会报错
        //Exception in thread "main" java.util.InputMismatchException
        int num = input.nextInt();
        System.out.println("num = " + num);
    }
}
