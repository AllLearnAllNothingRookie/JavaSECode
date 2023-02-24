package study.extendsstudy.study.extendsdetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/21 22:56
 *
 *  todo:
 *      继承细节：
*        1.子类继承父类所有的属性和方法，但是私有的属性和方法不能在子列中直接访问
*          要通过父类提供公共的方法访问
*        2.子类必须调用父类的构造器完成父类的初始化
*        3.创建子类对象时，不管使用子类的那个构造器，默认情况下都会去调用父类的无参构造器
*         ，如果父类没有提供无参构造器，则必须在子类的构造器中使用super去指定使用父类的
*         那个构造器完成对父类的初始化工作，否则编译不会通过。
 *        4.如果希望指定的调用父类的某个构造器，则显示的调用一下
 *        5.super在使用时，需要放在构造器的第一行，super只能在构造器中使用，
 *          不能在成员方法中使用
 *        6.super([参数列表])和this([参数列表])都只能放在构造器的第一行，因此这两个
 *          方法不能同时存在一个构造器中
 *        7.Java的所有类都是Object类的子类，Object是所有类的基类
 *        8.父类构造器的调用不限于直接父类，将一直往上追溯到Object类(顶级父类)
 *          java除Object类以外其他类的构造器都会调用父类的构造器
 *        9.子类最多继承一个父类(直接父类),即java是单继承机制
 *            子类最多只能有一个直接父类
 *        10.不能滥用继承，子类和父类之间必须满足 is-a的逻辑关系
 */
public class Base extends TopBase {
    public  int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private  int n4 = 400;
    /**
     * todo:默认调用父类无参构造器，可以不写
     *  如果过父类没有无参构造器，则必须指明要调用的父类构造器否则会编译报错
     *   如果父类没有无参构造器且子类没有指明要调用的父类构造器则会报错:
     *      java: 无法将类 extendsstudy.study.extendsdetail.Base中的构造器 Base应用到给定类型;
     *      需要: java.lang.String
     *      找到:    没有参数
     *      原因: 实际参数列表和形式参数列表长度不同
     */
   /*
    public Base(){
        System.out.println("子类初始化之前先初始化父类Base()");
    }
    */
    /**
     * todo:8.父类构造器的调用不限于直接父类，将一直往上追溯到Object类(顶级父类)
     *  *          java除Object类以外其他类的构造器都会调用父类的构造器
     */
    /**
     * todo:父类没有无参构造器时子类必须指明要调用的父类构造器否则会报错
     */
    public Base(String name){
        System.out.println("父类有参构造器" + name);
    }
    public Base(String name,int age){
        System.out.println("父类两参构造器\t" + name +"\t" + age);
    }
    public Base(String name,int age,double score){
        System.out.println("父类三参构造器\t" + name +"\t" + age +"\t"+ score);
    }
    // 父类提供公共的方法进行间接访问私有的属性
    public int getN4() {
        return n4;
    }

    public void setN4(int n4) {
        this.n4 = n4;
    }

    public void test1(){
        System.out.println("test1");
    }
    protected  void test2(){
        System.out.println("test2");
    }
    void test3(){
        System.out.println("test3");
    }
    private  void test4(){
        System.out.println("test4");
    }
    //提供公共的方法访问私有方法
    public  void call(){
        test4();
    }
}
