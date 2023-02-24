package study.mapstudy.hashmapstudy;

import java.util.HashMap;

/**
 * @author 韩顺平
 * @version 1.0
 * todo: HashMap底层
 *   1.HashMap底层维护了Node类型的数组table，默认为null
 *   2.当创建对象时，将加载因子DEFAULT_LOAD_FACTOR初始化为0.75
 *   3.当添加key-value时，通过key的hash值得到在table的索引。然后判断该索引出是否有元素，如
 *     没有元素则直接添加。如果该索引处有元素，继续判断该索引处元素的key和准备加入的key是否
 *     相等，如果相等则通过equals判断要添加的元素是否相等，如果相等则替换value，如果不相等
 *     则需要判断是树结构还是链表结构，做出相应处理，如果添加是发现容量不够，则需要扩容
 *   4.第一次添加，则需扩容table容量为16，临界值(threshold)为12，DEFAULT_INITIAL_CAPACITY
 *     * DEFAULT_LOAD_FACTOR 16 * 0.75
 *   5. 以后在扩容，则需扩容table容量为原来容量的2倍，临界值为 2 * DEFAULT_INITIAL_CAPACITY *
 *      DEFAULT_LOAD_FACTOR
 *   6.在Java8中，如果一条链表的元素个数超过REEIFY_THRESHOLD(默认为8)并且table的大小
 *     >= MIN_TREEIFY_CAPACITY(默认64)，就会进行树化(红黑树)
 */
@SuppressWarnings({"all"})
public class HashMapSource1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("java", 10);//ok
        map.put("php", 10);//ok
        map.put("java", 20);//替换value

        System.out.println("map=" + map);//

        /*老韩解读HashMap的源码+图解
        1. 执行构造器 new HashMap()
           初始化加载因子 loadfactor = 0.75
           HashMap$Node[] table = null
        2. 执行put 调用 hash方法，计算 key的 hash值 (h = key.hashCode()) ^ (h >>> 16)
            public V put(K key, V value) {//K = "java" value = 10
                return putVal(hash(key), key, value, false, true);
            }
         3. 执行 putVal
         final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
                Node<K,V>[] tab; Node<K,V> p; int n, i;//辅助变量
                //如果底层的table 数组为null, 或者 length =0 , 就扩容到16
                if ((tab = table) == null || (n = tab.length) == 0)
                    n = (tab = resize()).length;
                //取出hash值对应的table的索引位置的Node, 如果为null, 就直接把加入的k-v
                //, 创建成一个 Node ,加入该位置即可
                if ((p = tab[i = (n - 1) & hash]) == null)
                    tab[i] = newNode(hash, key, value, null);
                else {
                    Node<K,V> e; K k;//辅助变量
                // 如果table的索引位置的key的hash相同和新的key的hash值相同，
                 // 并 满足(table现有的结点的key和准备添加的key是同一个对象  || equals返回真)
                 // 就认为不能加入新的k-v
                    // 当前索引处的元素与要添加的元素相同
                    if (p.hash == hash &&
                        ((k = p.key) == key || (key != null && key.equals(k))))
                        e = p;
                       // 当前索引处后连接的是红黑树，执行红黑树的添加逻辑
                    else if (p instanceof TreeNode)  的方式处理
                        e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                      //当前索引后连接的是链表执行链表的添加逻辑，并且判断是否树化(红黑树)
                    else {
                        //如果找到的结点，后面是链表，就循环比较
                        for (int binCount = 0; ; ++binCount) {//死循环
                            if ((e = p.next) == null) {//如果整个链表，没有和他相同,就加到该链表的最后
                                p.next = newNode(hash, key, value, null);
                                //加入后，判断当前链表的个数，是否已经到8个，到8个，后
                                //就调用 treeifyBin 方法进行红黑树的转换
                                if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                    treeifyBin(tab, hash);
                                break;
                            }
                            if (e.hash == hash && //如果在循环比较过程中，发现有相同,就break,就只是替换value
                                ((k = e.key) == key || (key != null && key.equals(k))))
                                break;
                            p = e;
                        }
                    }
                    if (e != null) { // existing mapping for key
                        V oldValue = e.value;
                        if (!onlyIfAbsent || oldValue == null)
                            e.value = value; //替换，key对应value
                        afterNodeAccess(e);
                        return oldValue;
                    }
                }
                ++modCount;//每增加一个Node ,就size++
                if (++size > threshold[12-24-48])//如size > 临界值，就扩容
                    resize();
                afterNodeInsertion(evict);
                return null;
            }

              5. 关于树化(转成红黑树)
              //如果table 为null ,或者大小还没有到 64，暂时不树化，而是进行扩容.
              //否则才会真正的树化 -> 剪枝
              final void treeifyBin(Node<K,V>[] tab, int hash) {
                int n, index; Node<K,V> e;
                if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
                    resize();

            }
         */


    }
}
