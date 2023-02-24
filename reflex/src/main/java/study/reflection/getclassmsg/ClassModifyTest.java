package study.reflection.getclassmsg;

import java.lang.reflect.Modifier;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 14:41
 */
public class ClassModifyTest {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        int modifiers = stringClass.getModifiers();
        System.out.println(Modifier.toString(modifiers));
        System.out.println(Modifier.isPublic(modifiers));
    }
}
