package alanrookie.study.metehodparameter;

import java.util.concurrent.BlockingDeque;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/30 21:13
 * 成员方法传参机制
 */
public class MethodParameter01 {
    /**
     * 基本类型传参机制
     * 结论: 对于基本类型，传递的是值(值拷贝)，形参的任何改变不影响实参
     */
    public void swap(int a,int b){
        System.out.println("方法内：");
        System.out.println("交换前\na = " + a + "\tb = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("交换后\na = " + a + "\tb = " + b);
    }
    /**
     * 引用类型传参机制:
     * 结论: 引用类型传递的是地址(传递的也是值，但是值是地址)，可以通过形参影响实参
     */
    public void changeArray(int [] array){
        //修改数组中的第一个元素
        array[0] = 200;
        System.out.println("方法中遍历数组:");
        for (int i = 0;i < array.length;i ++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    /**
     * 修改年龄
     * @param person
     */
    public void changeAge(Person person){
        person.age = 20;
        System.out.println("changeAge " + person.age);
    }

    /**
     * 把方法里的person对象重新指向了一个新的空间，修改后不会影响main方法的值
     * @param person
     */
    public void  resetPerson(Person person){
         // 将方法力的person对象指向null，不会影响到main方法的person的值
        person = null;
        //把方法里的person对象重新指向了一个新的空间，修改后不会影响main方法的值
        person = new Person();
        person.name = " tom";
        person.age = 10;
        System.out.println("changeAge " + person.age);
    }
}
