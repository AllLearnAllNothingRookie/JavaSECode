package study.mapstudy.exercise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/9 21:31
 * 使用HashMap添加3个员工对象(属性：name、id、salary)，并遍历显示工资大于18000的员工
 */
public class MapExercise {
    public static void main(String[] args) {
        HashMap<String,Employee> hashMap = new HashMap<>();
        Employee employee1 = new Employee("10001","tom",19000);
        Employee employee2 = new Employee("10002","jerry",17500);
        Employee employee3 = new Employee("10003","smith",9500);
        Employee employee4 = new Employee("10004","rose",19600);
        Employee employee5 = new Employee("10005","john",29000);
        Employee employee6 = new Employee("10006","jack",39000);
        hashMap.put(employee1.getId(),employee1);
        hashMap.put(employee2.getId(),employee2);
        hashMap.put(employee3.getId(),employee3);
        hashMap.put(employee4.getId(),employee4);
        hashMap.put(employee5.getId(),employee5);
        hashMap.put(employee6.getId(),employee6);
        //循环输出
        Set<String> keys = hashMap.keySet();
        for (String key : keys) {
            Employee employee = hashMap.get(key);
            if (employee.getSalary() >= 18000){
                System.out.println(employee);
            }
        }
        System.out.println("========");
        Set<Map.Entry<String, Employee>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Employee>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Employee> entry = iterator.next();
            if (entry.getValue().getSalary() >= 18000){
                System.out.println(entry);
            }
        }
    }
}
