package study.extendsstudy.override.exercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/26 22:54
 */
public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("rookie",18);
        System.out.println(person.say());
        Student student = new Student("alanRookie",22,"201817025224",100);
        System.out.println(student.say());
    }
}
