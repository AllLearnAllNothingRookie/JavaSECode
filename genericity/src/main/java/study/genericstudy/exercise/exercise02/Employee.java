package study.genericstudy.exercise.exercise02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/19 14:23
 */
public class Employee {
    private  String name;
    private double sal;
    private  MyDate birthday;

    public Employee() {
    }

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "姓名: " + name + " 薪资：" + sal +
                " 生日：" + birthday.toString();
    }
}
