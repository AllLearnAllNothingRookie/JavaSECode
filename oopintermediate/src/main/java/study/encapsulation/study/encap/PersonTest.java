package study.encapsulation.study.encap;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/20 17:12
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(653);
        person.setName("sdsdsdada");
        person.setJob("打工");
        person.setSalary(5642);
        person.info();
        person.setName("张三");
        person.setAge(23);
        person.setJob("打工");
        person.setSalary(34521);
        person.info();
    }
}
