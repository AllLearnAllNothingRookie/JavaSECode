package study.reflection.getclassmsg;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 14:53
 */
public class InterfaceTest {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        Class<?>[] interfaces = stringClass.getInterfaces();
        for (Class<?> inter : interfaces) {
            System.out.println(inter);
        }
    }
}
