package homework.homework05;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/27 14:45
 */
public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person("唐僧",Factory.buildHorse());
        System.out.println("通常情况");
        person.makeHaste();
        System.out.println("遇到河流");
        person.setVehicles(Factory.builBoat());
        person.makeHaste();
        System.out.println("已经过河");
        person.setVehicles(Factory.buildHorse());
        person.makeHaste();
        System.out.println("----------------------------");
        person.common();
        person.common();
        person.passRiver();
        person.common();
        person.passRiver();
        person.common();
        person.passFlamingMountain();
        person.common();
    }
}
