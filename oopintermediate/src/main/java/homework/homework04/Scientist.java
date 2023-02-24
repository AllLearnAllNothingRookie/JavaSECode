package homework.homework04;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 20:18
 * 科学家
 */
public class Scientist extends Staff{
    /**
     * 年终奖
     */
    private double  bonus;

    public Scientist() {
    }

    public Scientist(String name, String job, double salary, double bonus) {
        super(name, job, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSalary() {
        System.out.println("科学家" + getName() + "的工作是"+ getJob() + "年薪为:" + (getSalary() * getSalMonth() + bonus));
    }
}
