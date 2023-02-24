package homework.homework04;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 20:07
 */
public class Staff {
    /**
     * 姓名
     */
    private String name;
    /**
     * 工作
     */
    private String job;
    /**
     * 基本工资
     */
    private double salary;
    /**
     * 发工资月份
     */
    private int salMonth =12;

    public Staff() {
    }

    public Staff(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSalMonth() {
        return salMonth;
    }

    /**
     * 如果不是12月可以通过set方法修改
     * @param salMonth
     */
    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

    public  void printSalary(){
        System.out.println(name + "的工作是"+job + "年薪为:" + (salary * salMonth) + "元");
    }
}
