package study.reflection.classstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 14:01
 */
public class ClassTest1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<String> stringClass = String.class;
        Class<? extends String> aClass = "Hello".getClass();
        Class<?> aClass1 = Class.forName("java.lang.String");
        Class<?> aClass2 = ClassLoader.getSystemClassLoader().loadClass("java.lang.String");
        System.out.println(stringClass == aClass);
        System.out.println(stringClass == aClass1);
        System.out.println(stringClass == aClass2);
    }
}
