package homework.homework01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 15:35
 */
public class Person {
    private String name;
    private  int age;
    private String job;

    public Person() {
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "姓名:" + name + "\t年龄:" + age + "\t工作:" + job;
    }
}
