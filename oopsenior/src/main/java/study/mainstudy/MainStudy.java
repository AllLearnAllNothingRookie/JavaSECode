package study.mainstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/6 16:19
 * todo:深入理解main方法:
 *      main方法是Java虚拟机来调用的
 *      main方法的形式: public static void main(String[] args){}
 *      1.java虚拟机需要调用类的main方法,所有需要该方法的访问权限是public的
 *      2.Java虚拟机执行main方法时不必创建对象,所以该方法必须时static
 *      3.main方法接收String类型的数组参数,该数组中保存执行java命令时传递给
 *          允许类的参数
 *      4.参数传递形式: java 执行的程序 参数1 参数2 参数3 ……
 * todo:特别提示:
 *      1.在main方法中,可以直接调用main方法所在类的静态方法或静态属性
 *      2.不能直接访问该类的非静态成员,必须创建该类的一个实例对象后,才能通过这个对象
 *          去访问类中的非静态成员
 */
public class MainStudy {
    public static void main(String[] args) {
        //输出运行时传递的参数
        for (String arg : args) {
            System.out.println(arg);
        }
        //todo:在main方法中,可以直接调用main方法所在类的静态方法或静态属性
        System.out.println(age);
        //Non-static field 'name' cannot be referenced from a static context
        // System.out.println(name);
        say();
        //Non-static method 'hi()' cannot be referenced from a static context
        //hi();
        //todo:不能直接访问该类的非静态成员,必须创建该类的一个实例对象后,才能通过这个对象
        //    去访问类中的非静态成员
        MainStudy mainStudy = new MainStudy();
        System.out.println(mainStudy.name);
        mainStudy.hi();
    }
    private static  int age = 100;
    private String name = "小谷";
    public static void say(){

    }
    public void hi(){

    }
}
