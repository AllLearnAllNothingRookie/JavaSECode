package study.interfacestudy.exercise.exercise01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/10 14:14
 */
public class InterfaceExercise {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(B.a);
        System.out.println(IA.a);
        b.hi();
        // B.say(); //错误
        IA.say();
        //错误
        //b.say();
    }
}
