package study.liststudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/6 10:44
 * todo： List接口是Collection接口的子接口
 *  1.List集合中元素有序(即添加顺序和取出顺序一致)、且可重复
 *  2.List集合中的每个元素都有其对应的顺序索引，即支持索引
 *  3.List容器中的元素都对应一个整数型的序号记载其在容器中的位置，可以根据序号取出容器中的元素
 *  4.List接口的常见实现类有：ArrayList、LinkedList、Vector等
 *
 * todo:List三种遍历方式
 *      Ⅰ.Iterator迭代器
 *      Ⅱ.foreach循环  ---即增强for循环
 *      Ⅲ.使用普通for循环
 */
public class ListStudy {
    public static void main(String[] args) {
        //List集合中元素有序(即添加顺序和取出顺序一致)、且可重复
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("rookie");
        list.add("tom");
        System.out.println(list);
        //List集合中的每个元素都有其对应的顺序索引，即支持索引
        //索引从 0 开始
        System.out.println(list.get(3));
        System.out.println("=========使用Iterator迭代器遍历List集合==========");
        //1.Iterator迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        //2.foreach循环  ---即增强for循环
        System.out.println("=========使用foreach循环遍历List集合==========");
        for (Object o : list) {
            System.out.println(o);
        }
        //3.使用普通for循环
        System.out.println("=========使用普通for循环遍历List集合==========");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
