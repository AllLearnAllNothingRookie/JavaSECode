package study.reflection.getclassmsg;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 16:20
 */
public class Student {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
