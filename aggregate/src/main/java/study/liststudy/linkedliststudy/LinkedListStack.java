package study.liststudy.linkedliststudy;

import java.util.LinkedList;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/16 10:51
 */
public class LinkedListStack {
    public static void main(String[] args) {
        LinkedList stack = new LinkedList();
        //入栈
        stack.addFirst(1);
        stack.addFirst(2);
        stack.addFirst(3);
        //出栈：LIFO(先进后出)
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        //栈空了，会报异常：java.util.NoSuchElementException
        System.out.println(stack.removeFirst());
        //弹出栈顶元素
        System.out.println(stack.peekFirst());
    }
}
