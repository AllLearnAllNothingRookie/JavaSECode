package study.classloaderstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 10:14
 */
public class FileClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException {
        FileClassLoader fsc = new FileClassLoader("D:\\code\\project\\JavaSECode\\reflex");
        Class<?> aClass = fsc.loadClass("study.reflection.classload.Dog");
        System.out.println(aClass);
        Class<?> aClass1 = fsc.loadClass("java.lang.String");
        System.out.println(aClass1);
        //null，因为委托给父类
        System.out.println(aClass1.getClassLoader());
    }
}
