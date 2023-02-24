package study.interfacestudy.exercise.exercise01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/10 14:14
 */
public interface IA {
    int a = 23;
    default void hi(){
        System.out.println("hi");
    }
    static void say(){
        System.out.println("say");
    }
}
