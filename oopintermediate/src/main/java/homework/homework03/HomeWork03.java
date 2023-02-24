package homework.homework03;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 17:29
 * 父类:员工类
 * 子类:部门经理类,普通员工类
 * 部门经理工资: 1000 + 单日工资 * 天数 * 等级(1.2)
 * 普通员工工资: 单日工资 * 天数 * 等级 (1.0)
 * 员工属性: 姓名,单日工资,工作天数
 * 员工方法:打印工资
 * 普通员工及部门经理是员工类的子类,需要重写打印工资的方法
 */
public class HomeWork03 {
    public static void main(String[] args) {
        Manager manager = new Manager("Tom",400,22.5,1.2,1000);
        manager.printSalary();
        Staff staff = new Staff("Jack",300,22,1.0);
        staff.printSalary();
    }
}
