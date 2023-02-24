package homework.homework05;

import java.util.HashSet;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/12 15:02
 */
public class Homework05 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p1 = new Person(1001,"AA");
        Person p2 = new Person(1002,"BB");
        set.add(p1);
        set.add(p2);
        System.out.println(set);
        /**
         * todo:重写了hahsCode方法属性的hash值与属性有关时，当属性值改变时对象的哈希值可能也会改变
         */
        p1.setName("CC");
        set.remove(p1);
        System.out.println(set);
        set.add(new Person(1001,"CC"));
        System.out.println(set);
        set.add(new Person(1001,"AA"));
        System.out.println(set);
    }
}
