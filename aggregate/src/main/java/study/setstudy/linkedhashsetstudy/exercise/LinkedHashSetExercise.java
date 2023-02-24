package study.setstudy.linkedhashsetstudy.exercise;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/9 16:25
 * Car类(属性name,price)，如果name和price一样，则认为是相同元素，不添加
 */
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥托",1000));
        linkedHashSet.add(new Car("奥迪",300000));
        linkedHashSet.add(new Car("法拉利",1000000));
        linkedHashSet.add(new Car("奥迪",300000));
        linkedHashSet.add(new Car("保时捷",7000000));
        linkedHashSet.add(new Car("奥迪",300000));
        linkedHashSet.add(new Car("奔驰",7000000));
        linkedHashSet.add(new Car("奥迪",7000000));
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}
