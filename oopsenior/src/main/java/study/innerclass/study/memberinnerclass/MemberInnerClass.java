package study.innerclass.study.memberinnerclass;


/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/11 14:40
 * todo: 成员内部类
 *     说明:成员内部类是定义在类的成员位置,并且没有static修饰
 *     1.成员内部类可以直接访问外部类的所有成员,包括私有的
 *     2.成员内部类可以添加任意的访问修饰符(public,protected,默认,private)，因为
 *       成员内部类的地位就是一个成员
 *     3.成员内部类的作用域和其他外部类的成员一样,为整个类体
 *     4.成员内部类访问外部类成员:访问方式:直接访问
 *     5.外部类访问成员内部类成员: 访问方式: 创建对象,再访问 [可以范围私有属性]
 *     6.外部其他类访问成员内部类成员:
 *          1. 外部类  外部类对象  = new 外部类(参数列表);
 *             外部类.内部类   内部类对象 = 外部类对象.new 内部类(参数列表);
 *            简写:
 *             外部类.内部类   内部类对象 = new 外部类(参数列表).new 内部类(参数列表);
 *         2.在内部类种提供一个返回内部类对象方法:
 *            外部类  外部类对象  = new 外部类(参数列表);
 *            外部类.内部类   内部类对象 = 外部类对象.返回内部类对象的方法;
 *         通过内部类对象进行访问内部类成员
 *     7.如果外部类和局部内部类的成员重名了后,默认遵循就近原则,如果想在局部内部类中
 *       访问外部类的成员则可以使用 外部类名.this.成员 去访问
 *       外部类名.this:本质就是一个外部类的对象,谁调用方法就是那个类
 */
public class MemberInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.f1();
        //todo:外部其他类访问成员内部类的三种方式
        //  todo:1. 第一种方式：
        Outer outer1 = new Outer();
        Outer.Inner inner =outer1.new Inner();
        System.out.println(inner.sex);
        inner.say();
        //todo:简写:
        Outer.Inner inner2 = new Outer().new Inner();
        System.out.println(inner2.sex);
        inner2.say();
        // todo:2.第二种方式:在外部类种提供一个方法返回成员内部类对象
        Outer outer2 = new Outer();
        Outer.Inner inner1 = outer2.getInner();
        System.out.println(inner1.sex);
        inner1.say();
    }
}
