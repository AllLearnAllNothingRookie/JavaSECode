package singletonmode.hungryhanmodel;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/8 15:28
 * todo:单例设计模式
 *  单例模式就是采用一定的方法保证在整个软件系统中，对某个类只存在一个实例对象，并且该类
 *  只提供一个取得其对象实例的方法
 *  实现步骤:
 *      1.私有化构造器
 *      2.类的内部创建对象
 *      3.向外提供一个静态的公共方法
 *  实现方式:饿汉式和懒汉式
 *      1.二者最主要的区别在于创建对象的时机不同:饿汉式是在类加载时就创建了对象实例,而懒汉式
 *        是在使用时才创建
 *      2.饿汉式不存在线程安全问题，懒汉式存在线程安全问题
 *      3.饿汉式存在浪费资源的可能,因为如果一个对象实例都没有使用,那么饿汉式创建的对象就浪费了
 *        懒汉式时使用时才创建对象,就不存在这个问题
 *      4.在Java标准类中,java.lang.Runtime就是经典的单例模式
 */
public class Singleton {
    public static void main(String[] args) {
        //测试单例模式
        GirlFriend girlFriend = GirlFriend.getInstance();
        System.out.println(girlFriend);
        GirlFriend girlFriend1 = GirlFriend.getInstance();
        System.out.println(girlFriend1);

    }
}
