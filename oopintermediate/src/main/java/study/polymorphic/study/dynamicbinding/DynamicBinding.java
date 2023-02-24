package study.polymorphic.study.dynamicbinding;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/28 16:21
 *  todo:java的动态绑定机制
 *      1.当调用对象的方法时，该方法会和该对象的内存地址/运行类型绑定
 *          即：调用方法时先从运行类型开始查找，然后在在运行类型的父类
 *      2.当调用对象属性时，没有动态绑定机制，哪里声明就在哪里调用
 *          即:在方法中/类中调用属性时调用本类中定义的属性，且遵守继承的关系，即在
 *           本类调用属性时如果没有则查找父类的属性
 */
public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        //注销子类的sum方法前
       /* System.out.println(a.sum()); // 40
        System.out.println(a.sum1()); // 30*/
        //注销子类的sum方法后
        System.out.println(a.sum()); // 30
        System.out.println(a.sum1()); // 30
        //注销子类的sum和sum1后
        System.out.println(a.sum()); // 30
        System.out.println(a.sum1()); // 20
    }
}
