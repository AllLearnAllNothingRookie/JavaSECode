package study.classloaderstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 21:24
 * todo:当虚拟机启动，线初始化主方法所在的类
 */
public class A {
    static {
        System.out.println("init....A");
    }

    public static void main(String[] args) {

    }
}
