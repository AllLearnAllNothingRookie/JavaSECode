package study.setstudy.hashsetstudy.exercise.exercise01;

import java.util.HashSet;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/9 15:05
 * 定义一个Employee类，该类包含属性name，age
 * 创建3个Employee对象，存放到HashSet中，当name和age相同是认为是同一个员工，
 * 不能添加到HashSet中
 */
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee("rookie",22));
        employees.add(new Employee("tom",22));
        employees.add(new Employee("jack",23));
        employees.add(new Employee("jack",23));
        employees.add(new Employee("jack",25));
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
