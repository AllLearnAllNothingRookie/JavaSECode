package study.interfacestudy.exercise.exercise02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/10 17:18
 */
public class A extends ClassA implements  InterA{
    public void pX(){
        //java: 对x的引用不明确
        //study.interfacestudy.exercise.exercise02.ClassA 中的变量 x
        // 和 study.interfacestudy.exercise.exercise02.InterA 中的变量 x 都匹配
       // System.out.println(x);
        System.out.println(super.x);
        System.out.println(InterA.x);
        //java: 对x的引用不明确
        //study.interfacestudy.exercise.exercise02.ClassA 中的变量 x
        // 和 study.interfacestudy.exercise.exercise02.InterA 中的变量 x 都匹配
        //System.out.println(this.x);
    }

    public static void main(String[] args) {
        new A().pX();
    }
}
