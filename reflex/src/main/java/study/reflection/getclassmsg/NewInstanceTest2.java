package study.reflection.getclassmsg;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 16:25
 */
public class NewInstanceTest2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("study.reflection.getclassmsg.Student");
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class);
        Object alan = constructor.newInstance("alan");
        System.out.println(alan);
    }
}
