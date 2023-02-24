package homework.homework08;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/2 9:29
 */
public class Person {
    private String name;
    private  int age;
    private char sex;

    public Person() {
    }

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    public String play(){
        return  name + "在愉快的玩耍";
    }

    @Override
    public String toString() {
        return "姓名:" + name  + "\n年龄:" + age + "\n性别:" + sex;
    }
    public String basicInfo(){
        return  "姓名:" + name  + "\n年龄:" + age + "\n性别:" + sex;
    }
}
