package study.reflection.operationobject;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 11:14
 */
public class Student {
    public int age;
    private String name;
    private  static  double score;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ",score = " + score +
                '}';
    }
}
