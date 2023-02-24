package study.interfacestudy.exercise.exercise01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/10 14:15
 */
public class B implements IA{
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(B.a);
        System.out.println(IA.a);
        //b.say(); //错误
        //B.say(); // 错误
        b.hi();
        IA.say();
    }
}
