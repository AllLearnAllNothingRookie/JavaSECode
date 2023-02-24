package study.reflection.classstudy;

import study.introduce.Cat;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/19 14:41
 * todo: Class类
 *      1.Class类也是类，因此也是继承Object的
 *      2.Class类的对象不是new出来的，而是系统创建的 --
 *              1.在new对象时会调用类加载器创建对应的Class对象
 *              2.通过反射获取类的Class对象时
 *          但是只会有一个类对应的Class对象
 *      3.对于某个类的Class类对象，在内存中只有一份，因为类只加载一次
 *      4.每个类的实例都会记得自己是由哪个Class实例所生成
 *      5.通过Class可以完整的得到一个类的完整结构，通过一系列API
 *      6.Class对象是放在堆中的
 *      7.类的字节码二进制数据，是放在方法区的，有些地方称为类的元数据(包括方法，变量名
 *        方法名，访问权限等等)
 */
public class ClassStudy {
    public static void main(String[] args) throws ClassNotFoundException {
        //1. Class类也是类，因此也是继承Object的
        //2. Class类的对象不是new出来的，而是系统创建的
        // (1).传统方法new对象
        /*
        ClassLoader对象
        public Class<?> loadClass(String name) throws ClassNotFoundException {
            return loadClass(name, false);
           }
         */
        Cat cat = new Cat();
        //(2)反射方式
        Class<?> cls = Class.forName("study.introduce.Cat");

    }
}
