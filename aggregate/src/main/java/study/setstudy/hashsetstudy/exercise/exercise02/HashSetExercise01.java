package study.setstudy.hashsetstudy.exercise.exercise02;

import java.util.HashSet;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/9 15:25
 */
public class HashSetExercise01 {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee("rookie",13425,new MyDate("1999","12","29")));
        employees.add(new Employee("tom",7896,new MyDate("1998","11","19")));
        employees.add(new Employee("jack",8953,new MyDate("2000","02","09")));
        employees.add(new Employee("tom",7898,new MyDate("1998","11","19")));
        employees.add(new Employee("tom",7896,new MyDate("1998","11","22")));
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
