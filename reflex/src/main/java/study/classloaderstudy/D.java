package study.classloaderstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 21:33
 * todo:当使用反射相关API动态使用某个类时，会对该类进行初始化
 */
public class D {
    static {
        System.out.println("init ... D");
    }
}
