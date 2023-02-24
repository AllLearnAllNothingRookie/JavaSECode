package study.deprecated;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/27 10:16
 * todo:
 *      1. @Deprecated:表示某个程序的元素(类、方法等)已过时
 *      2.可以修饰方法、类、字段、包、参数等
 *      3.@Deprecated源码
 *      @Documented
 *      @Retention(RetentionPolicy.RUNTIME)
 *      @Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
 *      public @interface Deprecated {
 *      }
 *      4.@Deprecated的作用可以做到新旧版本的兼容和过渡
 */
@java.lang.Deprecated
public class A{
    @java.lang.Deprecated
    public int n1 = 10;
    @java.lang.Deprecated
    public void hi(){

    }
}