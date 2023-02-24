package study.reflection.operationobject;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 10:42
 */
public class User {
    private int age = 18;
    private String name = "alanRookie";

    public User() {
    }

    public User(String name,int age) {
        this.age = age;
        this.name = name;
    }
    private User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
