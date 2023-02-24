package alanrookie.homework.homework09;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 20:47
 * 创建一个Employee类,属性有(名字，性别，年龄，职位，薪水)，提供三个构造器
 *      -名字，性别，年龄，职位，薪水
 *      - 名字，性别，年龄
 *      - 职位，薪水
 *      要求充分利用构造器
 */
public class Employee {
    /**
     * 姓名
     */
    String name;
    /**
     * 年龄
     */
    int age;
    /**
     * 性别
     */
    String  sex;
    /**
     * 职位
     */
    String position;
    /**
     * 薪水
     */
    double salary;
    public Employee(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;

    }
    public Employee(String position,double salary){
        this.position = position;
        this.salary = salary;

    }
    public Employee(String name,int age,String sex,String position,double salary){
       /* this.name = name;
        this.age = age;
        this.sex = sex;*/
        this(name,age,sex);
        this.position = position;
        this.salary = salary;
    }
}
