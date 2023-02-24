package study.genericstudy.genericintro;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/18 16:23
 * todo:泛型介绍
 *     1.泛型又称参数化类型，是JDK1.5出现的新特性，解决数据类型的安全问题
 *     2.在类声明或实例化时只要指定号需要的具体类型即可
 *     3.Java泛型可以保证如果程序在编译时没有出现警告，运行时旧不会产生ClassCastException
 *      异常。同时代码更加简洁，健壮
 *     4.泛型的作用事：可以在类声明时通过一个标识表示类中某个属性的类型，或某个方法的返回值
 *       类型，或参数类型
 * todo:泛型的声明
 *      interface 接口名<T>{} class 类名<T,V>{}
 *     说明: 1.其中T,k,v不代表值，而是表示类型
 *          2. 用任意字母表示泛型都可以，常用T表示，T表示Type的缩写
 *          3. 泛型可以有多个
 *     泛型实例化：
 *        要在类名后面指定类型参数的值(类型)，如：
 *         List<String> str = new ArrayList<String>();等
 *
 */
public class GenericIntro<E> {
    /**
     * 用泛型表示属性的数据类型，该数据类型时在创建类时指定的，即在编译期间确定数据类型
     * 泛型 E：可以是任意标识符(要满足标识符规范)
     */
    E name;
    /**
     * 用泛型表示参数的数据类型
     */
    public GenericIntro(E name) {
        this.name = name;
    }
    /**
     * 用泛型表示返回值的数据类型
     */
    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
