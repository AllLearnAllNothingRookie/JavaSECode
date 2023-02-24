package study.reflection.getclassmsg;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 14:31
 */
public class ClassNameTest {
    public static void main(String[] args) {
        System.out.println(String.class.getName());
        System.out.println(int[].class.getName());
        System.out.println(int.class.getName());
        System.out.println(int[][].class.getName());
        System.out.println(Object[].class.getName());
    }
}
