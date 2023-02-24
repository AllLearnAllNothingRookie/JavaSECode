package study.liststudy.arryliststudy;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/7 16:23
 * todo:ArrayList
 *  1.ArrayList可以加入null，并且可以多个
 *  2.ArrayList是由数组来实现数组存储的
 *  3.ArrayList基本等同同于Vector，除了ArrayList是线程不安全的(执行效率高)，在多线程的情况下
 *    不建议使用ArrayList
 *   transient：表示瞬间，短暂，属性使用该修饰符修饰则表示该属性不会被序列化
 * todo:ArrayList底层分析
 *  1.ArrayList种维护了一个Object类型的数组elementData
 *      transient Object[] elementData;
 *  2.当创建ArrayList对象时，如果使用的是无参构造器，则初始elementData容量为0，第一次
 *    添加，则扩容elementData为10，如果需要再次扩容，则扩容elementData为1.5倍
 *  3.如果使用的是指定大小的构造器，则初始化elementData的容量为指定大小，如果需要扩容，则直接
 *      扩容elementData为1.5倍
 *

 */
public class ArrayListStudy {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(8);
        //ArrayList可以加入null，并且可以多个
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list);

        ArrayList arrayList = new ArrayList();
       // ArrayList arrayList = new ArrayList(8);
        for (int i = 1;i <= 10;i ++){
            arrayList.add(i);
        }
        for (int i = 11;i <= 15;i ++){
            arrayList.add(i);
        }
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(null);
        for (Object o : arrayList) {
            System.out.println(o);
        }
    }
}
