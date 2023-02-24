package study.extendsstudy.override.exercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/26 22:49
 */
public class Person {
    private String name;
    private  int age;
     public Person(){

     }
     public Person(String name,int age){
         this.name = name;
         this.age = age;
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
    public String say(){
         return  "姓名:" + name + "\t年龄：" + age;
    }
}
