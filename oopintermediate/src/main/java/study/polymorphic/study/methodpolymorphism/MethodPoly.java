package study.polymorphic.study.methodpolymorphism;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/27 13:01
 *  todo: 多态介绍:
 *          方法活对象具有多种形态，是面向对象的第三大特征，多态是建立在封装和继承基础之上的
 *      多态的具体体现：
 *          1.方法多态
 *              重写和重载就是方法多态的体现
 *           2.对象的多态 [父类引用指向子类对象]
 *              1.一个对象的编译类型和运行类型可以不一致 [父类引用指向子类对象]
 *              2.编译类型是在定义对象时就确定了不能改变
 *              3.运行类型是可以改变的
 *              4.编译类型定义时看 "="的左边,运行类型看 "=" 的右边
 */
public class MethodPoly {
    public static void main(String[] args) {
        A a = new A();
        // todo:方法重载体现多态
        // 传入不同的参数就会调用不同的sum方法，体现出多态
        System.out.println(a.sum(10,20));
        System.out.println(a.sum(10,20,30));
        // todo: 方法重写体现多态
        B b = new B();
        // 调用方法的对象不同就会执行不停的say方法，体现出多态
        b.say();
        a.say();
    }
}
