package study.setstudy.hashsetstudy;

import java.util.HashSet;


/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/8 22:12
 * todo：HashSet
 *      1.HashSet实现了Set接口
 *      2.HashSet的底层为HashMap
 *      3.HashSet可以存放null值，但是只能有一个
 *      4.HashSet不保证元素是有序的，取决于hash后，在确定索引的位置(即不保证元素存放顺序
 *        和取出顺序一致)
 *      5.HashSet不能有重复的元素/对象
 * todo:HashSet底层
 *      1.HashSet底层是HashMap
 *      2.添加一个元素是，会得到这个元素的hash值，并通过一定的算法将其转换为索引值
 *      3.找到存储数据表table，查看这个索引出是否已经存放有元素
 *      4.如果没有则直接加入
 *      5.如果存有元素，则调用equals比较，如果相同则放弃添加，如果不相同则，添加到后面
 *      6.在java8中，如一个链表的元素个数超过 TREEIFY_THRESHOLD(默认为8)并且table的大小 >=
 *        MIN_TREEIFY_CAPACITY(默认64)就会进行树化(转换为红黑树)
 */
public class HashSetStudy {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        //HashSet可以存放null，但是只能有一个
        set.add(null);
        set.add(null);
        System.out.println(set);

        HashSet hashSet = new HashSet();
        //在实现add方法后会返回boolean值，添加成功返回true，添加失败(Set里已经存在要添加的元素
        // )返回为false
        System.out.println(hashSet.add("john"));
        System.out.println(hashSet.add("lucy"));
        System.out.println(hashSet.add("john"));
        System.out.println(hashSet.add("jack"));
        System.out.println(hashSet.add("Rose"));
        //指定删除对象
        hashSet.remove("john");
        System.out.println(hashSet);
        //todo:HashSet不能有重复的元素/对象
        hashSet = new HashSet();
        hashSet.add("lucy");
        hashSet.add("lucy");
        hashSet.add(new Dog("tom"));
        hashSet.add(new Dog("tom"));
        System.out.println(hashSet);

        hashSet.add(new String("rookie"));
        hashSet.add(new String("rookie"));
        System.out.println(hashSet);
    }
}
