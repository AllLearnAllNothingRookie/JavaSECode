package study.reflection.getclassmsg;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 15:57
 */
public class AnnotationTest {
    public static void main(String[] args) {
        Class<MyClass> myClass = MyClass.class;
        MyAnnotation annotation = myClass.getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());
    }
}
