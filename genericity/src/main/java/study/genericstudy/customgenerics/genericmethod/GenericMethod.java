package study.genericstudy.customgenerics.genericmethod;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/19 16:49
 * todo:泛型方法
 *      基本语法：
 *          修饰符 <T,R...>返回类型 方法名(参数列表){}
 *      注意细节：
 *          1.泛型方法，可以定义在普通类中，也可以定义在泛型类型中
 *          2.当泛型方法被调用时，类型会确定
 *          3.public void ear(E e){},修饰符后面没有<T,R...>,eat方法不是泛型方法
 *            只能使用了泛型
 */
public class GenericMethod {
    //普通方法
    public void run(){
        //使用泛型方法
        //todo:当调用方法时传入的参数编译起就会确定泛型的类型
        String fly = fly("22");
    }
    //泛型方法 <T>中 T为泛型标识符可以有多个，是提供给方法适使用
    public <T> T eat(T t){
        return t;
    }
    public static  <T> T fly(T t){
        return t;
    }
}
