package study.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/11 16:26
 * todo：Collections工具类
 *  1.Collections是一个操作Set、List和Map等集合的工具类
 *  2.Collections中提供了一系列的静态方法对集合元素进行排序、查询和修改等操作
 *todo：Collections常用方法
 *   1.reverse(List):反转List中的元素顺序
 *   2.shuffle(List):对List集合元素进行随机排序
 *   3.sort(List):根据元素的自然顺序对指定List集合元素进行升序排序
 *   4.sort(List,Comparator):根据指定的Comparator产生的顺序对Liat集合元素进行排序
 *   5.swap(List,int,int):将指定List集合中的i处元素和j处元素进行交换
 *   6.Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
 *   7.Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
 *   8.Object min(Collection):根据元素的自然顺序，返回给定集合中的最小元素
 *   9.Object min(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最小元素
 *   10.int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
 *   11.void copy(List dest,List src)：将src中的内容复制到dest中
 *   12.boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值
 */
public class CollectionsStudy {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan·jerry");
        //reverse(List):反转List中的元素顺序
        Collections.reverse(list);
        System.out.println(list);
        //shuffle(List):对List集合元素进行随机排序
        Collections.shuffle(list);
        System.out.println(list);
        //sort(List):根据元素的自然顺序对指定List集合元素进行升序排序
        Collections.sort(list);
        System.out.println(list);
        //sort(List,Comparator):根据指定的Comparator产生的顺序对Liat集合元素进行排序
        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println(list);
        //swap(List,int,int):将指定List集合中的i处元素和j处元素进行交换
        Collections.swap(list,2,3);
        System.out.println(list);

         //Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
        System.out.println(Collections.max(list));
        //Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
        System.out.println(Collections.max(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        }));
        //Object min(Collection)：根据元素的自然顺序，返回给定集合中的最小元素
        System.out.println(Collections.min(list));
        //Object min(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最小元素
        System.out.println(Collections.min(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        }));
        //int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
        System.out.println(Collections.frequency(list, "tom"));
        //void copy(List dest,List src)：将src中的内容复制到dest中
        List dest = new ArrayList();
        //todo:要完成拷贝必需两个集合的size要一样大或目标集合的size大于源集合的size(集合.size)
        //    否则会报下标越界异常java.lang.IndexOutOfBoundsException: Source does not fit in dest
        for (int i = 0;i < list.size();i ++){
            dest.add("");
        }
        Collections.copy(dest,list);
        System.out.println(dest);
        //boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值
        Collections.replaceAll(list,"tom","汤姆");
        System.out.println(list);
    }
}
