package study.liststudy.linkedliststudy;

import java.util.LinkedList;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/8 20:41
 * todo:LinkedList底层
 *  1. LinkedList底层维护了一个双向链表
 *  2. LinkedList种维护了两个属性的first和last分别指向首节点和尾节点
 *  3. 每个节点(Node对象)，里面有维护了prev，next，item三个属性，其中通过prev指向前一个
 *     节点，通过next指向后一个节点。最终实现双向链表
 *  4.LinkedList的元素添加和删除，不是通过数组完成的，相对来说效率比较高
 */
public class LinkedListStudy {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
