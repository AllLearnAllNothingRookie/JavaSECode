package study.extendsstudy.study.extends01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/21 21:22
 * 大学生
 */
public class Graduate {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }
    public void testing(){
        System.out.println("大学生" + name + "正在考大学数学");
    }
    public void info(){
        System.out.println("姓名：" + name + "\t年龄:" + age + "\t分数:" + score);
    }
}
