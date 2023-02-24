package homework.homework04;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 20:11
 * 工人
 */
public class Wright extends Staff {
    public Wright() {
    }

    public Wright(String name, String job, double salary) {
        super(name, job, salary);
    }

    @Override
    public void printSalary() {
        System.out.println("工人");
        super.printSalary();
    }
}
