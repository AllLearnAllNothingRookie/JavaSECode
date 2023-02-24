package study.genericstudy.customgenerics.genericmethod;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/19 17:09
 */
public class ExtendGenericMethod extends Fish<String,Integer>{
    //继承泛型方法
    @Override
    public <K> K eat(K k) {
        return super.eat(k);
    }
    //继承泛型方法
    @Override
    public <V> V fun(Integer integer, String s, V v) {
        return super.fun(integer, s, v);
    }
}
