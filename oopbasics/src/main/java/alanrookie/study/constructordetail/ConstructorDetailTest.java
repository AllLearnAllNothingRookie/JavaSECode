package alanrookie.study.constructordetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/11 23:39
 */
public class ConstructorDetailTest {
    public static void main(String[] args) {
        //使用无参构造器
        ConstructorDetail constructorDetail = new ConstructorDetail();
        //使用一个参数的构造器
        ConstructorDetail constructorDetail1 = new ConstructorDetail("test");
        //使用两个参数的构造器
        ConstructorDetail constructorDetail2 = new ConstructorDetail("test",18);
        //使用三个参数的构造器
        ConstructorDetail constructorDetail3 = new ConstructorDetail("test",18,100);
        //Dog类中没有显示定义无参构造器则会默认的生成一个无参构造器
        //此时使用的是系统提供的默认无参构造器
        Dog dog = new Dog();
        //Cat类中显示定义了构造器[没有无参构造器]，则系统提供的默认无参构造器被覆盖，则不能使用无参构造器初始化对象
        //若要使用无参构造器初始化对象则需要在类中显示的定义无参构造器
        //错误
       // Cat cat = new Cat();
    }
}
