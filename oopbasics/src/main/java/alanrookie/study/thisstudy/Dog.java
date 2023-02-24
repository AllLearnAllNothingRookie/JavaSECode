package alanrookie.study.thisstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 10:59
 * this关键字
 */
public class Dog {
    String name;
    int age;
    //没有使用this关键字，构造器里的变量名不能见名知意
   /* public Dog(String dName,int dAge){  //构造器
        name = dName;
        age = dAge;
    }*/
    //此时根据变量的作用域原则，构造器的变量就是构造器形参的变量，而不能初始化属性
    /*public Dog(String name,int age){
        name = name;
        age = age;
    }*/
    //引入this关键字

    /**
     * 解决了构造器变量名不见名知意的问题，同时也解决了形参名和属性重名的赋值问题
     *  this: 表示当前对象
     *      this.属性名   当前对象的属性
     *      this.方法名   当前对象的方法
     */
    public Dog(String name,int age){
        //this.name 指当前对象的属性 name
        // name : 构造器中的局部变量 name
        this.name = name;
        this.age = age;
    }
    public void info(){  //输出对象的属性信息
        System.out.println(name + " : " + age);
    }
}
