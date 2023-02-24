package study.reflection.getclassmsg;

import java.util.Map;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 14:58
 */
public class InnerOuterClassTest {
    public static void main(String[] args) {
        Class<Map> mapClass = Map.class;
        Class<?>[] inners = mapClass.getDeclaredClasses();
        for (Class<?> inner : inners) {
            System.out.println(inner);
        }
        System.out.println("======================");
        Class<Map.Entry> entryClass = Map.Entry.class;
        Class<?> outer = entryClass.getDeclaringClass();
        System.out.println(outer);
    }
}
