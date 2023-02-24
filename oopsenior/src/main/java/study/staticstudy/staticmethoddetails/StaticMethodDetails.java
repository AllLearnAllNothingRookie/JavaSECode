package study.staticstudy.staticmethoddetails;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/5 22:21
 *  todo:静态方法细节：
 *      1.类方法和普通方法都是随着类的加载而加载,将结构信息存储在方法区
 *          类方法中无this的参数(类方法中不能使用this和super)
 *          普通方法中隐含着this的参数(普通方法中可以使用this)
 *      2.类方法可以通过类名调用,也可以通过对象名调用,普通方法只能通过对象名调用
 *      3.普通方法和对象有关,需要通过对象名调用,如对象名.方法名(参数),不能通过类名调用
 *      4.类方法中不允许使用与对象相关的关键字如this,super
 *      5.普通方法中可以使用与对象相关的关键字(this,super)
 *      6.类方法(静态方法)中只能访问静态变量或静态方法,
 *          但是可以通过在静态成员中创建对象的方式访问类中的非静态成员
 *      7.普通成员方法既可以访问静态变量和静态方法,可以可以访问非静态变量和非静态方法
 */
public class StaticMethodDetails {
    public static void main(String[] args) {
        Detail.he();
    }
}
