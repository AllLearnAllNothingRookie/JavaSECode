package study.liststudy.linkedliststudy;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/16 21:58
 */
public class StackStudy {
    public static void main(String[] args) {
        Stack stack = new Stack();
        showPush(stack,42);
        showPush(stack,66);
        showPush(stack,99);
        showPop(stack);
        showPop(stack);
        showPop(stack);
        try {
            showPop(stack);
        }catch (EmptyStackException e){
            System.out.println("empty stack");
        }
    }

    /**
     * 添加新元素到栈，即把新元素压入栈，成为新的栈顶元素
     * @param st
     * @param value
     */
    static void showPush(Stack st,Object value){
        st.push(value);
        System.out.println("push(" + value + ")");
        //查看当前栈顶的元素
        System.out.println("现在栈顶的元素是：" + st.peek());
        System.out.println("现在栈中的元素有:" + st);
    }
    static void showPop(Stack st){
        System.out.println("pop -> " + st.pop());
        //查看当前栈顶元素
        System.out.println("现在栈顶元素：" + st.peek());
        System.out.println("现在栈中的元素有:" + st);
    }
}
