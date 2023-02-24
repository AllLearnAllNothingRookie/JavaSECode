package alanrookie.exercise.constructorexercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 10:39
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name + ":" + person.age);
        Person person1 = new Person("rookie",18);
        System.out.println(person1.name + ":" + person1.age);
    }
}
