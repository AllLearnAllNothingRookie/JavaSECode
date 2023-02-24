package study.exceptionhandling.throwshandle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/29 9:45
 * todo: throws异常处理:
 *      1.如果一个方法(中语句执行时)可能生产某种异常，但是并不能确定如何处理这种异常
 *        ，则方法应该显示的声明抛出异常，表示该方法将不对这些异常进行处理，而由该方法
 *        的调用者负责处理
 *     2.在方法声明中用throws语句可以声明抛出异常的列表，throws后面的异常类型可以是
 *       方法中产生的异常类型，也可以是它的父类
 */
public class ThrowsHanding {
    public static void main(String[] args) {

    }

    /**
     *
     * @throws FileNotFoundException 编译异常必须处理
     *      处理方式 1.  try-catch-finally
     *              2. throws,抛出异常，让调用者处理
     */
    public void fun() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("");
    }

    /**
     *  抛出产生异常的父类
     * @throws Exception 抛出产生异常的父类
     */
    public void func() throws Exception {
        FileInputStream fis = new FileInputStream("");
    }

    /**
     *  抛出多个异常(异常列表)
     * @throws FileNotFoundException
     * @throws NullPointerException
     * @throws ArithmeticException
     */
    public void method() throws FileNotFoundException,NullPointerException,ArithmeticException{
        FileInputStream fis = new FileInputStream("");
    }
}
