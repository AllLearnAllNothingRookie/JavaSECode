package study.polymorphic.study.polymorphicdetails2.polymorphicparameter;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/28 21:25
 */
public class Manager extends Employee{
    public double bonus;

    public Manager() {

    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
    public void manage(){
        System.out.println("经理：" + getName() + "管理员工");
    }
}
