package study.setstudy.hashsetstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/8 22:23
 */
public class Dog {
    public String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
