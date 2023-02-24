package study.superstudy.study.superdetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/24 21:30
 * todo: super给程序带来的好处、细节:
 * 	    1.调用父类构造器的好处(分工明确，父类的属性由父类初始化、子类的属性由子类初始化)
 * 	    2.当子类中有父类的成员(属性/方法)重名时，为了访问父类的成员，必须通过super。
 * 		    如果没有重名，使用super、this、直接访问是一样的效果。
 * 		3.super的访问不限于直接父类，如果父类的父类与父类中有相同的成员，也可以使用super
 * 	        去访问父类的父类中的成员，如果多个基类(上级父类)有同名的成员，使用super访问时
 * 	        遵循就近原则，当然也要遵循访问权限的相关规定。
 *
 */
public class Current extends Superior{
    public double salary = 15000;
    public double score = 99.99999;
    //父子类中同名的属性
    public String birthday = "01.01";
    public Current(){

    }
    /**
     * 调用父类构造器的好处(分工明确，父类的属性由父类初始化、子类的属性由子类初始化)
     */
    public Current(String name, int age, String job,double salary,double score){
        super(name, age, job);
        this.salary = salary;
        this.score = score;
    }
    public void cell(){
        System.out.println("子类叫");
    }

    /**
     * todo：类中属性加载的顺序:
     *     1.先找本类,如果,有且可以调用则调用，不能调用就报错
     *     2.如果本类没有，则找父类(如果有并可以调用则调用)
     *     3.如果父类没有则继续找父类的父类，直到Object类
     *     在查找属性的过程中，找到了但不能访问，则报错，cannot access
     *     在查找属性的过程中，没有找到，则提示属性不存在
     */
    public void testFiled(){
        /**
         * todo: 本类中有该属性名时:
         *      属性名和this.属性名都是访问本类的属性名
         *      super.属性名访问的是父类的属性名
         */
        //调用本类的属性
        System.out.println(birthday);
        System.out.println(this.birthday);
        //调用父类的属性
        // todo: super表示查找方法、属性时是从父类开始查找，其他规则一样
        System.out.println(super.birthday);
        /**
         *  todo:本类中没有该属性名时:
         *   属性名、this.属性名和super.属性名完全等价
         *
         */
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        //调用直接父类的属性
        /**
         * todo:super的访问不限于直接父类，如果父类的父类与父类中有相同的成员，也可以使用super
         *      去访问父类的父类中的成员，如果多个基类(上级父类)有同名的成员，使用super访问时
         *     遵循就近原则，当然也要遵循访问权限的相关规定。
         */
        System.out.println(super.workingYears);
        System.out.println(super.assets);
    }
    /**
     * todo：类中方法加载的顺序:
     *     1.先找本类,如果,有且可以调用则调用，不能调用就报错
     *     2.如果本类没有，则找父类(如果有并可以调用则调用)
     *     3.如果父类没有则继续找父类的父类，直到Object类
     *     在查找方法的过程中，找到了但不能访问，则报错，cannot access
     *     在查找方法的过程中，没有找到，则提示方法不存在
     */
    public void testMethod(){
        /**
         * todo: 本类中有该方法时:
         *      方法名(参数列表)和this.方法名(参数列表)都是访问本类的方法
         *      super.方法名(参数列表)访问的是父类的方法
         */
        cell();
        this.cell();
        // todo: super表示查找方法、属性时是从父类开始查找，其他规则一样
        super.cell();
        /**
         *  todo:本类中没有该方法时:
         *   方法名(参数列表)、this.方法名(参数列表)和super.方法名(参数列表)完全等价
         *
         */

        study();
        this.study();
        super.cell();
    }
}
