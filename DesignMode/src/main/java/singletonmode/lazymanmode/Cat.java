package singletonmode.lazymanmode;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/8 16:07
 *  todo: 实现步骤: 懒汉式单例模式
 *        1.私有化构造器
 *        2.类的内部创建对象 -- 静态
 *        3.向外提供一个静态的公共方法
 *        4.类的内部可以提供其他的方法，也能提供其他的静态属性
 *        5.单例模式只要求只有一个实例
 *        只有调用getInstance方法时才返回cat对象,后面再次调用时,会返回上次创建的对象
 *        从而保证了单例
 */
public class Cat {
    private String name;
    private static  int n = 100;
    //1.私有化构造器
    private Cat(String name){
        this.name = name;
    }
    //2.定义一个静态属性对象
    private static  Cat cat;
    public  static  Cat getInstance(){
        //如果第一个调用没有创建对象
        if (cat == null){
            return  new Cat("旺财");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
