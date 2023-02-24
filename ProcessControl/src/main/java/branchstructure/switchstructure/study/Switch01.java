package branchstructure.switchstructure.study;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/21 20:31
 * @Version 1.0
 */
public class Switch01 {
    /**
     * 输入a,b,c,d,e,f,g
     * 输出 星期一，星期二 。。。。
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符:");
        char day = input.next().charAt(0);
        switch (day){
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
                break;
            case 'g':
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
