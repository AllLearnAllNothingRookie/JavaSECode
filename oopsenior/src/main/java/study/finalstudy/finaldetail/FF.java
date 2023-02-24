package study.finalstudy.finaldetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/8 21:09
 * todo:final细节
 *      1.final修饰的属性又叫常量,一般用XXX_XX_XX来命名
 *      2.final修饰的属性在定义时,必须赋初始值,并且以后不能在修改,赋值可以在如下位置之一:
 *          [选择一个位置赋值即可,不能选择多个位置,有且仅有一个位置可以赋值
 *          ,在选择构造器初始化时如果有多个构造器时必须每个构造器都有进行初始化的操作,
 *          每个构造器初始化的值可以不同,也可以外部传参,但是同一个构造器中只能初始化一次
 *          ，在选择代码块进行初始化时,如果有多个代码块则需要选择其中一块代码进行赋值操作即可
 *             不能有多个代码块对同一个常量进行赋值,只能有且仅有一个代码块对同一个常量进行赋值]
 *          1.定义时
 *          2.在构造器中
 *          3.在代码块中
 *         如果三个位置都没有进行赋值操作则会报错,非静态属性只能在非静态代码块中进行初始化
 *         因为静态代码块无法访问非静态属性[常量]
 *      3.如果final修饰的属性是静态的,则初始化的位置只能是:
 *          1.定义时, 2.在静态代码块中 不能在构造器中赋值也不能在非静态代码块中赋值
 *          [在选择静态代码块进行初始化时,如果有多个静态代码块则需要选择其中一块代码进行赋值操作即可
 *          不能有多个静态代码块对同一个常量进行赋值,只能有且仅有一个静态代码块对同一个常量进行赋值]
 *      4.final修饰的类不能被继承,但是可以实例化对象
 *      5.如果类不是final修饰的,但是含有final修饰的方法,则该方法不能被重写，但是可以被继承,被
 *        final修饰的方法可以被子类调用,但是不能被重写,任然遵守继承机制
 *      6.一般来说,如果一个类已经时final类了,就没有必再将方法修饰为final方法了,因为final修饰的类不能
 *          被继承,所以会有子类重写final修饰的类中的方法
 *      7.final不能修饰构造器
 *      8.final和static往往搭配一起使用,效率高,底层编译器做了优化处理，
 *          调用final static修饰的属性不会导致类加载
 *          [final static修饰的属性属性必须是定义是赋值的不能是在静态代码块中赋值的]
 *      9.包装类(Integer,Double,Float,Boole等),String也是final修饰的类
 */
public class FF {
    static {
        System.out.println("加载了FF类");
    }
    static final  String POSTAL_CODE = "624200";
    static final  String POSTAL_CODE1;
    static {
        POSTAL_CODE1 = "624201";
    }
    public static final void show(){
        System.out.println("我是FF类");
    }
}
