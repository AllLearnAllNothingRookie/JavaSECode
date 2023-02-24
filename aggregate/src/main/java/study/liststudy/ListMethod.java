package study.liststudy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/6 11:15
 * todo:List常见方法
 *  List集合中添加了一些根据索引来操作集合元素的方法
 */
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三");
        list.add("李四");
        //void add(int index,Object ele):在index位置插入ele元素
        list.add(1,"刘备");
        System.out.println(list);
        //boolean addAll(int index, Collection<? extends E> c):从index位置开始将c中所有元素添加进来
        List list1 = new ArrayList();
        list1.add("jack");
        list1.add("tom");
        list1.add("李四");
        list.addAll(1,list1);
        System.out.println(list);
        //Object get(int index):获取指定index位置的元素
        System.out.println(list.get(3));
        //int indexOf(Object obj):返货obj在集合中首次出现的位置
        System.out.println(list.indexOf("tom"));
        // int lastIndexOf(Object obj):返回obj在当前集合中最后一次出现的位置
        System.out.println(list.lastIndexOf("李四"));
        System.out.println(list);
        //Object remove(int index):移除指定index位置的元素，并返回该元素
        System.out.println(list.remove(3));
        System.out.println(list);
        //Object set(int index,Object ele):设置指定index位置的元素为ele，相当于替换，并返回被替换的元素
        System.out.println(list.set(4,"rookie"));
        System.out.println(list);
        //List<E> subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合
        // 返回子集合的范围[fromIndex,toIndex)
        Object subList = list.subList(1, 3);
        System.out.println(subList);
    }
}
