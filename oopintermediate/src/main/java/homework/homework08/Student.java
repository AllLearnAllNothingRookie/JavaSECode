package homework.homework08;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/2 9:33
 */
public class Student extends Person{
    private String stu_id;

    public Student() {
    }

    public Student(String name, int age, char sex, String stu_id) {
        super(name, age, sex);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public String play() {
        return  getName() + "爱玩足球";
    }

    @Override
    public String toString() {
        return "学生的信息:\n" + super.toString() + "\n学号:" + stu_id;
    }

    public void study(){
        System.out.println("我承诺,我会好好学习.");
    }

    /**
     * 将输出的信息封装为一个方法
     */
    public void studentInfo(){
        System.out.println("学生的信息:");
        System.out.println(basicInfo());
        System.out.println("学号:" + stu_id);
        //System.out.println(super.basicInfo());
        study();
        System.out.println(play());
    }
}
