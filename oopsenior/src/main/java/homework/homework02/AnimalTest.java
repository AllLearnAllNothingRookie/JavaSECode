package homework.homework02;

import study.abstractclass.abstractdetail.D;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/27 14:07
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.shout();
        dog.shout();
    }
}
