package study.customexception;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/29 11:31
 * todo:自定义异常
 *      当程序中出些某些错误，但该错误信息没有在Throwable子类中描述处理，这时候
 *      就可以自己设计异常类，用于描述该错误信息
 *   自定义异常的步骤:
 *      1.定义类:自定义异常类名，继承Exception或RuntimeException
 *      2.如果继承的时Exception，属于编译异常
 *      3.如果继承RuntimeException，属于运行异常(一般来说继承Runtime Exception)
 *      一般情况下，自定义异常是继承RuntimeException，把自定义异常做成运行时异常，因为
 *      这样可以使用默认处理机制，比较方便
 *   throw和throws的区别
 *    throws：异常的一种处理方式，放在方法声明处，后面是异常类型
 *    throw:是手动生成异常对象的关键字，放在方法中，后面是异常对象
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 180;
        if (!(age >= 0 && age <= 120)){
            throw new AgeException("年龄需要在在0~120之间");
        }
        System.out.println("年龄是:" + age);
    }
}
