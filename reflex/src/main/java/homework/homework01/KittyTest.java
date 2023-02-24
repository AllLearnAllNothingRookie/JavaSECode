package homework.homework01;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 14:12
 * 通过反射修改私有属性的值
 *  定义一个类有私有的name属性，并赋值为 helloKitty
 *  提供getName的公有方法
 *  创建测认类，利用Class类得到私有的name属性，修改私有的name属性的值，
 *  并调用getName方法打印修改后的值
 */
public class KittyTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        //得到对应的Class对象
        Class<?> kittyClass = Class.forName("homework.homework01.Kitty");
        //得到对应对象
        Object o = kittyClass.newInstance();
        //得到对应属性
        Field name = kittyClass.getDeclaredField("name");
        //爆破
        name.setAccessible(true);
        //得到属性并输出
        System.out.println("修改前的属性值为:" + name.get(o));
        //修改属性的值
        name.set(o,"jerry");
        //通过getName()方法输出修改后的属性值
        //得到get方法
        Method getName = kittyClass.getMethod("getName");
        //调用getName方法
        Object invoke = getName.invoke(o);
        System.out.println("修改后的属性值为:" + invoke);
    }
}
