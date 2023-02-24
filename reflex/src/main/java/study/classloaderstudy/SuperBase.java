package study.classloaderstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 22:02
 * todo:使用某个类的静态常量，不会导致类的初始化。
 */
public class SuperBase {
    public static final  int MAX_VALUE = 100;
    static {
        System.out.println("父类初始化");
    }
}
