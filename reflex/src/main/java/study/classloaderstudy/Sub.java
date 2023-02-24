package study.classloaderstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 22:03
 * todo:使用某个类的静态常量，不会导致类的初始化。
 */
public class Sub extends SuperBase{
    static {
        System.out.println("子类初始化");
    }
}
