package study.reflection.classstudy;

import java.lang.reflect.Field;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/19 15:14
 * todo: Class类的常用方法
 *      方法名                                             描述
 *      static Class forName(String name) 返回指定类名name的Class对象
 *      T  newInstance()    创建由此 类对象表示的类的新实例。 调用默认构造函数，返回该Class对象的一个实例
 *      String getName()    返回由 类对象表示的实体（类，接口，数组类，原始类型或空白）的名称，作为 String 。
 *      Class<?>[]  getInterfaces() 确定由该对象表示的类或接口实现的接口。
 *      ClassLoader getClassLoader()  返回类的类加载器。
 *      Class <? super T> getSuperclass() 返回 类表示此所表示的实体（类，接口，基本类型或void）的超类 。
 *     Constructor<?>[] getConstructors() 返回包含一个数组 Constructor对象反射由此表示的类的所有公共构造 类对象。
 *     Field[] getDeclaredFields() 返回的数组 Field对象反映此表示的类或接口声明的所有字段 类对象。
 *     Method getDeclaredMethod(String name, Class<?>... parameterTypes)返回一个 方法对象，它反映此表示的类或接口的指定声明的方法 类对象。
 */
public class ClassMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classAllPath = "study.reflection.classstudy.Car";
        // 获取Car类对应的 Class对象
        Class<?> cls = Class.forName(classAllPath);
        //输出 cls
        //显示cls对象，是哪个类的Class对象
        System.out.println(cls);
        //输出运行类型
        System.out.println(cls.getClass());
        // 得到包名
        System.out.println(cls.getPackage().getName());
        //得到全类名
        System.out.println(cls.getName());
        //生通过cls创建对象实例
        Car car =(Car) cls.newInstance();
        System.out.println(car);
        //通过反射获取属性 brand
        //如果是私有属性则会报错
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));
        //通过反射给属性赋值
        brand.set(car,"奔驰大G");
        System.out.println(brand.get(car));

        //通过反射获取所有的字段属性
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field.get(car));
        }

    }
}
