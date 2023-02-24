package homework.homework03;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 17:35
 */
public class Employee {
    private String name;
    private double salary;
    private double days;
    private double grade;
    public Employee() {
    }

    public Employee(String name, double salary, double days, double grade) {
        this.name = name;
        this.salary = salary;
        this.days = days;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getDays() {
        return days;
    }

    public void setDays(double days) {
        this.days = days;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void printSalary(){
        System.out.println("姓名:" + name + "单日工资:" + salary + "出勤天数:" + days + "级别:" + grade);
    }
}
