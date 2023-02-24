package homework.homework02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 16:46
 */
public class Professor  extends Teacher{
    public Professor() {
    }

    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    public String introduce(){
        return "教授:\t"+  super.introduce();
    }
}
