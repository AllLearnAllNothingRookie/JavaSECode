package study.orverride;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/27 9:51
 * todo:@Override使用说明
 *  1.@Override表示指定重写父类的方法(从编译层面验证)，如果子类有该注解且
 *      子类没有重写父类的方法，则会报错
 *  2.如果子类没有@Override注解，但子类方法重写了父类的方法，则仍然为重写
 *  3.@Override只能修饰方法不能修饰其他类、属性、包等
 *  4.@Override源码为:
 *       @Target(ElementType.METHOD)
 *       @Retention(RetentionPolicy.SOURCE)
 *      public @interface Override {
 *      }
 *    @Target(ElementType.METHOD):表示只能修饰方法
 *    @Target:是注解的注解，称为元注解
 *    @interface:表示定义一个注解类
 */
public class Son extends Father{
    /**
     * todo:
     *  注解@Override：表示子类的方法重写的是父类(直接父类或间接父类)的方法
     *  如果此处没有@Override注解,也表示重写
     *  如果有@Override注解那么编译器就会坚持该方法是否重写了父类的方法，如果重写了
     *   编译通过，没有重写则编译报错，相当于做了一个语法的校验
     */
    @Override
    public void fly() {
        System.out.println("son fly");
    }
}
