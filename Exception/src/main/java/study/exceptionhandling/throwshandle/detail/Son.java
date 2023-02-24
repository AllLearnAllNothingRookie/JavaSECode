package study.exceptionhandling.throwshandle.detail;

import com.sun.org.apache.bcel.internal.generic.FADD;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/29 10:43
 */
public class Son extends Father {
    /**
     * 子类重写父类方法时抛出的 异常和父类一致
     * @throws RuntimeException
     */
    @Override
    public void method() throws RuntimeException {
    }

    /**
     * 子类抛出的异常是父类抛出异常的子类
     * @throws NullPointerException
     */
    @Override
    public void fun() throws NullPointerException {

    }

    /**
     * 父类抛出运行时异常，子类不抛出异常
     */
    @Override
    public void func(){
    }

    /**
     * 父类抛出受检异常子类不抛出异常
     */
    @Override
    public void meth() {
    }

    /**
     * 子类抛出父类异常的子类
     * @throws FileNotFoundException
     */
    @Override
    public void meth2() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("");
    }

    /**
     * 父类没有抛出异常子类可以抛出非受检异常
     * @throws RuntimeException
     */
    @Override
    public void fun1() throws RuntimeException{

    }

    /**
     * todo:父类不抛出异常子类抛出受检异常  结果 ：报错
     *      即:如果父类没有抛出异常子类不能抛出受检异常
     * fun2()' in 'study.exceptionhandling.throwshandle.detail.Son'
     * clashes with 'fun2()' in 'study.exceptionhandling.throwshandle.detail.Father';
     * overridden method does not throw 'java.io.FileNotFoundException'
     * @throws FileNotFoundException
     */
    @Override
    public void fun2() /*throws FileNotFoundException*/ {
    }

    @Override
    public void fun3() throws NullPointerException{
        super.fun3();
    }

    @Override
    public void fun4() throws NullPointerException, ArithmeticException {
        super.fun4();
    }
}
