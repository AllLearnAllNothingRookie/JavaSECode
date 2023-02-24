package homework.homework02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 16:49
 */
public class AssociateProfessor extends  Teacher{
    public AssociateProfessor() {
    }


    public AssociateProfessor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public String introduce() {
        return "副教授:\t" + super.introduce();
     }
}
