package study.abstractclass.abstractabstract;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/8 22:30
 */
public class Manager extends Employee{
    private double bonus;

    public Manager() {
    }

    public Manager(String id, String name, double salary) {
        super(id, name, salary);
    }

    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理" + getName() + "工作中");
    }

    @Override
    public String toString() {
        return super.toString() + "\t\t奖金:" + bonus;
    }
}
