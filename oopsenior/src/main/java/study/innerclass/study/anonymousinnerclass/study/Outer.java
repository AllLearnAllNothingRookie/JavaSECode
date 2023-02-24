package study.innerclass.study.anonymousinnerclass.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/11 12:59
 */
public class Outer {
    private int n1 = 100;

    /**
     * todo:匿名内部类
     */
    public void method(){
        //todo:1.基于接口的匿名内部类
        /**
         * 需求: 想要使用接口,并且创建对象
         *   传统方方式:写一个类实现接口并创建对象
         *  需求:接口的对象只使用一次，以后不会使用
         *  解决方案:使用匿名内部类进行开发
         */
        //传统方式
        A a = new Tiger();
        a.cry();
        //匿名内部类
        // 编译类型为 接口,运行类型是匿名内部类
        /**todo:
            1.{
                @Override
                public void cry() {
                    System.out.println("老虎叫(匿名内部类)");
                }
            };
            等价于：  类名是系统自动分配 形式为:  外部类名$编号   编号为:1,2,3……
            class 类名 implements A {
            @Override
                public void cry() {
                    System.out.println("老虎叫(匿名内部类)");
                }
            }
            2.new A() 匿名内部类：在JDK底层在创建匿名内部类时,
                立马就创建了匿名内部类对象,并且将地址返回给接口的对
            3.匿名内部类只能使用一次,就不能使用了
         */
        //在JDK底层在创建匿名内部类时,立马就创建了匿名内部类对象,并且将地址返回给接口的对象
        A ia = new A() {
            @Override
            public void cry() {
                System.out.println("老虎叫(匿名内部类)");
            }
        };
        System.out.println("ia的运行类型:" + ia.getClass());
        ia.cry();
        //todo:2.基于类的匿名内部类
        /**
         * todo:
         *  new 类/抽象类名(参数){
         *      //可以重写方法
         *  }
         *  等价于:   类名是系统自动分配 形式为:  外部类名$编号
         *   class 类名 extents 类/抽象类名{
         *       //可以重写方法
         *   }
         *   2.new A() 匿名内部类：在JDK底层在创建匿名内部类时,
         *           立马就创建了匿名内部类对象,并且将地址返回给接口的对
         *   3.如果是基于抽象类的匿名内部类比u徐实现抽象类中的抽象方法
         *   4.类/抽象类名(参数)：调用的是类/抽象类的构造器
         */
        Father father = new Father("rookie"){
            /**
             * 匿名内部类重写了test方法
             */
            @Override
            public void test() {
                System.out.println("匿名内部类重写的方法");
            }
        };
        System.out.println("father的运行类型:" + father.getClass());
        father.test();
    }
}
