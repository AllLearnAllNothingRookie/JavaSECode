package study.innerclass.study.staticinnerclass;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/11 15:15
 * todo:静态内部类:
 *   说明:静态内部类是定义在外部类的成员位置,并且有static修饰
 *   1.静态内部类可以直接访问外部类所有的静态成员,包含私有的,但是不能直接访问非静态成员
 *   2.静态内部类可以添加任意访问修饰符(public,protected,默认,private),因为静态内部类
 *      的地位是一个成员
 *   3.静态内部类的作用域:同其他成员,为整个类
 *   4.静态内部类访问外部类成员: 访问方式:直接访问所有的静态成员,不能访问外部类非静态成员
 *   5.外部类访问静态内部类的成员:创建对象,再访问
 *   6.外部其他类访问静态内部类的成员:
 *      1. 外部类.静态内部类 静态内部类对象 = new 外部类.静态内部类(参数列表);
 *      2.在外部类中提供一个方法返回静态内部类对象:
 *          外部类  外部类对象 = new 外部类(参数列表);
 *          外部类.静态内部类 静态内部类对象 = 外部类对象.返回静态内部类的方法;
 *      3.在外部类中提供一个静态方法返回静态内部类对象:
 *      外部类.静态内部类 静态内部类对象 = 外部类对象.返回静态内部类的静态方法;
 *   7.如果外部类和局部内部类的成员重名了后,默认遵循就近原则,如果想在局部内部类中
 *       访问外部类的成员则可以使用 外部类名.成员 去访问
 */
public class StaticInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.f1();
        /**
         * todo:外部其他类访问静态内部类的成员:
         */
        //todo:方式1:因为是静态内部类可以直接通过类名直接访问(前提要有权限)
        Outer.Inner inner = new Outer.Inner();
        System.out.println(inner.sex);
        inner.say();
        //todo:方式2:在外部类中提供一个方法返回静态内部类实例
        Outer outer1 = new Outer();
        Outer.Inner inner1 = outer1.getInner();
        System.out.println(inner1.sex);
        inner1.say();
        //todo:方式3:在外部类中提供一个静态方法返回静态内部类实例
        Outer.Inner inner2 = Outer.getStaticInner();
        System.out.println(inner2.sex);
        inner2.say();
        /**
         * todo：
         *  如果外部类和局部内部类的成员重名了后,默认遵循就近原则,如果想在局部内部类中
         *       访问外部类的成员则可以使用 外部类名.成员 去访问
         */
        inner.test();
    }
}
