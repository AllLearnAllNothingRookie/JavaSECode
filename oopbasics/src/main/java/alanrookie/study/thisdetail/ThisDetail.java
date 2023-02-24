package alanrookie.study.thisdetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 15:55
 * this关键字细节
 *      1.this关键字可以用来访问本类的属性，方法，构造器
 *      2.this用于区分当前类的属性和局部变量
 *      3.this访问成员方法的语法: this.方法名(参数列表)
 *      4.this访问构造器语法: this(参数列表);注意：只能在构造器中使用
 *      5.this不能在类定义的外部使用，只能在类定义的方法中使用
 */
public class ThisDetail {
    String name;
    int age;

    /**
     * 4.this访问构造器语法: this(参数列表);注意：只能在构造器中使用
     * todo: 只能在构造器中调用构造器，不能在普通方法中调用构造器
     */
    public ThisDetail() {
        //通过this访问类中的构造器
        /**
         * todo： 注意如果要调用其他构造器，那么必须放在第一条
         *      即 this(参数列表) 语句必须放在第一条
         */
        this("rookie",18);
    }

    /**
     * 2.this用于区分当前类的属性和局部变量
     */
    public ThisDetail(String name) {
        //通过this访问类中的其他构造器
        //调用其他构造器还能传递变量
        this(name,19);
        //this.name = name;
    }

    public ThisDetail(int age) {
        //通过this访问类中的其他构造器
        this("tom",age);
        //this.age = age;
    }

    public ThisDetail(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void fun01(){
        //第一种方式调用类中的其它方法
        //相当于省略了this
        fun02();
        fun03("rookie",18,99);
        //使用this调用类中的方法
        //调用无参方法
        this.fun02();
        //调用有参方法
        this.fun03("tom",22,89);
        System.out.println("第一个方法");
    }
    public void fun02(){
        System.out.println("第二个方法");
    }
    public void fun03(String name,int age,double score){
        System.out.println(name + "-" + age + "-" + score);
        System.out.println("第三个方法");
    }

    /**
     * this访问属性
     */
    public void fun04(){
        //传统方法  -- 当属性和局部变量重名后采用就近原则，可能输出的不是属性而是
        // 和属性同名的局部变量的值
        System.out.println("name:" + name +"age:" + age);
        //使用this -- 不管属性是否与局部变量重名，最后输出的都是属性
        System.out.println("name:" + this.name +"age:" + this.age);
    }
}
