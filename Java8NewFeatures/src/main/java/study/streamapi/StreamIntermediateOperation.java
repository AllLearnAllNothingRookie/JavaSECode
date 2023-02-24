package study.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.Test;
import study.methodreference.Employee;
import study.methodreference.EmployeeData;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/22 16:34
 * todo: Stream 中间操作
 *      多个中间操作可以连接起来形成一个流水线，除非流水线上触发终止操作，否则中间操作不会执行
 *      任何的处理请求，而在终止操作是一次性全部处理，称为"惰性求值"。
 *
 * todo: 1.筛选与切片
 *      方法               描述
 *     filter(Predicate p):接收Lambda，从流中排除某些元素
 *     distinct():筛选，通过流所生成元素的hashCode()和equals()去除重复的元素
 *     limit(long maxSize): 截断流，使其元素不超过给定数量
 *     skip(long n): 跳过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个
 *             空流，与limit(n)互补
 *todo:2.映射
 *   方法               描述
 *   map(Function f):接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素
 *   mapToDouble(ToDoubleFunction f):接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的DoubleStream
 *   mapToInt(ToIntFunction f):接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的IntStream
 *   mapToLong(ToLongFunction f):接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的LongStream
 *   flatMap(Function f):接收一个函数作为参数,将流中的每个值都换成另一个流，然后把所有流连接成一个流
 *
 *
 */
public class StreamIntermediateOperation {
    /**
     * 1.筛选与切片
     */
    @Test
    public void  test1(){
        List<Employee> employees = EmployeeData.getEmployees();
        //filter(Predicate p):接收Lambda，从流中排除某些元素
        Stream<Employee> stream = employees.stream();
        //返回工资大于7000的员工
        stream.filter(employee -> employee.getSalary() > 7000).forEach(System.out::println);
        System.out.println("-----------------------------------");
        //limit(long maxSize): 截断流，使其元素不超过给定数量
        employees.stream().limit(3).forEach(System.out::println);
        System.out.println("-----------------------------------");
        //skip(long n): 跳过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空流，与limit(n)互补
        employees.stream().skip(4).forEach(System.out::println);
        System.out.println("-----------------------------------");
        //向集合中添加重复元素
        employees.add(new Employee(1008, "扎克伯格", 35, 2500.32));
        employees.add(new Employee(1006, "比尔盖茨", 42, 9500.43));
        //distinct():筛选，通过流所生成元素的hashCode()和equals()去除重复的元素
        employees.stream().distinct().forEach(System.out::println);
    }
    /**
     * 隐射
     */
    @Test
    public void test2(){
        //map(Function f):接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素
        List<String> strings = Arrays.asList("aa", "bb", "cc", "dd");
        strings.stream().map(String::toUpperCase).forEach(System.out::println);
        //练习： 获取员工姓名长度大于3的员工姓名
        List<Employee> employees = EmployeeData.getEmployees();
        //思路先获取员工名字在过滤
        employees.stream().map(Employee::getName)
                .filter(name -> name.length() > 3)
                .forEach(System.out::println);
        //flatMap(Function f):接收一个函数作为参数,将流中的每个值都换成另一个流，然后把所有流连接成一个流

    }
}
