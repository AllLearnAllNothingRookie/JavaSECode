package study.innerclass.study.anonymousinnerclass.anonymousinnerclassdetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/11 13:38
 */
public class Outer {
    /**
     * 外部类属性
     */
    private int n1 =34;
    private int age = 14;
    public void f2(){
        System.out.println("外部类方法");
    }
    public void see(){
        System.out.println("外部类看");
    }
    public void f1(){
        /**todo: 调用方法形式1:
         *         类/接口/抽象类 对象名 = new 类/接口/抽象类(形参列表){
         *               //重写的方法
         *         };
         *         对象名.重写的方法名(参数列表);[不可以访问匿名内部类的特有方法]
         */
        Person person = new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类");
            }
        };
        person.hi(); // 动态绑定
        /** todo: 调用方法形式1:
         *          new 类/接口/抽象类(形参列表){
         *              //重写的方法
         *          }.重写的方法名(参数列表); [可以访问匿名内部类的特有方法]
         */
        new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类直接调用");
            }
        }.hi();
        new Person(){
            public int a = 10;
            public void see1(){
                System.out.println("匿名内部类类看");
            }
        }.see1();
        /**
         * todo:匿名内部类访问外部类成员:直接访问
         */
        new Person(){
            @Override
            public void hi() {
                //访问外部类属性
                System.out.println("外部类属性" + n1);
                //访问外部类方法
                f2();
            }
        }.hi();
        /**todo:
         *     如果外部类和局部内部类的成员重名了后,默认遵循就近原则,如果想在局部内部类中
         *       访问外部类的成员则可以使用 外部类名.this.成员 去访问
         *       外部类名.this:本质就是一个外部类的对象,谁调用方法就是那个类
         */
        new Person(){
            private int age = 15;
            public void see(){
                System.out.println("匿名内部类类看");
            }
            @Override
            public void hi() {
                //访问匿名内部类属性
                System.out.println(age);
                System.out.println(this.age);
                //访问外部类属性
                System.out.println(Outer.this.age);
                //访问匿名内部类方法
                see();
                this.see();
                //访问外部类方法
                Outer.this.see();
            }
        }.hi();

    }
}
