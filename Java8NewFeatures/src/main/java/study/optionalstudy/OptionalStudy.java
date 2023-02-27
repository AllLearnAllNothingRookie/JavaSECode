package study.optionalstudy;

import java.util.Optional;
import org.junit.Test;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/25 1:02
 * todo: Optional -- 为了在程序中避免出现空指针异常而创建的
 *      Optional<T>类(java.util.Optional)是一个容器类，他可以保存类型T的值，代表这个值
 *        存在。或者仅仅保存null,表示这个值不存在。原理用null表示一个值不存在，现在Optional
 *        可以更好的表达这个概念。并且可以避免空指针
 *      Optional类的javadoc描述如下：这个一个可以为null的容器对象，如果值存在则isPresent()
 *        方法返回true，调用get()方法回返回该对象
 *
 *todo:
 *     创建Optional类对象的方法：
 *      Optional.of(T t):创建一个Optional实例，t必须非空
 *      Optional.empty():创建一个空的Optional实例
 *      Optional.ofNullable(T t):创建一个Optional实例,t可以为null
 *     判断Optional容器中是否包含对象
 *       boolean isPresent():判断是否包含对象
 *       void ifPresent(Consumer<? super T> consumer):如果有值，就执行Consumer
 *        接口的实现方法，并且该值回作为参数传递给它
 *     获取Optional容器的对象：
 *       T get(): 如果调用对象包含值，返回该值，否则抛出异常
 *       T orElse(T other):如果有值这将其返回，否者返回指定的other对象
 *       T orElseGet(Supplier<? extends T> other):如果有值则将其返回，否者返回由
 *          supplier接口实现提供的对象
 *       T orElseThrow(Supplier<? extends X> exceptionSupplier):如果有值则将其返回
 *          否则抛出有Supplier接口提供的异常
 *
 */
public class OptionalStudy {
    /**
     * 创建Optional类对象的方法：
     *      Optional.of(T t):创建一个Optional实例，t必须非空
     *      Optional.empty():创建一个空的Optional实例
     *      Optional.ofNullable(T t):创建一个Optional实例,t可以为null
     */
    @Test
    public void test1(){
        //of(T t):保证t是非空的
        Girl girl = new Girl();
        Optional<Girl> girlOptional = Optional.of(girl);
        girl = null;
       // Optional<Girl> girl1 = Optional.of(girl);
        //ofNullable(T t): t可以为空
        Optional<Girl> girl1 = Optional.ofNullable(girl);
        System.out.println(girl1);
    }
    @Test
    public void test2(){
        //传统方法
        Boy boy = new Boy(new Girl("张三"));
        String girlName = getGirlName(boy);
        //优化以后
        String girlName1 = getGirlName1(boy);
        System.out.println(girlName1);
        //使用Optional类
        String girlName2 = getGirlName2(null);
        System.out.println(girlName2);
        String girlName21 = getGirlName2(boy);
        System.out.println(girlName21);
    }
    public String getGirlName(Boy boy){
        return  boy.getGirl().getName();
    }
    //优化后
    public String getGirlName1(Boy boy){
        if (boy != null){
            Girl girl = boy.getGirl();
            if (girl  != null){
                return  girl.getName();
            }
        }
        return null ;
    }
    //使用Optional类
    public String getGirlName2(Boy boy){
        Optional<Boy> boyOptional = Optional.ofNullable(boy);
        //T orElse(T other):如果有值这将其返回，否者返回指定的other对象
        //此时返回的对象一定不为空
        Boy boy1 = boyOptional.orElse(new Boy(new Girl()));
        Girl girl = boy1.getGirl();
        Optional<Girl> girlOptional = Optional.ofNullable(girl);
        Girl girl1 = girlOptional.orElse(new Girl());
        return girl1.getName();
    }
}
