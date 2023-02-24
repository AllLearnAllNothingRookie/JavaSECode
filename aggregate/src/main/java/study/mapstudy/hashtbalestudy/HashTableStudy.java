package study.mapstudy.hashtbalestudy;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/11 14:26
 * todo: HashTable介绍
 *   1.存放的元素是键值对: 即 key-value
 *   2.HashTable的键和值不能为null,否则会抛出NullPointerException
 *   3.HashTable的使用方法基本上和HashMap一样
 *   4.HashTable是线程安全的，HashMap是线程不安全的
 *todo：Hashtable的底层
 *      1. 底层有数组 Hashtable$Entry[] 初始化大小为 11
 *      2. 临界值 threshold 8 = 11 * 0.75
 *      3. 执行 方法 addEntry(hash, key, value, index); 添加K-V 封装到Entry
 *      4. 当 if (count >= threshold) 满足时，就进行扩容
 *        按照 int newCapacity = (oldCapacity << 1) + 1; 的大小扩容.
 */
public class HashTableStudy {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("john",100);
        hashtable.put("tom",98);
        //java.lang.NullPointerException
       // hashtable.put(null,100);
        hashtable.put("lucy",80);
        //java.lang.NullPointerException
       // hashtable.put("lic",null);
        //替换
        hashtable.put("tom",90);
        System.out.println(hashtable);
        //简单说明一下Hashtable的底层
        //1. 底层有数组 Hashtable$Entry[] 初始化大小为 11
        //2. 临界值 threshold 8 = 11 * 0.75
        //4. 执行 方法 addEntry(hash, key, value, index); 添加K-V 封装到Entry
        //5. 当 if (count >= threshold) 满足时，就进行扩容
        //5. 按照 int newCapacity = (oldCapacity << 1) + 1; 的大小扩容.
    }
}
