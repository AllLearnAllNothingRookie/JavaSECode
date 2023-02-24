package study.extendsstudy.study.extendsdetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/21 23:01
 */
public class Sub extends Base {
    //todo:子类必须调用父类构造器挖出对父类的初始化
    public Sub(){
        /**
         * 默认调用父类无参构造器，可以不写
         * 如果过父类没有无参构造器，则必须指明要调用的父类构造器否则会编译报错
         *   如果父类没有无参构造器且子类没有指明要调用的父类构造器则会报错:
         *      java: 无法将类 extendsstudy.study.extendsdetail.Base中的构造器 Base应用到给定类型;
         *      需要: java.lang.String
         *      找到:    没有参数
         *      原因: 实际参数列表和形式参数列表长度不同
         */
        //super();
        /**
         * 父类没有无参构造器时子类必须指明要调用的父类构造器否则会报错
         */
        super("rookie");
        System.out.println("Sub()");
    }
    public Sub(String name){
        //指明要调用的父类构造器
        super(name , 18);
        System.out.println("子类单参构造器\t" + name);
    }
    /**
     * todo: 子类只能访问到父类非private修饰的属性或方法，不能直接访问private修饰的属性或方法
     *      ，可以通过公共的方法访问private修饰的属性
     */
    public void say(){
        //访问父类public修饰的属性
        System.out.println(n1);
        //访问父类protected修饰的属性
        System.out.println(n2);
        //访问父类default修饰的属性
        System.out.println(n3);
        //访问父类的private修饰的属性
        //n4 在 extendsstudy.study.extendsdetail.Base 中是 private 访问控制
        //System.out.println(n4);
        //通过公共方法访问父类private的属性
        System.out.println(getN4());
        //访问父类public修饰的方法
        test1();
        //访问父类protected修饰的方法
        test2();
        //访问父类default修饰的方法
        test3();
        //访问父类的private修饰的方法
        //java: 找不到符号
        //  符号:   方法 test4()
        //  位置: 类 extendsstudy.study.extendsdetail.Sub
        //test4();
        //通过父类提供公共分方法调用父类的私有方法
        call();
    }
}
