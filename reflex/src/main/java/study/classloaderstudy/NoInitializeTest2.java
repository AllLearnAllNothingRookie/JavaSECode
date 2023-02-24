package study.classloaderstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 22:07
 * todo:通过子类引用父类的静态变量，不会导致子类初始化。
 */
public class NoInitializeTest2 {
    public static void main(String[] args) {
        System.out.println(NSub.num);
    }
}
