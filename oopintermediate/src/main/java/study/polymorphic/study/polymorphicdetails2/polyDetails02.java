package study.polymorphic.study.polymorphicdetails2;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/27 21:24
 *  todo: 属性没有重写之说,属性的值看编译类型,即向上转型时不能调用运行类型的属性
 *         即属性和方法能不能调用看编译类型
 *         [编译类型里有的属性和方法才能调用，编译类型没有没有的属性和方法不能调用]，
 *              而方法调用时从运行类型开始查找
 *              属性则是直接使用编译类型的值
 */
public class polyDetails02 {
    public static void main(String[] args) {
        //todo: 属性没有重写之说,属性的值看编译类型
        Base base = new Sub();
        //todo：输出编译类型对应的属性值
        System.out.println(base.count);
        //todo:不能调用父类的属性
        //System.out.println(base.age);

        //向下转型后即可调用 即现在编译类型为子类
        Sub sub = (Sub) base;
        System.out.println(sub.age);
        System.out.println(sub.count);
    }
}
