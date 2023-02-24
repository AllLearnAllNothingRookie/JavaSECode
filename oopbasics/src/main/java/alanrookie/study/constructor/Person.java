package alanrookie.study.constructor;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/10 23:26
 * 构造器入门
 */
public class Person {
    String name;
    int age;
    public Person(){

    }

    /**
     * 构造器:
     *  1.构造器没有返回值，注意不能写void
     *  2.构造器的名称和类名一样
     *  3.构造器有形参列表，规则和成员方法一样
     *  注意调用构造器的时候对象已经存在，构造器的作用是为属性进行初始化
     *  和执行一些对象创建后就执行的语句
     */
    public Person(String pName,int pAge){
        System.out.println("调用构造器，完成对象属性的初始化");
        name = pName;
        age = pAge;
    }
}
