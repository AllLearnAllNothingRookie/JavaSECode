package study.superstudy.study.super01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/23 20:30
 *
 *  todo: super代表父类的引用，用于访问父类的属性、方法和构造器
 *      1.super可以访问父类的属性，但是不能访问父类的私有属性
 *             语法: super.属性名;
 *      2.super可以访问父类的方法，但不能访问父类的私有方法
 *              语法:super.方法名(参数列表);
 *      3.super可以访问父类构造器,但不能访问父类私有构造器
 *              语法:super(参数列表);
 *            必须要要在构造器中使用，并且必须为构造器的第一行
 */
public class B extends A {
    /**
     * super可以访问父类构造器,但不能访问父类私有构造器
     *  *              语法:super(参数列表);
     *  *            必须要要在构造器中使用，并且必须为构造器的第一行
     */
    public B(){
        super();
    }
    public B(int n1){
        super(n1);
    }
    public B(int n1,int n2){
        super(n1,n2);
    }
    public B(int n1,int n2,int n3){
        //'A(int, int, int)' has private access in 'superstudy.study.super01.A'
        //super(n1,n2,n3);
    }
    // super访问父类构造器必须在第一行
    public B(int n1,int n2,int n3,int n4){
        this();
        //Call to 'super()' must be first statement in constructor body
        //super();
    }
    // super访问构造器只能在构造器中使用，不能在其他方法中使用
    public void test(){
        //Call to 'super()' must be first statement in constructor body
        //super();
    }


    /**
     * super可以访问父类的属性，但是不能访问父类的私有属性
     *  *    语法: super.属性名;
     */
    public void getFind(){
        System.out.println(super.n1);
        System.out.println(super.n2);
        System.out.println(super.n3);
        //'n4' has private access in 'superstudy.study.super01.A'
        //System.out.println(super.n4);
    }
    /**
     * super可以访问父类的方法，但不能访问父类的私有方法
     *  *              语法:super.方法名(参数列表);
     */
    public void meth(){
        super.test01();
        super.test02();
        super.test03();
        //'test04()' has private access in 'superstudy.study.super01.A'
        //super.test04();
    }
}
