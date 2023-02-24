package study.polymorphic.exercise.objectanalysisexercise.equalsexercies;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/30 10:21
 * 判断两个Person对象是否相等，如何两个对象的所有属性都相等的话返回true否则返回false
 */
public class Person {
    private String name;
    private int age;
    private char gender;

    public Person() {
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
       /* //先判断是否为null
        if (obj == null){
            return false;
        }*/
        //判断是否为同一个对象
        if (this == obj){
            return true;
        }
        //判断是否是同一个类的对象
        if (obj instanceof  Person){
            // 判断对象里的每个元素
           /*
            if (this.name.equals(((Person) obj).getName())
                    && this.age == ((Person) obj).getAge() &&
                    this.gender == ((Person) obj).gender){
                return true;
            }
            return false;
            */
            //简写
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }
}
