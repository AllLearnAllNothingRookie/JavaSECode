package study.polymorphic.study.objectanalysis.tostring;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/30 14:53
 */
public class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster() {
    }

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    //可以通过快捷键进行
    // 系统重写后默认时输出类的全部属性，当然也可以自己定义输出的内容
    @Override
    public String toString() {
        return "姓名:" + name + "\t工作:" + job  + "\t薪资:" + sal;
    }
}
