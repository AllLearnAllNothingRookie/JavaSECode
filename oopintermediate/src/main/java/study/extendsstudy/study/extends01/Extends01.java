package study.extendsstudy.study.extends01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/21 21:29
 */
public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(80.7);
        pupil.info();
        Graduate graduate = new Graduate();
        graduate.name = "李明";
        graduate.age = 19;
        graduate.testing();
        graduate.setScore(78);
        graduate.info();
    }
}
