package study.extraction;

import java.util.ArrayList;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/18 15:31
 * 引出泛型：
 *  请编写程序，在ArrayList中，添加3个Dog对象，
 *  Dog对象含有name和age
 * TODO:传统方法问题分析:
 *       1. 不能对加入集合ArrayList的数据做约束
 *       2. 遍历时，需要仅需类型转换，如果集合数据量大，对效率有影响
 *     泛型的好处:
 *       1.编译时，检查添加元素的类型，提高了安全性
 *       2，减少了类型转换的次数，提高了效率
 *
 */
public class ExtractionGeneric {
    public static void main(String[] args) {
        //使用传统的方法解决
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("小黄",2));
        arrayList.add(new Dog("旺财",3));
        arrayList.add(new Dog("小白",5));
        //放入其他对象 : 向下转型时会发生移除，编译器不能发现问题
        //arrayList.add(new Cat("布偶",4));
        //遍历
        for (Object o : arrayList) {
            //向下转型
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "-" + dog.getAge());
        }
        System.out.println("=============使用泛型==============");
        //使用泛型解决
        ArrayList<Dog> array = new ArrayList<>();
        array.add(new Dog("小黄",2));
        array.add(new Dog("旺财",3));
        array.add(new Dog("小白",5));
        //放入其他对象时就会报错--对于add(study.extraction.Cat), 找不到合适的方法
        //如果编译器发现添加的类型不满足要求则会报错
        //array.add(new Cat("布偶",4));
        //遍历 -- 遍历时能直接取出类型，无需进行转型
        for (Dog dog : array) {

            System.out.println(dog);
        }
    }
}
