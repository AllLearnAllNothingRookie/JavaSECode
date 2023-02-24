package study.staticstudy.visitstaticvariable;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/4 22:43
 * todo: 类变量也叫静态变量/静态属性,是该类所有对象共享的变量,任何一个该类的对象去访问他时
 *       取到的都是相同的值，同一任何一个变量去修改时,修改的也是同一个变量
 *       类变量的定义语法:
 *          1. 访问修饰符 static 数据类型   变量名; [推荐]
 *          2. static 访问修饰符 数据类型   变量名;
 *       如何访问类变量： 类变量的访问要遵守变量的访问权限
 *          类名.类变量名[推荐] 或者  对象名.类变量名
 */
public class A {
    /**
     * todo:类变量的定义语法:
     *      1. 访问修饰符 static 数据类型   变量名; [推荐]
     *      2. static 访问修饰符 数据类型   变量名;
     */
    public static  String name = "Rookie";
    static public  int age = 18;
    /**
     * todo:如何访问类变量：
     *      类名.类变量名 或者  对象名.类变量名
     */
}
