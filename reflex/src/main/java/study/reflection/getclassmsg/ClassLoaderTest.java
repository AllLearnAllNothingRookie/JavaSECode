package study.reflection.getclassmsg;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 14:23
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader classLoader = String.class.getClassLoader();
        System.out.println(classLoader);

        ClassLoader intClassLoader = int.class.getClassLoader();
        System.out.println(intClassLoader);

        int[] arr = new int[5];
        ClassLoader arrayClassLoader = arr.getClass().getClassLoader();
        System.out.println(arrayClassLoader);

        ClassLoader classLoader1 = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader1);

        ClassLoaderTest[] array = new ClassLoaderTest[5];
        ClassLoader classLoader2 = array.getClass().getClassLoader();
        System.out.println(classLoader2);
    }
}
