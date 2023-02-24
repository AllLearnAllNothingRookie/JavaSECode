package study.reflection.getclassmsg;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 15:07
 */
public class FiledInfoTest {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        Field[] declaredFields = stringClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            int mod = declaredField.getModifiers();
            Class<?> type = declaredField.getType();
            String name = declaredField.getName();
            System.out.println(Modifier.toString(mod ) + "\t");
            System.out.println(type.getName() + "\t" + name);

        }
    }
}
