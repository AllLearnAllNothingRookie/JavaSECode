package homework.homework03;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 17:42
 */
public class Staff extends Employee{
    public Staff() {
    }

    public Staff(String name, double salary, double days, double grade) {
        super(name, salary, days, grade);
    }

    @Override
    public void printSalary() {
        System.out.println("姓名:" + getName() + "\t单日工资:" + getSalary() + "\t出勤天数:" + getDays() + "\t级别:" + getGrade() + "\t总工资:" + ( getSalary() * getDays() * getGrade()));
    }
}
