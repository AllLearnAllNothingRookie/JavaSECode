package study.iostream.objectinputoutputstream;

import java.io.Serializable;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/8 15:13
 */
public class Dog implements Serializable {
    private String name;
    private  int age;
    private static  String nation;
    private transient String color;
    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age,String nation, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.nation = nation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getNation() {
        return nation;
    }

    public static void setNation(String nation) {
        Dog.nation = nation;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                 ", nation = " + nation +
                '}';
    }
}
