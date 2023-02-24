package homework.homework02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/12 11:19
 * 使用ArrayList对car(name,price)进行各种操作
 */
public class Homework02 {
    public static void main(String[] args) {
        ArrayList cars = new ArrayList();
        Car bmw = new Car("宝马",400000);
        Car bl = new Car("宾利",5000000);
        cars.add(bmw);
        cars.add(bl);
        Iterator iterator = cars.iterator();
        while (iterator.hasNext()) {
            Object car = iterator.next();
            System.out.println(car);
        }
        System.out.println("====================");
        boolean remove = cars.remove(bl);
        System.out.println(remove);
        System.out.println("====================");
        System.out.println(cars.contains(bl));
        System.out.println("====================");
        System.out.println(cars.size());
        System.out.println("====================");
        System.out.println(cars.isEmpty());
        System.out.println("====================");
        cars.clear();
        System.out.println(cars.isEmpty());
        System.out.println("====================");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Car("大众",45262));
        arrayList.add(new Car("奔驰",6785432));
        arrayList.add(new Car("保时捷",453632235));
        arrayList.add(new Car("劳斯莱斯",856533));
        cars.addAll(arrayList);
        cars.add(new Car("五菱宏光",23412));
        cars.add(new Car("比亚迪",567473));
        cars.add(new Car("马自达",453525));
        for (Object car : cars) {
            System.out.println(car);
        }
        System.out.println("====================");
        System.out.println(cars.containsAll(arrayList));
        System.out.println("====================");
        cars.removeAll(arrayList);
        iterator = cars.iterator();
        while (iterator.hasNext()) {
            Object car = iterator.next();
            System.out.println(car);
        }
    }
}
