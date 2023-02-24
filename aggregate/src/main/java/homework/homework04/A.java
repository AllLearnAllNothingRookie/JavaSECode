package homework.homework04;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;


/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/12 14:24
 * todo:HashSet和TreeSet实现去重的区别
 *   1.HashSet的去重机制：通过 hashCode() + equals(),底层先通过存入对象的hashCode()方法
 *     得到一个哈希值，通过哈希值达到对应存储位置的索引，如果table数组中索引位置处没有元素则
 *     直接存入，如果table数组中存在运算则与存在的元素进行equals比较(遍历比较)，如给有相同的
 *     则不插入，如果都没有相同的则插入
 *   2.TreeSet的去重机制:如果在构造器中传入了Comparator匿名对象，就使用实现compare方法
 *    进行去重，如果compare方法返回0则认为是相同的数据不加入，如果构造器中没有传入Comparator
 *    匿名实现类(即调用无参构造器)，则以添加对象实现的Comparable接口的compareTo方法去重
 *    如果compareTo返回的是0则认为是相同的数据不加入，如果使用无参构造器，添加元素时要求添加的
 *    元素没有实现Comparable接口，则会报错(java.lang.ClassCastException)，如果使用有参
 *    构造器(构造器中传入Comparator的匿名实现类)添加元素时
 *    不要求添加的元素实现Comparable接口
 *Todo:HashSet底层为HashMap，TreeSet底层为TreeMap
 *      HashMap的去重机制和HashSet一样，只不过当添加的元素相同时会进行value的替换
 *      TreeMap的去重机制和TreeSet一样，只不过当添加的元素相同时会进行value的替换
 */
public class A {
    public static void main(String[] args) {
        /**
         * todo:如果使用有参构造器(构造器中传入Comparator的匿名实现类)添加元素时
         *     不要求添加的元素实现Comparable接口
         *todo：使用有参构造器(构造器中传入Comparator的匿名实现类)添加没实现Comparable接口
         *      的元素不会报错
         */
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 1;
            }
        });
        set.add(new B());
        set.add(new B());
        System.out.println(set);
        /**
         * todo:如果使用无参构造器(构造器中传没有入Comparator的匿名实现类)添加元素时
         *     要求添加的元素必需实现Comparable接口，否则会报错java.lang.ClassCastException
         *todo：使用无参构造器(构造器中传没有入Comparator的匿名实现类)添加没实现Comparable接口
         *      的元素会报错
         *  java.lang.ClassCastException: homework.homework04.B cannot be cast to java.lang.Comparable
         */
        //set = new TreeSet();
        //set.add(new B());
        //set.add(new B());
        //System.out.println(set);
        /**
         * todo: TreeMap的去重机制和TreeSet一样，只不过当添加的元素相同时会进行value的替换
         */
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 1;
            }
        });
        map.put(new B(),"1");
        map.put(new B(),"1");
        System.out.println(map);

        map = new TreeMap();
        /**
         * todo:
         *   java.lang.ClassCastException: homework.homework04.B cannot be cast to java.lang.Comparable
         */
        //map.put(new B(),"1");
        // map.put(new B(),"1");
        //System.out.println(map);
    }
}