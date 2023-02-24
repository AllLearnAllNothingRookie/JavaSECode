package alanrookie.study.constructordetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/11 23:14
 * 构造器细节:
 *      1.一个类可以定义多个不同的构造器，即构造器重载
 *      2.构造器名和类名要相同
 *      3.构造器没有返回值
 *      4.构造器是完成对象初始化的，并不是创建对象
 *      5.在创建对象时，系统自动调用该类的构造方法(构造器不能主动调用[对象.方法名]
 *          ,只能系统在创建对象时调用构造器)
 *       6.如果没有定义构造方法，系统会自动给类生成一个默认的无参构造方法(也叫默认构造方法)
 *           默认构造器
 *          [修饰符(默认和类的修饰符有一致)] 类名(){
 *
 *          }
 *       7.一旦定义了构造方法，默认的构造方法就覆盖了，就不能在使用默认的无参构造器，除非显示的定义一下
 */
public class ConstructorDetail {
    String name;
    int age;
    double score;

    /**
     *  1.一个类可以定义多个不同的构造器，即构造器重载
     *  2.构造器名和类名要相同
     *  3.构造器没有返回值
     *  4.构造器是完成对象初始化的，并不是创建对象
     *  5.在创建对象时，系统自动调用该类的构造方法(构造器不能主动调用[对象.方法名]
     *  ,只能系统在创建对象时调用构造器)
     *  6.如果没有定义构造方法，系统会自动给类生成一个默认的无参构造方法(也叫默认构造方法)
     *  7.一旦定义了构造方法，默认的构造方法就覆盖了，就不能在使用默认的无参构造器，除非显示的定义一下
     */
    //无参构造器
    public ConstructorDetail(){

    }
    //一个参数的构造器
    public ConstructorDetail(String cName){
        name = cName;
    }
    //两个参数的构造器
    public ConstructorDetail(String cName,int cAge){
        name = cName;
        age = cAge;
    }
    //三个参数的构造器
    public ConstructorDetail(String cName,int cAge ,double cScore){
        name = cName;
        age = cAge;
        score = cScore;
    }
}
