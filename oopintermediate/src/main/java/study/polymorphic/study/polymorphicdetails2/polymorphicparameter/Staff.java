package study.polymorphic.study.polymorphicdetails2.polymorphicparameter;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/28 21:27
 */
public class Staff extends Employee{
    public Staff() {
    }

    public Staff(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("员工" + getName() + "在工作");
    }
}
