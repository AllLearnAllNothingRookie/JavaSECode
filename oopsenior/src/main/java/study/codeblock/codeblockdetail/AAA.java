package study.codeblock.codeblockdetail;

import java.io.FilterOutputStream;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/6 22:11
 */
public class AAA {
    //静态属性初始化1
    private static  int n1 = getN1();
    //静态代码块1
    static {
        System.out.println("AAA的静态代码块1");
    }
    //静态代码块2
    static {
        System.out.println("AAA的静态代码块2");
    }
    //静态属性初始化2
    private static  int n2 = getN2();
    public static int getN1(){
        System.out.println("(静态属性)getN1被调用");
        return 100;
    }
    public static int getN2(){
        System.out.println("(静态属性)getN2被调用");
        return 200;
    }
    //普通属性初始化
    private int n3 = getN3();
    //普通属性初始化
    private int age = getAge();
    //普通代码块
    {
        System.out.println("普通代码块1");
    }
    //普通代码块
    {
        System.out.println("普通代码块2");
    }
    //普通属性初始化
    private int n4 = getN4();
    public int getAge(){
        System.out.println("(非静态属性)getAge被调用");
        return 1;
    }
    public int getN3(){
        System.out.println("(非静态属性)getN3被调用");
        return 2;
    }
    public int getN4(){
        System.out.println("(非静态属性)getN4被调用");
        return 3;
    }
    public AAA(){
        //todo:相当与于隐藏了super([参数])和普通代码块和普通属性初始化
        //todo:调用父类构造器
        //super();
        //todo:调用本类普通代码块和普通属性初始化
        System.out.println("无参构造器被调用");
    }
}
