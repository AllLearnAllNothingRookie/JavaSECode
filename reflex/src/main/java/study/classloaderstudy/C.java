package study.classloaderstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 21:29
 * todo:当使用某个类的静态成员时，会先初始化该类
 */
public class C {
    public static  int num = 10;
    static {
        System.out.println("init ... C");
    }
}
