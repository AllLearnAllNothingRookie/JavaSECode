package homework.homework02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 16:51
 */
public class Lecturer extends Teacher{
    public Lecturer() {
    }


    public Lecturer(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public String introduce() {
        return "讲师:\t" + super.introduce();
    }
}
