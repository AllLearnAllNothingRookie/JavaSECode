package study.collectionstudy.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/6 10:35
 * 练习： 创建Dog对象放入集合使用两种方式遍历
 */
public class CollectionExercise {
    public static void main(String[] args) {
        Collection<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("旺财",3));
        dogs.add(new Dog("小黄",2));
        dogs.add(new Dog("二狗子",2));
        dogs.add(new Dog("进宝",3));
        //遍历
        Iterator<Dog> iterator = dogs.iterator();
        while (iterator.hasNext()) {
            Dog dog = iterator.next();
            System.out.println(dog);
        }
        System.out.println("--------------------");
        //foreach遍历
        for (Dog dog :dogs) {
            System.out.println(dog);
        }


    }
}
