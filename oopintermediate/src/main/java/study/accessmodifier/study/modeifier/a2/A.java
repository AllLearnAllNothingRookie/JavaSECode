package study.accessmodifier.study.modeifier.a2;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/19 21:59
 *  细节:
 *  1. 修饰符可以用来修饰类的中的属性、方法、构造器，
 *          和类[注意类只能用public或default修饰，不能用protected和private进行修饰]
 *  2. 只有默认和public才能修饰类，并遵守属性的访问权限特点
 *  3.成员方法的范围规则和属性一样
 */
// 使用public修饰类
public class A {
    /**
     * public ：公开级别，用public修饰，对外公开
     */
    public int n1 = 100;
    /**
     * protected：受保护级别，用protected修饰 ，对子类和同一个包中的类公开
     */
    protected  int n2 = 200;
    /**
     *  ：默认级别(default),没有修饰符号，香同一个包的类公开
     *
     */
    int n3 = 300;
    /**
     * private: 私有级别，用private修饰，只有本类可以访问，不对外公开
     */
    private int  n4 = 400;
    public void  m(){
        /**
         * 在同一个类中可以访问public、protected、default[默认/缺省]、private修饰的属性或方法
         */
        //同一个类类中四种访问修饰符休书的变量都可以访问到
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
        med1();
        med2();
        med3();
        med4();
    }
    public void med1(){
        System.out.println("public");
    }
    protected void med2(){
        System.out.println("protected ");
    }
    void  med3(){
        System.out.println("default");
    }
    private void med4(){
        System.out.println("private");
    }
}
//使用默认修饰符修饰类
class D{}
//不能使用private 修饰类
//Modifier 'private' not allowed here
//private class  E{}
//不能使用protected 修饰类
//Modifier 'protected' not allowed here
//protected class E{}