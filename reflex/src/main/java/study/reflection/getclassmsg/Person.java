package study.reflection.getclassmsg;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/19 21:14
 */
public class Person extends SuperPerson {
    //属性
    public String name;
    protected int age;
    String job;
    private double sal;
    //构造器

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    private Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    //方法
    public void m1(){
        System.out.println("m1");
    }
    protected void m2(){
        System.out.println("m2");
    }
    void m3(String name, int age, String job){
        System.out.println("m3");
    }
    private void m4(){
        System.out.println("m4");
    }
}
