package study.interfacestudy.detail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/9 17:14
 * todo：接口使用细节:
 *      1.接口不能被实例化
 *      2.接口中所有的方法都是public的,接口中抽象方法,可以省略abstract修饰符
 *       即接口中实现方法[默认方法,静态方法]可以省略public修饰符,抽象方法可以省略public abstract修饰符
 *      3.一个普通类实现接口就必须实现该接口中所有的抽象方法
 *      4.抽象类实现接口可以不用实现接口中的抽象方法[可以实现一部分一部分不实现,也可以完全
 *           实现,也可以完全不实现]
 *      5.一个类可以同时实现多个接口
 *      6.接口中的属性,只能是final修饰的,而且必须是public static final修饰符
 *      7.接口中属性的访问形式:接口名.属性名
 *      8.一个接口不能继承其他类,但是可以继承接口,并且是多继承
 *      9.接口的修饰符只能是public和默认,这点和类的修饰符一样.
 *   实现接口和继承类:
 *      继承的价值主要在于:解决代码的复用性和可维护性
 *      接口的价值主要在于:设计,设计好各种规范(方法),让其他类去实现这些方法,即更加灵活
 *      接口比继承更加灵活:
 *        继承满足的是 is - a 的关系,接口只需要满足  like - a  的关系
 *      接口在一定程度上可以实现代码解耦,[即接口规范性 + 动态绑定机制]
 */
public class InterfaceDetail {
    public static void main(String[] args) {
        //todo:接口不能被实例化
        //'IA' is abstract; cannot be instantiated
        //IA ia = new IA();
        //证明接口中的属性是public static final修饰的
        //证明是static修饰的
        System.out.println(IA.n1);
        //证明是 final修饰的
        //Cannot assign a value to final variable 'n1'
        //IA.n1 = 30;
    }
}
