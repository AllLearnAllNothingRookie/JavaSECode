package alanrookie.study.scope;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/10 21:11
 * 变量作用域
 */
public class VarScope {
    //属性(全局变量)，作用域为整个类
    // 属性定义时 可以直接赋值
    // 属性可以不赋值直接使用,属性有默认值,规则和数组一致
    int age = 10;
    public void say(){
        //局部变量  作用与为定义的方法内
        // 局部变量必须赋值后再使用，局部变量没有默认值
        int n =10;
        //局部变量 -- 只能在定义的方法里使用
        String name = "tom";
        //在方法中使用属性
        System.out.println(age);
    }
    public void eat(){
        double score = 100;
        //使用属性
        System.out.println(age);
        //错误 不能使用其他方法内的局部变量
       // System.out.println(name);
        //只能使用全局变量和该作用域内的局部变量
        System.out.println(score);
    }
    {
        //在代码块中定义的变量也是局部变量，作用域为该代码块中
        String sex = "男";
    }
}
