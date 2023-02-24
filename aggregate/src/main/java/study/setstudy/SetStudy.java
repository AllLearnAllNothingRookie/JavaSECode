package study.setstudy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/8 21:57
 * todo:Set接口介绍:
 *    1.无序(添加和取出的顺序不一样)，没有索引
 *    2.不允许添加重复元素
 *   常用方法和List接口一样，Set接口也是Collection的子接口，因此，常用方法和Collection接口一样
 *  Set接口遍历方式:
 *    1.迭代器
 *    2.增强for循环
 *
 */
public class SetStudy {
    public static void main(String[] args) {
        //Set接口不能存放重复的对象，存放数据是无序的(即添加顺序和取出顺序是不一致的)
        //注意：取出的顺序不是添加的顺序，但是是固定的
        Set set = new HashSet();
        set.add("john");
        set.add("luck");
        set.add("john");
        set.add("jack");
        set.add(null);
        set.add(null);
        System.out.println(set);
        //Set的遍历 1.使用迭代器
        System.out.println("=======使用迭代器遍历======");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        //Set的遍历 2.使用增强for循环
        System.out.println("=======使用增强for循环遍历======");
        for (Object o :set) {
            System.out.println(o);
        }
        //Set接口对象不能通过索引获取
    }
}
