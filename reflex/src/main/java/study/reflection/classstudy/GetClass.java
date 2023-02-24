package study.reflection.classstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/19 16:06
 * todo: 获取Class类对象
 *      1. 前提： 已知一个类的全类名，且该类在类路径下，可以通过Class类的静态方法forName()获取
 *          可能抛出 ClassNotFoundException，
 *       实例： Class cls = Class.forName("java.lang.Cat");
 *       应用场景： 多用于配置文件，读取类全路径，加载类
 *      2. 前提： 若已知具体的类，通过类的class获取，该方式最为安全可靠，程序性能最高
 *         实例：Class cls = Cat.class;
 *          应用场景：多用于参数传递，比如通过反射得到对应构造器对象
 *       3.前提： 已知某个类的实例，调用该实例的getClass()方法获取Class对象
 *         实例： Class clazz = 对象.getClass()
 *         应用场景：通过创建好的对象，获取Class对象。
 *       4.其他方法：通过类加载器获取Class对象
 *          (1) 得到类加载器
 *          ClassLoader cl = 对象.getClass().getClassLoader();
 *          (2)通过类加载器得到Class对象
 *          Class clazz = cl.loadClass("类的全类名");
 *       5.基本数据类(int,char,boolean,float,double,byte,long,short)得到
 *          Class类对象
 *          Class cls = 基本数据类型.class
 *        6.基本数据类型对应的包装类，可以通过 .TYPE 得到Class类对象
 *              Class cls = 包装类.TYPE;
 *
 * todo: 那些类型有Class对象
 *  1.外部类，成员内部类，静态内部类，局部内部类，匿名内部类
 *  2.interface ： 接口
 *  3.数组
 *  4.enum ： 枚举
 *  5.annotation ： 注解
 *  6.基本数据类型
 *  7.void
 */
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        //1. Class.forName 多用于配置文件
        String classAllPath = "study.reflection.classstudy.Car";
        Class<?> aClass = Class.forName(classAllPath);
        System.out.println(aClass);
        //2. 类.class  多用于参数传递
        Class<Car> carClass = Car.class;
        System.out.println(carClass);

        //3.Class clazz = 对象.getClass() 通过创建好的对象，获取Class对象。
        Car car = new Car();
        Class<? extends Car> clazz = car.getClass();
        System.out.println(clazz);

        // 4.通过类加载器获取Class对象
        //(1) 得到类加载器
        ClassLoader classLoader = car.getClass().getClassLoader();
        //(2)通过类加载器得到Class对象
        Class<?> loadClass = classLoader.loadClass(classAllPath);
        System.out.println(loadClass);
        //5.基本数据类(int,char,boolean,float,double,byte,long,short)得到
        //      Class类对象
        //自动装箱
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        //自动拆箱
        System.out.println(integerClass);
        System.out.println(characterClass);
        System.out.println(booleanClass);
        //6.基本数据类型对应的包装类，可以通过 .type 得到Class类对象
        Class<Boolean> type = Boolean.TYPE;
        Class<Integer> type1 = Integer.TYPE;
        System.out.println(type);
        System.out.println(type1);
        //包装类和基本数据类型同用一个Class对象
        System.out.println(type1.hashCode());
        System.out.println(integerClass.hashCode());
        System.out.println(type1 == integerClass);
        System.out.println(type1.equals(integerClass));
    }
}
