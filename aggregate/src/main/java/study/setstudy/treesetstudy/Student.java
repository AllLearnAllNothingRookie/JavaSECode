package study.setstudy.treesetstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/17 11:05
 */
public class Student implements Comparable{
    private int id;
    private String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        return this.id - student.getId();
    }
}
