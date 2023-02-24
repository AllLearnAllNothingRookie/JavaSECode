package study.reflection.getclassmsg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 17:17
 */
public class MethodTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> cls = Class.forName("java.time.LocalDate");

        Method now = cls.getDeclaredMethod("now");
        //静态方法不需要示例对象
        Object date1 = now.invoke(null);
        System.out.println("date1 = " + date1);

        Method whitYear = cls.getDeclaredMethod("withYear", int.class);
        //非静态方法需要实例对象
        Object date2 = whitYear.invoke(date1, 2022);
        System.out.println("date2" + date2);

        Method getYear = cls.getDeclaredMethod("getYear");
        //非静态方法需要实例对象
        Object year = getYear.invoke(date2);
        System.out.println("year = " + year);

    }
}