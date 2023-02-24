package study.staticstudy.staticvariabledetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/4 22:53
 * todo: 类变量的细节:
 *      1.什么时候需要类变量：
 *          当需要某个类的所有对象都共享一共变量时，可以考虑使用类变量(静态变量)
 *      2.类变量[静态变量]与实例变量[普通属性]的区别:
 *          类变量是该类的所有对象共享的,而实例变量是每个对象独享的
 *      3.有static修饰的变量称为类变量或静态变量,否则称为实例变量/普通变量/非静态变量
 *      4.类变量可以通过 类名.类变量名 或者 对象名.类变量名 来访问，但是推荐通过
 *          类名.类变量名来访问,实例变量只能通过 对象名.实例变量名 来访问
 *           且都必须满足修饰符的范围权限和范围
 *      5.实例变量不能通过 类名.实例变量名 来访问
 *      6.类变量实在类加载时就初始化了,也即是说即使没有创建对象,只要类加载了,就可以使用类变量了
 *      7.类变量的生命周期是随着类的加载而开始，随着类的消亡而销毁
 */
public class StaticDetail {
    public static void main(String[] args) {
        Detail detail = new Detail();
        /*
       todo: 类变量可以通过 类名.类变量名 或者 对象名.类变量名 来访问，但是推荐通过
         *       类名.类变量名来访问,实例变量只能通过 对象名.实例变量名 来访问
         *       且都必须满足修饰符的范围权限和范围
         */
        //推荐
        System.out.println(Detail.name);
        System.out.println(detail.name);
        System.out.println(detail.age);
        //非静态变量不能通过 类名.变量名 来访问
        //Non-static field 'age' cannot be referenced from a static context
       // System.out.println(Detail.age);

    }
}
