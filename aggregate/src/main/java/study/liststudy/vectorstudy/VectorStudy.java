package study.liststudy.vectorstudy;

import java.util.Vector;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/8 20:27
 *todo: Vector
 *  1.Vector底层也是一个对象数组， protected Object[] elementData;
 *  2.Vector是线程同步的，即线程安全，Vector了哦的操作方法带有synchronized
 *  3.在开发中，需要线程同步安全时，可以考虑使用Vector
 *  4.创建Vector时，如果使用的是无参构造器，默认容量为10，扩容按照2倍进行扩容
 *      如果使用的时有参构造器，则大小为指定的大小，扩容按照2倍进行扩容
 */
public class VectorStudy {
    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int i = 0;i < 10;i ++){
            vector.add(i);
        }
    }
}
