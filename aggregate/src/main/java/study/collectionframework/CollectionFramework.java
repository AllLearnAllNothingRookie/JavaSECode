package study.collectionframework;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/5 21:41
 * todo: 集合框架
 *      1.集合主要分两类(单例集合(Collection)、双列集合(Map))
 *       Collection接口有两个重要的子接口，List和Set。它们的实现子类都是单例集合
 *       Map接口的实现子类是双列集合，存放的是 K-V 键值对
 *
 * todo:开发中如何选择集合类
 *    在开发中选择什么集合实现类，主要取决于业务操作特点，然后根据集合实现类特性进行选择
 *    1.先判断存储的类型(一组对象[单列]或一组键值对[双列])
 *    2.一组对象[单列]: Collection接口
 *       允许重复:List接口
 *          增删多：LinkedList(底层维护了一个双向链表)
 *          改查多：ArrayList(底层维护了Object类型的可变数组)
 *       不允许重复: Set接口
 *          无序：HashSet(底层是HashMap，维护了一个哈希表即(数组 + 链表 + 红黑树))
 *          排序：TreeSet
 *          插入和取出的顺序一致： LinkedHashSet，维护数组 + 双向链表
 *     3.一组键值对: Map接口
 *          键无序: HashMap(底层是哈希表，JDK7：数组 + 链表 JDK8：数组 + 链表 + 红黑树)
 *          键排序： TreeMap
 *          键插入和取出顺序一致：LinkedHashMap (双向链表)
 *          读取文件： Properties
 *    TreeSet和TreeMap由用户通过Comparator接口的实现类提供比较的方式，而不睡根据
 *    哈希值和equals来判断插入的元素是否相等。
 */
public class CollectionFramework {
}
