package study.abstractclass.abstractstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/8 21:42
 * todo:     1.用abstract关键字来修饰一个类时,这个类就叫抽象类
 *          访问修饰符 abstract 类名{
 *          }
 *      2.用abstract关键字来修饰一个方法时,这个方法就是抽象方法
 *          访问修饰符 abstract 返回类型 方法名(参数列表); // 没有方法体
 *      3.抽象类的价值更多在于是设计,是设计着设计好以后,让子类继承并实现抽象类
 *      4.抽象类在设计模式和框架中使用较多
 */
public abstract class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 这里实现eat但是并没有什么实际的意义
     * 即: 父类方法不确定性的问题
     * ==> 将该方法设计为抽象方法
     * ==> 抽象方法就是没有实现的方法
     * ==> 就是没有方法体
     * ==> 当一个类中存在抽象方法,则需要将类也声明为抽象类
     * 一般来说抽象类会被继承由其子类实现抽象的方法
     */
 /*   public void eat(){
        System.out.println("这是一个动物,但是不知道吃什么……");
    }*/
    public abstract void eat();
}
