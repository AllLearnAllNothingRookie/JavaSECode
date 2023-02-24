package homework.homework04;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/27 14:28
 */
public class TestA {
    public static void main(String[] args) {
        A a = new A();
        a.fun();
        a.show();
        A.B b = a.new B();
        b.show();
    }
}
