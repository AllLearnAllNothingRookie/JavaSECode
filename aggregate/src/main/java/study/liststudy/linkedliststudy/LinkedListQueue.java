package study.liststudy.linkedliststudy;

import java.util.LinkedList;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/16 11:02
 */
public class LinkedListQueue {
    public static void main(String[] args) {
        LinkedList queue = new LinkedList();
        //入队
        queue.add(1);
        queue.add(2);
        queue.add(3);
        //出队，FIFO(先进先出)
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        //队列空了，返回null
        System.out.println(queue.pollFirst());
    }
}
