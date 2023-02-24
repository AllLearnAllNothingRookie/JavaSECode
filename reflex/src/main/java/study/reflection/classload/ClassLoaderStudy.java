package study.reflection.classload;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/19 16:50
 * todo: 类加载
 *    反射机制是Java语言实现动态语言的关键，也就是通过反射实现类动态加载
 *     1.静态加载：编译时加载相关的类，如果没有则报错，依赖性太强
 *     2.动态加载：运行时加载需要的类，如果运行时不用该类，即使不存在该类，也不报错，降低了依赖性
 * todo：
 *      类的加载时机：
 *          1.当创建对象时(new)   --- 静态加载
 *          2.当子类被加载时       --- 静态加载
 *          3.调用类中的静态成员时   --- 静态加载
 *          4.通过反射             --- 动态加载
 *
 */
public class ClassLoaderStudy {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入key:");
        String key = input.next();
        switch (key){
            case "1":
                // 编译时就加载
                //静态加载，如果没有Dog类则会报错
                Dog dog = new Dog();
                dog.cry();
                break;
            case "2":
                //反射  --》  动态加载  运行时，执行到该代码时就会加载，若没有对应的类则会报错
                //动态加载  如果没有Person类时，当输入的key不是2时不会保存，
                // 当输入的key时2时且没有Person类时会报错
                Class<?> person = Class.forName("Person");
                Object o = person.newInstance();
                Method hi = person.getMethod("hi");
                hi.invoke(o);
                break;
            default:
                System.out.println("do nothing....");
        }
    }
}
