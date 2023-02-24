package alanrookie.study.method01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/27 21:59
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.speak();
        int cal01 = person.cal01();
        System.out.println(cal01);
        int cal02 = person.cal02(10);
        System.out.println(cal02);
        int sum = person.geuSum(5, 10);
        System.out.println(sum);
    }
}
