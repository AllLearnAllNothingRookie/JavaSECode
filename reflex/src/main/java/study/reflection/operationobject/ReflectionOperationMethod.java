package study.reflection.operationobject;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 11:31
 * todo:通过反射访问类中的成员
 *      1.根据方法名和参数列表获取Method方法对象
 *          Method m = clazz.getDeclaredMethod(方法名,XX.class);
 *      2.获取对象
 *          Object o = clazz.newInstance();
 *      3.爆破
 *          m.setAccessible(true);
 *      4.访问
 *          Object returnValue = m,invoke.(o,实参列表);
 *      5.注意：如果是静态方法，则invoke的对象参数，可以写成 o 也可以写成 null
 *
 */
public class ReflectionOperationMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //得到类对应的Class对象
        Class<?> cls = Class.forName("study.reflection.operationobject.Boss");
        //2. 创建对象
        Object o = cls.newInstance();
        //调用普通公共方法
        //方式1：只能得到公共方法
        Method method = cls.getMethod("hi",String.class);
        //方式2  可以得到非静态的方法
        Method hi = cls.getDeclaredMethod("hi", String.class);
        //调用方法
        method.invoke(o,"alan");

        // 调用私有的静态方
        Method say = cls.getDeclaredMethod("say", int.class, String.class, char.class);
        //爆破 --可以访问使用非共有的方法
        say.setAccessible(true);
        //调用私有静态方 格式1
        Object invoke = say.invoke(o, 10, "tom", 'm');
        System.out.println(invoke);
        //调用私有静态方 格式2
        Object invoke1 = say.invoke(null, 18, "jack", 'w');
        System.out.println(invoke1);

        //在反射中如果方法有返回值统一用Object接收，但是运行类型和方法定义的返回类型一样
    }
}
