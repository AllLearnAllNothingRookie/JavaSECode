package study.liststudy.exercise.exercise01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/6 13:43
 * 插入十个以上的元素，在2号位插入一个值，获取第5个元素，删除第六个元素，修改第7个元素，使用迭代器遍历
 */
public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add(2);
        list.add(true);
        list.add("你好");
        list.add("哈哈");
        list.add("world");
        list.add("tom");
        list.add("jack");
        list.add("rookie");
        list.add("alan");
        list.add(1,"text");
        Object o = list.get(4);
        System.out.println(o);
        Object remove = list.remove(5);
        System.out.println(remove);
        list.set(6,"张三");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}
