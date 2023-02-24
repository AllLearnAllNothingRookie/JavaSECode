package homework.homework04;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 20:12
 * 农民
 */
public class Farmer extends Staff{
    public Farmer() {
    }

    public Farmer(String name, String job, double salary) {
        super(name, job, salary);
    }

    @Override
    public void printSalary() {
        System.out.println("农民");
        super.printSalary();
    }
}
