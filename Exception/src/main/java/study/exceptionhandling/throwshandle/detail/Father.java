package study.exceptionhandling.throwshandle.detail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/29 10:42
 */
public class Father {
    public void method() throws RuntimeException{

    }
    public void fun() throws RuntimeException{

    }
    public void func() throws RuntimeException{

    }
    public void meth() throws IOException{
        FileInputStream fis = new FileInputStream("");
    }
    public void meth2() throws IOException{
        FileInputStream fis = new FileInputStream("");
    }
    public void fun1() {

    }
    public void fun2(){

    }
    public void fun3() throws NullPointerException,ArithmeticException{

    }
    public void fun4() throws NullPointerException{

    }
}
