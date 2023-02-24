package study.genericstudy.customgenerics.genericclass;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/19 15:36
 * todo:自定义泛型类 ：
 * 	基本语法:
 * 		class 类名<T,R...>{//...表示可以多个泛型
 * 			成员
 *                }
 * 		注意细节：
 * 		  1.普通成员可以使用泛型(普通成员方法，普通成员属性)
 * 		  2.使用泛型的数组，不能初始化
 * 		  3.静态方法中不能使用类的泛型
 * 		  4.泛型类的类型，是在创建对象时确定的(因为创建对象时，需要指定确定类型)
 * 		    或者继承类时确定
 * 		  5. 如果在创建对象时，没有指定类型，默认泛型为Object
 * 		  6.T,R,M等为泛型的标识符，一般是单个大写字母
 */
public class Tiger<T,R,M> {
    /**
     * 普通成员可以使用泛型(普通成员方法，普通成员属性)
     */
    T t;
    R r;
    M m;

    /**
     * 返回类型，方法形参类型都可以使用泛型
     * @param t
     * @return
     */
    public T getT(T t){
        return t;
    }
    /**
     * 使用泛型的数组，不能初始化
     */
    M [] arr;
    /**
     * java: 创建泛型数组
     * Type parameter 'M' cannot be instantiated directly
     * 因为数组在new的时候不能确定泛型的类型，就无法在内存开辟空间
     */
   /* M [] arrs = new M[8];*/

    /**
     *
     * cannot be referenced from a static context
     * 因为静态成员是和类型相关的，在类加载时，还没有创建对象，如果静态方法或静态
     * 属性使用了泛型，JVM无法完成创建
     */
    /* static T st;*/
    /*public static  T t(T s){
        return  s;
    }*/

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}
