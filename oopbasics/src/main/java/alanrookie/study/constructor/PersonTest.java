package alanrookie.study.constructor;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/10 23:28
 */
public class PersonTest {
    public static void main(String[] args) {
        //当我们new一个对象时，直接通过构造器指定姓名和年龄
        Person person = new Person("rookie",18);
        System.out.println(person.name);
        System.out.println(person.age);
    }
}
