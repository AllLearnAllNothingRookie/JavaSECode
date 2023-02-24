package alanrookie.homework.homework12;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 22:19
 */
public class HomeWork12Test {
    public static void main(String[] args) {
        HomeWork12 homeWork12 = new HomeWork12();
        //两个对象指向同一个引用
        HomeWork12 home = homeWork12;
        home.m();
        System.out.println(homeWork12.i);
        System.out.println(home.i);
    }
}
