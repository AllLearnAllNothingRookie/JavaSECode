package study.exceptionhandling.throwshandle.detail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/29 10:08
 * todo:throws细节
 *   1. 对于编译异常，程序中必须处理，处理方式可以是try-catch-finally或者throws
 *   2. 对于运行时异常，程序中如果没有处理，默认就是throws的方式处理
 *   3. 子类重写父类方法时，对抛出异常的规定：子类重写的方法，所抛出的异常类型要和父类抛出
 *      的异常一致，要么是父类抛出异常类型的子类
 *   4. 在throws过程中，如果有方法try-catch-finally，就相当与处理了异常，就可以
 *      不必throws
 */
public class TrowsDetail {
    /**
     *   1. 对于编译异常，程序中必须处理，处理方式可以是try-catch-finally或者throws
     *   2. 对于运行时异常，程序中如果没有处理，默认就是throws的方式处理
     */
    public void fun(){
        int n1 = 10;
        int n2 = 0;
        double res = n1 / n2;
    }
    public void f1() throws FileNotFoundException {
        /**
         * 因为f2()方法抛出了一个受检异常(编译异常)，在其它方法调用该方法时
         * 必须要处理该异常 要么用try-catch要么继续抛出 throws，如果不显示处理
         * 就会报错
         */
        f2();
    }
    public void f2() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("");
    }
    public void f3(){
        /**
         * f4()抛出了一个非受检异常(运行异常)，其它方法调用该方法时可以显示处理
         *  也可以不显示处理，不处理不会报错 ，因为运行时异常java默认处理方式为
         *  抛出
         */
        f4();
    }
    public void f4() throws ArithmeticException{

    }
}
