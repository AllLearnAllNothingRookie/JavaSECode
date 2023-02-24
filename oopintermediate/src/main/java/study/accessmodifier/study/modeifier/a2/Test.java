package study.accessmodifier.study.modeifier.a2;


/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/19 22:02
 */
public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.m();
        /**
         *同包的类中 可以访问 public protected 默认/缺省[default]修饰的属性或方法
         *同包的类中 不可以访问private修饰的属性或方法
         */
        System.out.println(a.n1 );
        System.out.println(a.n2 );
        System.out.println(a.n3 );
        //private：修饰的属性或方法不能在同包的类中访问
        //n4 在 accessmodifier.study.modeifier.A 中是 private 访问控制
        //System.out.println(a.n4 );
        a.med1();
        a.med2();
        a.med3();
        //java: med4() 在 accessmodifier.study.modeifier.a2.A 中是 private 访问控制
        //a.med4();
    }
}
