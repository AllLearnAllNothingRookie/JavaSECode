package study.classloaderstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 21:30
 * todo:当使用某个类的静态成员时，会先初始化该类
 */
public class TestC {
    public static void main(String[] args) {
        System.out.println(C.num);
    }
}
