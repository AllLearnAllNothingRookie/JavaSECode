package study.interfacestudy.detail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/9 17:30
 */
public interface IA {
    /**
     * todo:接口中的属性,只能是final修饰的,而且必须是public static final修饰符
     */
    int n1 = 10;
    //等价于 public static final int n1 = 10;
    /**
     * todo:接口中所有的方法都是public的,接口中抽象方法,可以省略abstract修饰符
     *       即接口中实现方法[默认方法,静态方法]可以省略public修饰符,抽象方法可以省略public abstract修饰符
     */
    /**
     * todo:抽象方法省略 public abstract修饰符
     */
    void say();
    /**
     * todo:抽象方法不省略 public abstract修饰符
     */
    public abstract void show();
    /**
     * todo:抽象方法省略abstract修饰符不省略public
     */
    public  void show1();
    /**
     * todo:抽象方法省略abstract修饰符 不省略 public修饰符
     */
    abstract void show2();

    /**
     * todo:默认方法不省略public修饰符
     */
    public default void run(){
        System.out.println("跑");
    }
    /**
     * todo:默认方法省略public修饰符
     */
    default void study(){
        System.out.println("学");
    }
    /**
     * todo:静态方法不省略public修饰符
     */
    public static  void see(){
        System.out.println("看");
    }
    /**
     * todo:静态方法省略public修饰符
     */
    static void eat(){
        System.out.println("吃");
    }
}
