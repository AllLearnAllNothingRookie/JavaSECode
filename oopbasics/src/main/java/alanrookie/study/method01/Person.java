package alanrookie.study.method01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/27 21:55
 */
public class Person {
    /**
     * 姓名
     */
    String name;
    /**
     * 年龄
     */
    int age;

    /**
     * 输入一句话
     *  1.public ：表示方法时公开的
     *  2.void ： 表示方法没有返回值
     *  3.speak() ：speak 方法名 () 形参列表 表示没有形参
     *  4.{} ：方法体，大括号内可以写相关的功能
     *  todo:  方法的使用：
     *      1. 方法写好后不去调用(使用)，没有任何输出
     *      2. 使用方法： 对象.方法名(参数列表)  类.静态方法名(参数列表)
     *         Person person = new Person();  //创建对象
     *         person.speak();  // 调用方法
     */
    public void speak(){
        System.out.println("我是一个好人");
    }

    /**
     * 计算1-1000的和
     *   1. public
     *   2.
     * @return
     */
    public int cal01(){
        int sum = 0;
        for (int i = 0;i <= 1000;i ++){
            sum += i;
        }
        return sum;
    }

    /**
     * 计算 1- n的和
     *
     *    todo:  (int n)：形参列表，表示当前有一个形参n，可以接收用户输入
     *             person.cal02(10); //表示调用方法，并传入参数 10
     * @param n
     * @return
     */
    public int cal02(int n){
        int num = 0;
        for (int i = 0; i <= n;i ++){
            num += i;
        }
        return num;
    }

    /**
     * 计算两个数的和
     *
     *      1.public ：表示方法时公开的
     *     2.int  ： 表示方法指向后返回一个int数据
     *     3.geuSum(int num1,int num2)：geuSum方法名
     *              (int num1,int num2)形参列表 表示有两个形参
     *     4.{} ：方法体，大括号内可以写相关的功能
     *     5.return num1 + num2; 表示返回num1 + num2的值
     *     调用getSum方法，同时 num1 = 5 num2 = 10
     *     把 方法的返回值赋值给sum
     *     int sum = person.geuSum(5, 10); 调用方法并接收返回值
     *     person.geuSum(5, 10); 调用方法不接收返回值
     * @param num1
     * @param num2
     * @return
     */
    public int geuSum(int num1,int num2){
        return num1 + num2;
    }
}
