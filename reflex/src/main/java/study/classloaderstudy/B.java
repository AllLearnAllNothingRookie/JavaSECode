package study.classloaderstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 21:26
 * todo:当创建一个类的实例对象时，如果这个类没有初始化，就会先初始化这个类
 */
public class B {
    static {
        System.out.println("init .... B");
    }
}
