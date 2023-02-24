package study.extendsstudy.study.extends02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/21 21:51
 */
public class Extends02 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(90);
        pupil.info();
        Graduate graduate = new Graduate();
        graduate.name = "张扬";
        graduate.age = 22;
        graduate.testing();;
        graduate.setScore(80);
        graduate.info();
    }
}
