package alanrookie.study.metehodparameter;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/30 21:15
 */
public class MethodParameterTest {
    public static void main(String[] args) {
        MethodParameter01 parameter01 = new MethodParameter01();
        int a = 10;
        int b = 20;
        parameter01.swap(a,b);
        System.out.println("方法外:");
        // 输出  a = 10	 b = 20 发现a和b并没有交换
        System.out.println("a = " + a + "\tb = " + b);
        /**
         * 结论: 对于基本类型，传递的是值(值拷贝)，形参的任何改变不影响实参
         */
        int [] array = {1,2,3};
        parameter01.changeArray(array);
        System.out.println("main方法中遍历数组:");
        for (int i = 0;i < array.length;i ++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        /**
         * 结论: 引用类型传递的是地址(传递的也是值，但是值是地址)，可以通过形参影响实参
         */
        Person person = new Person();
        person.name = "李四";
        person.age = 7;
        System.out.println("main " + person.age);
        parameter01.changeAge(person);


        //将方法力的对象重新指向空间
        parameter01.resetPerson(person);
        System.out.println("main " + person.age);
    }
}
