package study.genericstudy.exercise.exercise01;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/19 10:24
 * 创建3个学生对象，放入到HashSet中和HashMap中 key为name value为学生对象
 */
public class GenericExercise {
    public static void main(String[] args) {
        Student tom = new Student("tom", 22);
        Student jack = new Student("jack", 23);
        Student jerry = new Student("jerry", 31);
        HashSet<Student> students = new HashSet<>();
        students.add(tom);
        students.add(jack);
        students.add(jerry);
        System.out.println("==================1================");
        //使用foreach遍历
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("==================2================");
        //使用迭代器遍历
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }
        //存放到HashMap中
        HashMap<String,Student> map = new HashMap<>();
        map.put("tom",tom);
        map.put("jack",jack);
        map.put("jerry",jerry);
        System.out.println("==================3================");
        //遍历所有key
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + "-" +  map.get(key));
        }
        System.out.println("==================4================");
        Iterator<String> iterator1 = keySet.iterator();
        while (iterator1.hasNext()) {
            String key = iterator1.next();
            System.out.println(key + "-" +  map.get(key));
        }
        System.out.println("==================5================");
        //遍历所有value
        Collection<Student> values = map.values();
        for (Student value : values) {
            System.out.println(value);
        }
        System.out.println("==================6================");
        Iterator<Student> iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Student student =  iterator2.next();
            System.out.println(student);
        }
        System.out.println("==================7================");
        //遍历key-value键值对映射集
        Set<Map.Entry<String, Student>> entries = map.entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println("==================8================");
        Iterator<Map.Entry<String, Student>> iterator3 = entries.iterator();
        while (iterator3.hasNext()) {
            Map.Entry<String, Student> entry = iterator3.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
