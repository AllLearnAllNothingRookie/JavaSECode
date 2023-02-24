package study.genericstudy.customgenerics.genericinterface;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/19 16:03
 * todo:自定义泛型接口 ：
 * 	基本语法:
 * 		  interface 接口名<T,R...>{//...表示可以多个泛型
 *   			成员
 *          }
 * 		 注意细节：
 * 		 1.接口中静态成员也不能使用泛型
 * 		 2.泛型接口中的泛型类型，在继承接口或者实现接口时确定
 * 		 3.没有指定接口中的泛型类型，默认为Object
 */
public interface IUsb<T,R>{
    int n = 10;
    //静态成员不能使用泛型
   // T name;
    //普通方法中可以使用接口泛型
    T get(R  r);
    void h1(T t);
    void run(T t1,T t2,R r1,R r2);
    //默认方法也可以使用接口泛型
    default T method(R r){
        return null;
    }

}
