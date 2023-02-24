package study.reflection.getclassmsg;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/19 21:22
 */
public class SuperPerson {
    public String hobby;
    protected  char sex;
    String email;
    private  String school;

    public SuperPerson(String hobby) {
        this.hobby = hobby;
    }

    public SuperPerson() {
    }

    public void func1(){
        System.out.println("func1");
    }
    protected void func2(){
        System.out.println("func2");
    }
   void func3(){
        System.out.println("func3");
    }
    private void func4(){
        System.out.println("func4");
    }

}
