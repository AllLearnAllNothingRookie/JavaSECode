package study.staticstudy.staticmethoddetails;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/5 22:30
 */
public class Detail {
    private  int age;
    private static String name;
    public static void hi(){

    }
    public void say(){

    }
    public static  void  he(){
        // todo:类方法中不允许使用与对象相关的关键字如this,super
        //study.staticstudy.staticmethoddetails.Detail.this'
        // cannot be referenced from a static context
        //System.out.println(this.age);
        //study.staticstudy.staticmethoddetails.Detail.super'
        // cannot be referenced from a static context
       // System.out.println(super.hashCode());
        //todo:类方法(静态方法)中只能访问静态变量或静态方法
        //访问静态变量
        System.out.println(name);
        //访问非静态变量
        //Non-static field 'age' cannot be referenced from a static context
       // System.out.println(age);
        //访问静态方法
        hi();
        //访问非静态方法
        //Non-static method 'say()' cannot be referenced from a static context
        //say();
        //todo:可以通过在静态成员中创建对象的方式访问类中的非静态成员
        Detail detail = new Detail();
        detail.say();
    }
    public   void  h(){
        //todo:普通方法中可以使用与对象相关的关键字(this,super)
        System.out.println(this.age);
        System.out.println(super.hashCode());
        //todo:普通成员方法既可以访问静态变量和静态方法,可以可以访问非静态变量和非静态方法
        //访问静态变量
        System.out.println(name);
        //访问非静态变量
        System.out.println(age);
        //访问静态方法
        hi();
        //访问非静态方法
        say();
    }
}
