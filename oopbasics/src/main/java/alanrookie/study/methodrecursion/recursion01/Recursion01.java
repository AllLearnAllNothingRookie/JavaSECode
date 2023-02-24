package alanrookie.study.methodrecursion.recursion01;

import jdk.nashorn.internal.ir.annotations.Ignore;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/31 21:22
 */
public class Recursion01 {
    public static void main(String[] args) {
        Recursion01 recursion01 = new Recursion01();
        recursion01.test(4);
        int factorial = recursion01.factorial(5);
        System.out.println(factorial );
    }

    /**
     * 递归的重要规则:
     *  1.执行一个方法时，就创建一个新的受保护的独立空间(栈空间)
     *  2.方法的局部变量是独立的，不会互相影响
     *  3.如果方法中使用的是引用类型的变量(如数组)、就会共享该引用类型的数据
     *  4.递归必须向退出的条件逼近，否则就是无限递归，出现栈溢出(StackOverflowError)
     *  5.当一个方法执行完毕，或遇到return，就会返回，遵守谁调用，就将结果返回给谁,同时
     *      当方法执行完毕或者返回时，该方法也就执行完毕。
     *
     */
    public void test(int n){
        if (n > 2){
            test(n -1);
        }
        System.out.println(n);
    }
    public int factorial(int n){
        if (n == 1){
            return 1;
        }else {
            return factorial(n - 1) * n;
        }
    }
}
