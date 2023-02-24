package homework.homework03;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 17:42
 */
public class Manager extends Employee{
    private double bonus;
    public Manager() {
    }

    public Manager(String name, double salary, double days, double grade,double bonus) {
        super(name, salary, days, grade);
        this.bonus =  bonus;
    }

    @Override
    public void printSalary() {
        System.out.println("姓名:" + getName() + "\t单日工资:" + getSalary() + "\t出勤天数:" + getDays() + "\t级别:" + getGrade() + "\t总工资:" + ( bonus + getSalary() * getDays() * getGrade()));
    }
}
