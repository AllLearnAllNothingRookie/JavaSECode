package alanrookie.exercise.constructorexercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 10:21
 * 构造器练习：
 *   要求在person类中添加两个构造器：
 *      - 无参构造器：利用构造器设置所有人的年龄初始化为18
 *      - 带两个参数的构造器(pName,pAge),使得每次创建对象时初始化对象的name和age两个属性
 *      分别用不用的构造器创建对象
 */
public class Person {
    String name;
    int age;
    public Person(){
        age = 18;
    }
    public Person(String pName,int pAge){
        name = pName;
        age = pAge;
    }
}
