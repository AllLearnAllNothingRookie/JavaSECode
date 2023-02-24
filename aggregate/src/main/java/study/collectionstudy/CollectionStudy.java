package study.collectionstudy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/5 21:48
 * todo:Collection接口实现类的特点
 *  public interface Collection<E> extends Iterable<E>
 *    1.Collection实现子类可以存放多个元素，每个元素可以是Object
 *    2.有些Collection的实现类，可以存放重复的元素，有些不可以
 *    3.有些Collection的实现类，有些是有序的(List)，有序不是有序的(Set)
 *    4.Collection接口没有直接的实现子类，是通过它的子接口Set和List来实现的
 *
 *todo:Collection遍历元素
 *  Ⅰ.Iterator迭代器
 *    1.Iterator对象称为迭代器，主要用于遍历Collection集合中的元素
 *    2.所有实现了Collection接口的集合类都有一个iterator()方法，用于返回一个实现了Iterator
 *     接口的对象，即可以返回一个迭代器
 *    3.Iterator仅用于遍历集合，Iterator本身并不存放对象
 *  Ⅱ.foreach循环  ---即增强for循环
 *     foreach循环可以替代Iterator迭代器。
 *     特点: foreach循环就是简化版的Iterator迭代器，本质一样。只能用于遍历集合或数组
 *   基本语法:
 *      for(集合/数组元素类型  元素名 : 集合名或数组名){
 *          访问元素
 *      }
 */
public class CollectionStudy {
    public static void main(String[] args) {
        //Collection接口的常用方法
        Collection col = new ArrayList();
        //add:添加单个元素
        col.add("rookie");
        //集合不能处理基本输数据类型，当存放基本数据类型时会自动装箱为包装类
        col.add(1);
        col.add(true);
        System.out.println(col);
        //remove:删除指定元素
        //指定删除元素
       col.remove(true);
        col.remove(1);
        System.out.println(col);
        // contains:查找指定元素是否存在
        System.out.println(col.contains(1));
        // size:获取元素个数
        System.out.println(col.size());
        //isEmpty:判断是否为空
        System.out.println(col.isEmpty());
        // clear:清空
        col.clear();
        System.out.println(col.isEmpty());
        // addAll:添加多个元素
        Collection list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add(10);
        list.add(true);
        col.addAll(list);
        System.out.println(col);
        col.add("java");
        col.add("C#");
        col.add("Golang");
        col.add("CPP");
        // containsAll:查找多个元素是否都存在
        System.out.println(col.containsAll(list));
        // removeAll:删除多个 元素
        col.removeAll(list);
        System.out.println(col);
        System.out.println("=======使用Iterator迭代器遍历Collection集合======");
        System.out.println("--------------遍历Collection集合-----------------");
        //返回一个Iterator对象--得到集合对应的迭代器
        Iterator iterator = col.iterator();
        // 调用next()方法之前必需调用hasNext()进行检测，若不调用且下一条记录无效时，
        //直接调用next()方法这回抛出NoSuchElementException异常
        //hasNext():判断是否还有下一个元素
        while (iterator.hasNext()){
            //next():将指针下移，同时将其指向的元素返回
            System.out.println(iterator.next());
        }
        //此时iterator指针已经移到了集合的末尾，如果此时调用next方法则指针继续下移
        // 这时没有集合元素即下一条记录无效则会抛出异常java.util.NoSuchElementException
        //System.out.println(iterator.next());
        // todo:快速生成迭代器循环 itit
        //      查看所有代码模板： ctrl + j
        //todo:如果需要再次遍历，需要重置迭代器
        //重置迭代器指针
        iterator = col.iterator();
        System.out.println("-----再次遍历集合----");
        while (iterator.hasNext()) {
            //多态
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("=======使用foreach循环遍历Collection集合=====");
        // todo:foreach循环快捷方式 I
        //使用foreach循环遍历集合
        for (Object o : col) {
            System.out.println(o);
        }
        //使用foreach循环遍历数组
        int [] arr = {1,2,3,4,5,6};
        for (int i : arr) {
            System.out.print(i + "\t");
        }

    }
}
