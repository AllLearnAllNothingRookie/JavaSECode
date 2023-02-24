package study.accessmodifier.study.modeifier.a1;

import study.accessmodifier.study.modeifier.a2.A;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/19 22:13
 */
public class B {
    public static void main(String[] args) {
        A a = new A();
        /**
         *在不同包下只可以访问public修饰的属性或方法
         *在不同包不能访问protected、默认/缺省[default]、private修饰的属性或方法
         */
        System.out.println(a.n1);
        //java: n2 在 accessmodifier.study.modeifier.a2.A 中是 protected 访问控制
       // System.out.println(a.n2);
        //java: n3在accessmodifier.study.modeifier.a2.A中不是公共的; 无法从外部程序包中对其进行访问
       // System.out.println(a.n3);
        //java: n4 在 accessmodifier.study.modeifier.a2.A 中是 private 访问控制
        //System.out.println(a.n4);
        a.med1();
        //java: med2() 在 accessmodifier.study.modeifier.a2.A 中是 protected 访问控制
       // a.med2();
        //java: med3()在accessmodifier.study.modeifier.a2.A中不是公共的; 无法从外部程序包中对其进行访问
       // a.med3();
        //java: med4() 在 accessmodifier.study.modeifier.a2.A 中是 private 访问控制
        // a.med4();
    }
}
