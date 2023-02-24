package study.createthread.implementsrunnable.case01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/29 21:33
 * todo:多线程的实现2：实现Runnable接口
 *      说明：
 *         1.Java是单继承的，在某些情况下一个类可能以及继承了某个父类，这是在继承Thread
 *           类方法类创建多线程已经是不能的了
 *         2.Java设计者提供了另一个方式创建对象，就是通过实现Runnable接口来创建多线程
 */
public class ImplementsRunnable {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        //通过Thread对象启动多线程
        thread.start();
    }
}
