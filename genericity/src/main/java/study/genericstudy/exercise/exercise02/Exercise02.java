package study.genericstudy.exercise.exercise02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/19 14:29
 */
public class Exercise02 {
    public static void main(String[] args) {

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee("tom",5555,new MyDate(1998,03,26)));
        arrayList.add(new Employee("jack",6890,new MyDate(1999,02,13)));
        arrayList.add(new Employee("tom",6788,new MyDate(1998,01,11)));
        //姓名自然排序，如果相同则年龄从小到大
        arrayList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName().compareTo(o2.getName()) > 0){
                    return  1;
                }else if (o1.getName().compareTo(o2.getName()) < 0){
                    return -1;
                }else {
                    return o1.getBirthday().compareTo(o2.getBirthday());
                }
            }
        });
        for (Employee employee : arrayList) {
            System.out.println(employee);
        }
    }
}
