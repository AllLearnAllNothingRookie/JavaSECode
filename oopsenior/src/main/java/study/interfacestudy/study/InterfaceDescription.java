package study.interfacestudy.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/9 16:56
 * todo:接口就是给出一些没有实现的方法,封装到一起,当木某个类要使用的时候,在根据具体情况把这些方法
 *      写出来
 *     语法:
 *      interface 接口名{
 *           //属性
 *          //方法
 *      }
 *      实现接口语法:
 *      如果一个类实现接口则需要将该接口的全部抽象方法都实现
 *      访问权限修饰符 class 类名 implements 接口名{
 *          //类的属性
 *          //类的方法
 *          //实现接口中的方法[必须实现接口的全部抽象方法]
 *      }
 *      小结:
 *         1.在JDK7.0前接口中所有的方法都没有方法体[即全部是抽象方法]
 *         2.在JDK8.0以后接口中可以有静态方法,默认方法,也就是说接口中可以有具体实现
 */
public interface InterfaceDescription {
    //属性
    /**
     * 接口中可以有属性
     */
    public int n1 = 10;
    //方法

    /**
     * 接口中，抽象方法可以省略abstract关键字
     */
     public void hi();
    /**
     * todo:在JDK8.0以后接口中可以有静态方法,默认方法,也就是说接口中可以有具体实现
     */
    /**
     * 默认方法
     */
     default void say(){
        System.out.println("默认方法");
    }

    /**
     * 静态方法
     */
     static void run(){
        System.out.println("静态方法");
    }
}
