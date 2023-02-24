package study.reflection.getclassmsg;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 16:22
 */
public class NewInstanceTest1 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("study.reflection.getclassmsg.Student");
        Object o = clazz.newInstance();
        System.out.println(o);
    }
}
