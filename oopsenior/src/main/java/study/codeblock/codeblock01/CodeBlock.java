package study.codeblock.codeblock01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/6 17:43
 * todo:
 *      代码块又称为初始化块,属于类中得成员[即是类的一部分],类似于方法,
 *      将逻辑语句封装在方法体中,通过{}包围起来。但和普通方法不同,代码块没有方法名,
 *      没有返回,没有参数,只有方法体，而且不通过对象或类显示调用，而是类加载时，
 *      或创建对象时隐式调用
 *   基本语法:
 * 	    [修饰符]{
 * 		    代码
 *        }[;]
 *  注意：
 * 	    1.修饰符可选,要写的话也只能时static
 * 	    2.代码块分为两类:使用static修饰的代码块叫静态代码块,没有static修饰的代码块称为普通代码块
 * 	    3.逻辑语句可以为任何逻辑语句(如输入,输出,方法调用,循环,判断等)
 * 	    4. ;分号可以写也可以省略
 * 	 代码块的好处:
 * 	    1.相当于另一种形式的构造器(对构造器的补充机制),可以做初始化的操作
 * 	    2.如果多个构造器中都有重复的语句,可以抽取到初始化块中[代码块],提高代码的重用性
 *
 */
public class CodeBlock {
    public static void main(String[] args) {
        Movie movie = new Movie("哈哈哈");
        Movie movie1 = new Movie("你好",200);
        Movie movie2 = new Movie("世界",45,"tom");
        Movie movie3 = new Movie();
    }
}
