package study.extendsstudy.override.exercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/26 22:50
 */
public class Student extends  Person{
    private  String id;
    private double score;

    public Student() {
    }

    public Student(String id, double score) {
        this.id = id;
        this.score = score;
    }
    public Student(String name,int age,String id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public String  say(){
        //用super调用父类的方法
        return super.say() + "\t学号:" + id + "\t成绩:" + score;
        //return "姓名:" + getName() + "\t年龄:" + getAge() + "\t学号:" + id + "\t成绩:" + score;
    }
}
