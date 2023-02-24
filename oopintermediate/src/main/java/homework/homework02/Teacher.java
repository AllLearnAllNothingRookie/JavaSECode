package homework.homework02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 16:44
 * 要求有属性:姓名name,年龄age,职称post,基本工资salary
 */
public class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;
    private double grade;
    public Teacher() {
    }

    public Teacher(String name, int age, String post, double salary,double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String introduce(){
        return "姓名:" + name + "\t年龄:" + age + "\t职称:" + post + "\t薪资:" + salary + "\t级别:" + grade ;
    }
}
