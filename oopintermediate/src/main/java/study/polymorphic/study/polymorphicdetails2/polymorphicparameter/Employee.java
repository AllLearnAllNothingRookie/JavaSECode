package study.polymorphic.study.polymorphicdetails2.polymorphicparameter;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/28 21:22
 */
public class Employee {
    private String name;
    public double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
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

    /**
     * 计算年工资
     * @return
     */
    public double getAnnual(){
        return  12 * salary;
    }
}
