package study.polymorphic.study.polymorphicarray;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/28 20:55
 */
public class Student extends Person{
    private double score;

    public Student() {
    }

    public Student(String name, int age,double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public String say(){
        return super.say() + "\t分数:" + score;
    }
    public void study(){
        System.out.println("学生"+ getName()+ "在学Java,Go,C,CPP,C#,Python,前端");
    }
}
