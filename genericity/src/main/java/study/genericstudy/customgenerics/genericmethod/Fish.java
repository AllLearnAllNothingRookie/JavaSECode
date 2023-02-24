package study.genericstudy.customgenerics.genericmethod;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/19 16:57
 * 泛型类中使用泛型方法
 */
public class Fish<T,R>{
    //普通方法
    public  void run(){

    }
    //此方法不是泛型方法只是使用了泛型
    public T hi(R r){
        return  null;
    }
    //泛型类中使用泛型方法，泛型方法的标识符和泛型类的标识符不同，泛型方法的泛型不会被泛型类
    //的泛型影响
    public <K> K eat(K k){
        return k;
    }
    //泛型方法可以使用泛型类声明的泛型，也可以使用自己声明的泛型
    public <V> V fun(R r,T t,V v){
        return null;
    }
}
