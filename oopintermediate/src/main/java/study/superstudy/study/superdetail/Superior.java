package study.superstudy.study.superdetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/24 21:30
 */
public class Superior extends Top{
    public String name = "alanRookie";
    public int age = 23;
    public String job = "Java";
    public String birthday = "12.29";
    public String workingYears = "2.5年";
    public Superior() {
    }
    public Superior(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public void cell(){
        System.out.println("父类叫");
    }
    public void study(){
        System.out.println("父类学习");
    }
}
