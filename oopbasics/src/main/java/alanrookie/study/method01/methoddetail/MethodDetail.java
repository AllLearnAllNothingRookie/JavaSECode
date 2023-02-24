package alanrookie.study.method01.methoddetail;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/27 22:52
 * 方法细节
 */
public class MethodDetail {
    /**
     * 1，方法可以有四种访问修饰符，用于控制方法的使用范围
     *   如果不写表示默认[缺省]
     *  四种访问修饰符 ：public 、protected、认[缺省、default]、private
     */
    /**
     * 2.一个方法最多有一个返回值,返回多个数据可以用数组或集合
     */
    public int[] getSumAndSub(int num1,int num2){
        int [] arr = new int[2];
        arr[0] = num1 + num2;
        arr[1] = num1 - num2;
        return arr;
    }
    /**
     * 3.方法返回类型可以是任意类型，包含基本类型和引用类型[数组、对象、……]
     */
    /**
     * 4.如果方法要求有返回数据类型，则方法中最后的执行语句必须为 return 返货值;
     *   而且要求返回值类型必须和return的值一致或兼容(自动类型转换)
     */
    public double fun(){
        double d1 = 100.1;
        int n1 = 100;
        //  返回的值可以兼容(自动类型转换)  int -> double
        // return 1;
        // 返回变量
       // return n1;
       // return d1;
        return 1.0;
    }
    /**
     * 5.如果方法返回类型为void，则方法体中可以没有return 语句，或者写为 return ;
     */
    public void  fun01(){
        // 1.没有返回值
        // 2. 单独一个return
        return;
    }
    /**
     * 6.方法名遵循驼峰命名法，最好见名知意，表达出该方法的功能即可
     */
    // 形参列表细节
    /**
     * 1.一个方法可以有0个参数，也可以有多个参数，中间用逗号隔开
     */
    public void method01(){

    }
    public void method02(int i,int j){

    }
    /**
     * 2.参数的类型可以为任意类型，包含基本类型和引用类型
     */
    public void method02(int i,int[] array){

    }
    /**
     * 3.调用带参的方法时，一定要对应着参数列表传入相同类型或兼容类型的参数
     */
    public void method(int i,double d){

    }
    /**
     * 4.方法定义时的参数称为形式参数简，称形参，方法调用时的参数称为实际参数，简称实参，实参和
     * 形参的类型要一致或兼容，个数、顺序必须一致
     */
    //方法体
    /**
     * 方法体里面写完成功能的具体语句，可以输入、输出、变量、运算、分支、循环、方法调用，但里面不能
     * 再定义方法，即：方法不能嵌套定义
     *
     */
    // 错误 方法不能嵌套定义
   /* public void method04(){
        public void method04(){

        }
    }*/

    // 方法调用细节
    /**
     * 1. 同一个类的方法调用：直接调用即可，不需要创建对象
     */
    public void method05(){
        //调用同一个类的方法 :直接通过方法名(参数类表)进行调用，不需要创建对象
        method(10,23);
    }
    /**
     * 2.跨类中的方法A类调用B类方法：需要通过对象名调用，如:对象名.方法名(参数)
     */
    public void method06(){
        //调用其他类的方法: 创建对象，通过对象名.方法名(参数列表)的方式进行调用
        Scanner input = new Scanner(System.in);
        input.nextInt();
    }
    /**
     * 特别说明，跨类的方法调用和方法的访问修饰符有关系
     */
    /**
     * 待补充……
     */
}
