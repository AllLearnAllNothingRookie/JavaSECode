package study.classloaderstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 22:04
 * todo:使用某个类的静态常量，不会导致类的初始化。
 */
public class NoInitializeTest {
    public static void main(String[] args) {
        System.out.println(SuperBase.MAX_VALUE);
        System.out.println(Sub.MAX_VALUE);
    }
}
