package study.reflection.getclassmsg;

import java.lang.reflect.Field;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 17:01
 */
public class FieldTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class<?> cls = Class.forName("study.reflection.getclassmsg.Chinese");
        Object o = cls.newInstance();
        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"张三");
        Object o1 = name.get(o);
        System.out.println(o1);

        Field conutry = cls.getDeclaredField("conutry");
        conutry.setAccessible(true);
        conutry.set(null,"中国");
        Object o2 = conutry.get(o);
        System.out.println(o2);
    }
}
