package study.classloaderstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 22:06
 * todo:通过子类引用父类的静态变量，不会导致子类初始化。
 */
public class NSub extends NBase{
    static {
        System.out.println("子类初始化");
    }
}
