package study.importexception;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/28 15:04
 * todo:ClassCastException 类型转换异常
 *   当试图将对象强制转换为不是实例的子类时，抛出该异常
 */
public class ClassCastExceptionStudy {
    public static void main(String[] args) {
        A a = new B();
        B b = (B) a;
        C c = (C) a;
    }
}
class A{

}
class B extends  A{

}
class C extends A{

}