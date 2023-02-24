package study.setstudy.linkedhashsetstudy;

import java.util.LinkedHashSet;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/9 15:30
 * todo:LinkedHashSet说明
 *   1.LinkedHashSet是HashSet的子类
 *   2.LinkedHashSet的底层是LinkedHashMap，底层维护了一个数组 + 双向链表
 *   3.LinkedHashSet根据元素的HashCode值来决定元素的存储，同时使用链表维护元素的次序，
 *     这使得元素看起来是以插入顺序保存的。
 *   4.LinkedHashSet不允许添加重复元素
 * todo:LinkedHashSet底层说明:
 *    1.在LinkedHashSet中维护了一个hash表和双向链表(LinkedHashSet有head和tail)
 *    2.每一个节点有pre和next属性，这样可以形成双向链表
 *    3.在添加一个元素时，先求hash值，在求索引，确定该元素在hashtable的位置，然后将元素添加
 *      到双向链表(如果已经存在则不添加，规则和HashSet一样)
 *   4.遍历LinkedHashSet也能确保插入顺序和遍历顺序一致
 */
public class LinkedHashSetStudy {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add("456");
        set.add("456");
        set.add("rookie");
        set.add("tom");
        set.add("AA");
        set.add(new A(1));
        set.add(new A(2));
        set.add("BB");
        set.add(new A(3));
        set.add("Cc");
        System.out.println(set);
    }
}
