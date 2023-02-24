package study.abstractclass.abstractabstract;

import study.abstractclass.abstractdetail.E;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/8 22:39
 */
public class CommonEmployee extends Employee {

    public CommonEmployee() {
    }

    public CommonEmployee(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工" + getName() + "工作中");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
