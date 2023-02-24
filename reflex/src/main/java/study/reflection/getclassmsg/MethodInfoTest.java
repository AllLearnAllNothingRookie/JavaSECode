package study.reflection.getclassmsg;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 15:40
 */
public class MethodInfoTest {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        Method[] methods = stringClass.getMethods();
        for (Method method : methods) {
            int mod = method.getModifiers();
            Class<?> returnType = method.getReturnType();
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            System.out.print(Modifier.toString(mod) + "\t" +  returnType + "\t" + name + "(");
            System.out.println(Arrays.toString(parameterTypes) + ")");
        }
    }
}
