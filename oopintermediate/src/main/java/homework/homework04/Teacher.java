package homework.homework04;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 20:14
 * 教师类
 */
public class Teacher extends Staff{
    /**
     * 课酬
     */
    private double classRemuneration;
    /**
     * 上课天数
     */
    private double classDays;
    public Teacher() {
    }

    public Teacher(String name, String job, double salary, double classRemuneration, double classDays) {
        super(name, job, salary);
        this.classRemuneration = classRemuneration;
        this.classDays = classDays;
    }

    public double getClassRemuneration() {
        return classRemuneration;
    }

    public void setClassRemuneration(double classRemuneration) {
        this.classRemuneration = classRemuneration;
    }

    public double getClassDays() {
        return classDays;
    }

    public void setClassDays(double classDays) {
        this.classDays = classDays;
    }

    @Override
    public void printSalary() {
        System.out.println("教师" + getName() + "的工作是"+ getJob() + "年薪为:" + (getSalary() * getSalMonth() + classDays * classRemuneration) + "元");
    }
}
