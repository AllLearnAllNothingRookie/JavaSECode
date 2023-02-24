package homework.homework04;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 20:13
 * 服务员类
 */
public class Server extends Staff{
    public Server() {
    }

    public Server(String name, String job, double salary) {
        super(name, job, salary);
    }

    @Override
    public void printSalary() {
        System.out.println("服务员");
        super.printSalary();
    }
}
