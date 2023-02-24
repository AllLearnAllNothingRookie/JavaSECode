package study.genericstudy.detail;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/19 13:46
 * todo:泛型细节
 *     1.interface List<E> public class HashSet<E>等 T和E只能是引用类型
 *     2.在指定泛型具体类型后，可以传入该类型或其子类型(继承或实现该类的类型)
 *     3.泛型的使用形式
 *        List<Integer> list = new ArrayList<Integer>();
 *        List<Integer> list = new ArrayList<>();
 *     4 List list = new ArrayList(); 默认泛型为Object
 *
 */
public class GenericDetail {
    public static void main(String[] args) {
        //todo:给泛型指定数据类型时，要求是引用类型不能是基本数据类型
        List<Integer> list = new ArrayList<>();
       // List<int> list2 = new ArrayList<>();

        //todo:2.在指定泛型具体类型后，可以传入该类型或其子类型(继承或实现该类的类型)
        //传入指的定泛型
        Pig<A> pig = new Pig<A>(new A());
        //传入指的定泛型的子类型
        Pig<A> pig1 = new Pig<A>(new B());

       //todo: 3.泛型的使用形式
       List<Integer> list3 = new ArrayList<Integer>();
       //简写：编译器会进行类型推断   推荐写法
       List<Integer> list4 = new ArrayList<>();

       //todo:如果对泛型类没有提供泛型对象，默认泛型为Object
        List list5 = new ArrayList();
        //等价于
        List<Object> list6 = new ArrayList<>();
    }
}
