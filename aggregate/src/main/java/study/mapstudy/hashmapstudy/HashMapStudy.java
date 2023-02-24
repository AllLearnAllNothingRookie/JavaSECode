package study.mapstudy.hashmapstudy;

import java.util.HashMap;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/9 22:07
 * todo:
 *  1. Map接口的常用实现类: HashMap、HashTable和Properties
 *  2. HashMap是Map接口使用频率最高的实现类
 *  3. HashMap是以key-value对的方式来存储数据
 *  4. HashMap种Key不能重复，但是值可以重复，允许使用null键和null值，只能有一个null键
 *    可以有多个null值，因为键不重复
 *  5. 如果添加相同的key，则会覆盖原来的key-value，等同于修改(key不会替换，value会替换)
 *  6. 与HashSet一样，HashMap不保证映射的顺序，因为底层是以hash表的方式存储的(
 *     JDK8的HashMap底层为 数组 + 链表 + 红黑树)
 *  7. HashMap没有实现同步，因此是线程不安全的
 */
public class HashMapStudy {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("001","tom");
        hashMap.put("002","jack");
        hashMap.put("003","john");
        hashMap.put("004","smith");
        hashMap.put("001","jerry");
        hashMap.put(null,null);
        hashMap.put(null,"jerry");
        hashMap.put("005",null);
        hashMap.put("007",null);
        System.out.println(hashMap);
    }
}
