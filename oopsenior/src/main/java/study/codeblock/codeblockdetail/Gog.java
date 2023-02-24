package study.codeblock.codeblockdetail;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/6 22:50
 */
public class Gog {
    private static  int age = 18;
    private String name = "jack";
    //todo:静态代码块只能直接调用静态成员(静态方法,静态属性),普通代码块可以调用任意成员
    static {
        System.out.println(age);
        //Non-static field 'name' cannot be referenced from a static context
        //System.out.println(name);
        say();
        //Non-static method 'hi()' cannot be referenced from a static context
        //hi();
    }
    //todo:静态代码块只能直接调用静态成员(静态方法,静态属性),普通代码块可以调用任意成员
    {
        System.out.println(age);
        System.out.println(name);
        say();
        hi();
    }
    public static void say(){
        System.out.println("静态方法");
    }
    public void hi(){
        System.out.println("普通方法");
    }
}
