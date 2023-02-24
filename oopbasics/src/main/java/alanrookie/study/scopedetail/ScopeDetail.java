package alanrookie.study.scopedetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/10 21:26
 * 作用域细节
 *      1.属性和局部变量可以重名，访问时遵循就近原则
 *      2.在同一个作用域中，两个局部变量/属性(成员变量)不能重名
 *      3.属性的生命周期较长，伴随着对象的创建而创建，伴随着对象的销毁而销毁
 *       局部变量生命周期较短，伴随着它所在的代码块/方法/构造器的执行而创建，
 *       伴随着它所在的代码块/方法/构造器的结束而销毁，即在溢出方法的调用过程中生效。
 *      4.作用域的不同
 *          全局变量：可以别本类使用，或其他类使用(通过对象调用)
 *          局部变量：只能在本类中对应的方法中使用
 *       5.修饰符的不同
 *          全局变量/属性可以加修饰符
 *          局部变量不可以加修饰符
 */
public class ScopeDetail {
    String name = "jack";
    //全局变量/属性可以加修饰符
    public int age;

    /**
     * 1.属性和局部变量可以重名，访问时遵循就近原则
     */
    public void say(){
        //错误 局部变量不可以加修饰符
       // public String name = "tom";
        String name = "tom";
        //就近原则 输出方法中name的值
        // tom
        System.out.println(name);
    }

    /**
     * 2.在同一个作用域中，两个局部变量/属性(成员变量)不能重名
     */
    // 错误
    //java: 已在类 alanrookie.study.scopedetail.ScopeDetail中定义了变量 name
   // String name = "hah";
    public void eat(){
        int score = 100;
        // 错误
        // java: 已在方法 eat()中定义了变量 score
        // int score = 300;
        System.out.println(score);
    }
    public void study(){
        // 在不同作用域中可以有同名变量
        int score = 1200;
        System.out.println(score);
        //全局变量在本类中使用
        System.out.println(name);
    }
}
