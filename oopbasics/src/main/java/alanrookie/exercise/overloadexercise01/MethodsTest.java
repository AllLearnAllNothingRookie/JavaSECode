package alanrookie.exercise.overloadexercise01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/9 21:15
 */
public class MethodsTest {
    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.m(2);
        methods.m(3,4);
        methods.m("Hello ,World");
        System.out.println(methods.max(6,8));
        System.out.println(methods.max(10,8));
        System.out.println(methods.max(6.9,8.7));
        System.out.println(methods.max(16.9,8.8));
        System.out.println(methods.max(6.9,8.7,12.9));
        System.out.println(methods.max(6.7,18.8,9.9));
        System.out.println(methods.max(16.9,8.8,7.9));
        //当没有相同参数类型的方法时会发生自动类型转换匹配能自动转换的方法，
        // 但是如果有类型相同的方法时先匹配参数类型相同的方法
        System.out.println(methods.max(16.9,8.8,70));
        System.out.println(methods.max(16.9,88,70));
        System.out.println(methods.max(169,88,70));
    }
}
