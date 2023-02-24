package alanrookie.study.varparameterdetail;


/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/9 21:54
 * 可变参数细节
 *      1.可变参数的实参可以是0个或者任意多个
 *      2.可变参数的实参可以是数组
 *      3.可变参数的本质就是数组
 *      4.可变参数可以和普通类型的参数一起放在形参列表里，但是必须保证可变参数在最后
 *      5.一个形参列表中只能出现一个可变参数
 *      6.可变参数可以和数组类型的参数出现在同一个形参列表中，但是可以参数只能出现在最后
 */
public class VarParameterDetail {
   public void msg(int ... nums){
       for (int num : nums) {
           System.out.print(num + "\t");
       }
   }

    /**
     * 4.可变参数可以和普通类型的参数一起放在形参列表里，但是必须保证可变参数在最后
     */
    //正确
   public void func(int num1,double num2,double num3,int... nums){
       System.out.println(num1);
       System.out.println(num2);
       System.out.println(num3);
       for (int num : nums) {
           System.out.print(num + "\t");
       }
   }
   //错误
   /* public void func(int num1,double num2,double num3,int... nums,String s){
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(s);
        for (int num : nums) {
            System.out.print(num + "\t");
        }
    }*/
    /**
     * 5.一个形参列表中只能出现一个可变参数
     */
    //错误
   /* public void method(int ... ints,double ... dous){

    }*/

    /**
     * 6.可变参数可以和数组类型的参数出现在同一个形参列表中，但是可以参数只能出现在最后
     */
    public void method(int[] ints,double... dous){
        for (int anInt : ints) {
            System.out.print(anInt + "\t");
        }
        System.out.println();
        for (double v : dous) {
            System.out.print(v + "\t");
        }
    }
    //错误
   /* public void method(int[] ints,double... dous,int [] nums){

    }*/
}
