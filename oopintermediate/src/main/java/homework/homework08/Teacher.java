package homework.homework08;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/2 9:39
 */
public class Teacher extends Person{
    private double work_age;

    public Teacher() {
    }

    public Teacher(String name, int age, char sex, double work_age) {
        super(name, age, sex);
        this.work_age = work_age;
    }

    public double getWork_age() {
        return work_age;
    }

    public void setWork_age(double work_age) {
        this.work_age = work_age;
    }

    @Override
    public String play() {
       return getName() + "爱玩象棋";
    }

    @Override
    public String toString() {
        return "学生的信息:\n" + super.toString() + "\n工龄:" + work_age;
    }
    public void teach(){
        System.out.println("我承诺,我会认真教学.");
    }
    public void teacherInfo(){
        System.out.println("学生的信息:");
        System.out.println(basicInfo());
        //System.out.println(super.basicInfo());
        System.out.println("工龄:" + work_age);
        teach();
        System.out.println(play());
    }
}
