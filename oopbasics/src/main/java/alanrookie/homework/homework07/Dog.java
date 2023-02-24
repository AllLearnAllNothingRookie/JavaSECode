package alanrookie.homework.homework07;

import java.lang.ref.SoftReference;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 19:40
 * 设计一个Dog类，有名字、颜色和年龄属性，定义输出方法show显示其信息
 */
public class Dog {
    String name;
    int age;
    String colour;
    public Dog(){

    }
    public Dog(String name,int age,String colour){
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    /**
     * 显示狗的信息
     */
    public void show(){
        System.out.println(name + "的年龄为:" + age + ",颜色为:" + colour);
    }

}
