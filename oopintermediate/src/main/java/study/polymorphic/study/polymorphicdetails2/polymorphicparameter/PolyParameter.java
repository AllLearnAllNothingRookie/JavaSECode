package study.polymorphic.study.polymorphicdetails2.polymorphicparameter;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/28 21:20
 * todo:多态参数: 方法定义的形参是父类类型，实参允许为子列类型
 */
public class PolyParameter {
    public static void main(String[] args) {
        PolyParameter polyParameter = new PolyParameter();
        Staff staff = new Staff("tom",4800);
        Manager manager = new Manager("rookie",20000,10000);
        polyParameter.showEmpAnnual(staff);
        polyParameter.testWork(staff);
        polyParameter.showEmpAnnual(manager);
        polyParameter.testWork(manager);
    }
    //要求在测试类中可以调用所有员工的年工资
    public void showEmpAnnual(Employee employee){
        System.out.println("员工" + employee.getName() + "年薪为:" + employee.getAnnual());
    }
    //如果是普通员工在调用工作方法，经理则调用管理方法
    public void testWork(Employee employee){
        if (employee instanceof Staff){
            //Staff staff = (Staff)employee;
           // staff.work();
            //简化
           ((Staff) employee).work();
        }
        if (employee instanceof Manager){
            //Manager manager = (Manager) employee;
           // manager.manage();
            //简化
            ((Manager) employee).manage();
        }
    }

}
