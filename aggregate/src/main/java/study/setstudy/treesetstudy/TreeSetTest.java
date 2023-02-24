package study.setstudy.treesetstudy;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/17 11:00
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        //String实现了java.lang.Comparable
        set.add("tom");
        set.add("john");
        set.add("smith");
        set.add("jerry");
        set.add("jack");
        set.add("lucy");
        System.out.println("元素个数:" + set.size());
        for (Object o : set) {
            System.out.println(o);
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Student(1,"tom"));
        treeSet.add(new Student(2,"smith"));
        treeSet.add(new Student(5,"lucy"));
        treeSet.add(new Student(4,"john"));
        treeSet.add(new Student(5,"jerry"));
        System.out.println("元素个数:" + treeSet.size());
        for (Object o : treeSet) {
            System.out.println(o);
        }

        TreeSet tree = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Teacher t1 = (Teacher) o1;
                Teacher t2 = (Teacher) o2;
                return t1.getId() - t2.getId();
            }
        });
        tree.add(new Teacher(3,"张三"));
        tree.add(new Teacher(4,"李四"));
        tree.add(new Teacher(2,"王五"));
        tree.add(new Teacher(3,"赵六"));
        System.out.println("元素个数：" + tree.size());
        Iterator iterator = tree.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
