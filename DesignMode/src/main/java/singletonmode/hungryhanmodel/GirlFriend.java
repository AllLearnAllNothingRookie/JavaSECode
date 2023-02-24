package singletonmode.hungryhanmodel;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/8 15:49
 *  todo: 实现步骤: 饿汉式单例模式 可能造成资源的浪费
 *        1.私有化构造器
 *        2.类的内部创建对象 -- 静态
 *        3.向外提供一个静态的公共方法
 *        4.类的内部可以提供其他的方法，也能提供其他的静态属性
 *        5.单例模式只要求只有一个实例
 */
public class GirlFriend {
    private String name;
    private static  int n1 = 100;
    // 私有化构造器
    private GirlFriend(String name){
        this.name = name;
    }
    //类的内部创建对象
    //为了在静态方法中返回girlFriend需要将属性修饰为static
    private static GirlFriend  girlFriend = new GirlFriend("小王");
    //向外提供一个静态的公共方法
    public static  GirlFriend getInstance(){
        return girlFriend;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
