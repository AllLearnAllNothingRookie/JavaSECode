package study.reflection.getclassmsg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 15:17
 */
public class ConstructorInfoTest1 {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        Constructor<?>[] constructors = stringClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            int mod = constructor.getModifiers();
            String name = constructor.getName();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            System.out.print(Modifier.toString(mod) + "\t" + name + "(");
            System.out.println(Arrays.toString(parameterTypes) + ")");
        }
    }
}
