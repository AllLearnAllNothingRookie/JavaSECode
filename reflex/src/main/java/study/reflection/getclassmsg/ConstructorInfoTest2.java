package study.reflection.getclassmsg;

import java.lang.reflect.Constructor;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 15:27
 */
public class ConstructorInfoTest2 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Outer> outerClass = Outer.class;
        //获取无参构造器
        Constructor<Outer> declaredConstructor = outerClass.getDeclaredConstructor();
        System.out.println(declaredConstructor);

        Class<Outer.Inner1> inner1Class = Outer.Inner1.class;
        //因为Inner1是非静态的内部类，所以它的构造器默认第一个形参是外部类的实例对象
        Constructor<Outer.Inner1> declaredConstructor1 = inner1Class.getDeclaredConstructor(Outer.class);
        System.out.println(declaredConstructor1);

        Class<Outer.Inner2> inner2Class = Outer.Inner2.class;
        //因为Inner2是静态的内部类，所以不需要外部类的实例对象
        Constructor<Outer.Inner2> declaredConstructor2 = inner2Class.getDeclaredConstructor();
        System.out.println(declaredConstructor2);
    }
}
