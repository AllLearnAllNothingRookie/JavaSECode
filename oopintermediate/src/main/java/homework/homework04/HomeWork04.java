package homework.homework04;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 17:50
 *   设计父类--- 员工类 ，子类: 工人类,农民类,教师类,科学家类,服务生类
 *   其中工人、农民、服务生只有基本工资
 *   教师除了基本工资以外还有课酬(元/天)
 *   科学家除了基本工资以外还有年终奖
 *   编写一个测试类吧所有类型的员工的全年工资打印出来
 */
public class HomeWork04 {
    public static void main(String[] args) {
        Farmer farmer = new Farmer("张三","农民",3000);
        farmer.printSalary();
        Wright wright = new Wright("李四","工人",4000);
        wright.printSalary();
        Server server = new Server("王五","服务生",4500);
        server.printSalary();
        Teacher teacher = new Teacher("李莉","教师",6000,100,280);
        teacher.printSalary();
        Scientist scientist = new Scientist("王强","科学家",15000,450000);
        //设置每年发薪月份
        scientist.setSalMonth(16);
        scientist.printSalary();
    }
}
