package study.polymorphic.study.polymorphicarray;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/28 20:56
 */
public class Teacher extends Person{
    public double salary;

    public Teacher(double salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String say(){
        return  super.say() + "\t薪资:" + salary;
    }
    public void  teach(){
        System.out.println("老师" + getName() +"在教Java,Go,C,CPP,C#,Python,前端");
    }
}
