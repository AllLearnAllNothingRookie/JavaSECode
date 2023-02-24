package homework.homework07;

import javax.print.Doc;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 22:22
 * 编写Doctor类(name,age,job,gender,sal)提供对应的get,set方法
 *  5个参数的构造器，重写equals方法判断两个对象是否相等
 */
public class HomeWork07 {
    public static void main(String[] args) {
        Doctor tom = new Doctor("tom",28,'M',"doctor",8000);
        Doctor tom1 = new Doctor("tom",28,'M',"doctor",8000);
        System.out.println(tom.equals(tom1));
        Doctor tom2 = new Doctor("tom1",28,'M',"doctor",8000);
        System.out.println(tom.equals(tom2));
    }
}
