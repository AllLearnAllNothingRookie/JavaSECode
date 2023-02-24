package study.classloaderstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 21:43
 * todo:当初始化子类时，如果父类没有被初始化，则会先初始化父类
 */
public class EBase {
    static {
        System.out.println("父类初始化");
    }
}
