package study.abstractclass.abstractabstract;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/8 22:42
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager("00000001","ALANRookie",25000,100000);
        manager.work();
        System.out.println(manager);
        CommonEmployee commonEmployee = new CommonEmployee("19092203","tom",9000);
        commonEmployee.work();
        System.out.println(commonEmployee);
    }
}
