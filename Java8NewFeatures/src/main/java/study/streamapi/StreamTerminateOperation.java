package study.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.junit.Test;
import study.methodreference.Employee;
import study.methodreference.EmployeeData;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/24 21:51
 * todo: Stream终止操作
 *      终端(终止)操作会从流的流水线生成结果。器结果可以是任何不是流的值，例如 List、Integer
 *         甚至是void
 *      流进行了终止操作后，不能再次使用
 * todo 1： 匹配与查找
 *   allMatch(Predicate p):检查是否匹配所有元素
 *   anyMatch(Predicate p):检查是否至少匹配一个元素
 *   noneMatch(Predicate p):检查是否没有匹配所有元素
 *   findFirst(): 返回第一个元素
 *   findAny(): 返回当前流中的任意元素
 *   count(): 返回流中元素总和
 *   max(Comparator c):返回流中最大值
 *   min(Comparator c):返回流中最大小值
 *   forEach(Consumer c): 内部迭代(使用Collection)接口需要用户做迭代，称为外部迭代
 *      ，相反，Stream API 使用内部迭代)
 *todo:2.归约 -- 归成一个(累加、累乘.....)
 *      reduce(T identity,BinaryOperator b):可以将流中元素反复结合起来，得到一个值，返回T, identity  初始值
 *      reduce(BinaryOperator b):可以将流中元素反复结合起来，得到一个值,返回一个Optional<T>
 *      备注:map和reduce的连接通常称为map-reduce模式，因google用它来进行网络搜索而出名
 *todo: 3.收集
 *      collect(Collector c):将流转换为其他形式，接收一个Collector接口的实现，用于给Stream中
 *          元素做汇总的方法
 *     Collector接口中方法的实现决定了如何对流执行收集的操作(如收集到List、Set、Map)
 *     另外Collectors实用类提供了很多静态方法，可以方便的创建常见收集器实例，
 *
 */
public class StreamTerminateOperation {
    /**
     * 1： 匹配与查找
     */
    @Test
    public void test1(){
        List<Employee> employees = EmployeeData.getEmployees();
        //allMatch(Predicate p):检查是否匹配所有元素
        // 练习：是否所有员工的年龄都大于18
        boolean b = employees.stream().allMatch(e -> e.getAge() > 18);
        System.out.println("是否所有员工的年龄都大于18:" + b);
        //anyMatch(Predicate p):检查是否至少匹配一个元素
        // 练习：是否存在员工的工资大于10000
        boolean b1 = employees.stream().anyMatch(e -> e.getSalary() > 10000);
        System.out.println("是否存在员工的工资大于10000:" + b1);
        //noneMatch(Predicate p):检查是否"没有"匹配的元素
        //练习：是否存在员工姓"雷"
        boolean b2 = employees.stream().noneMatch(e -> e.getName().startsWith("雷"));
        System.out.println("是否存在员工姓\"雷\":" + !b2);
        //findFirst():返回第一个元素
        Optional<Employee> first = employees.stream().findFirst();
        System.out.println(first);
        //findAny():返回当前流中任意元素
        Optional<Employee> any = employees.parallelStream().findAny();
        System.out.println(any);
        //count():返回流中元的总个数
        long count = employees.stream().count();
        System.out.println("员工数量:" + count);
        //max(Comparator c):返回流中最大值
        //练习:返回最高工资
        Optional<Double> max = employees.stream().map(e -> e.getSalary())
                //.max((s1, s2) -> (int) (s1 - s2));
                .max(Double::compare);
        System.out.println("最大的工资为；" + max);
        //min(Comparator c):返回流中最小值
        //练习:返回最低工资的员工
        Optional<Employee> min = employees.stream().min((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()));
        System.out.println("工资最低的员工：" + min);
        System.out.println("-----------------------");
        //forEach(Consumer c):内部迭代
        employees.stream().forEach(System.out::println);
        //使用集合的遍历操作
        System.out.println("-----------使用集合的遍历操作---------");
        employees.forEach(System.out::println);
    }
    /**
     * 2.归约
     */
    @Test
    public void test2(){
        //reduce(T identity,BinaryOperator b):可以将流中元素反复结合起来，得到一个值，返回T
        //练习：计算1-10的自然数和
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer reduce = list.stream().reduce(0, Integer::sum);
        //Integer reduce1 = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("和为：" + reduce);
        //reduce(BinaryOperator b):可以将流中元素反复结合起来，得到一个值,返回一个Optional<T>
        //练习：计算公司所有员工工资的综合
        List<Employee> employees = EmployeeData.getEmployees();
        Optional<Double> sum = employees.stream().map(e -> e.getSalary()).reduce((x, y) -> x + y);
        System.out.println(sum);
        Double sum1 = employees.stream().map(e -> e.getSalary()).reduce(0.0,Double::sum);
        System.out.println(sum1);
    }
    /**
     * 3.收集
     */
    @Test
    public void test3(){
        //collect(Collector c):将流转换为其他形式，接收一个Collector接口的实现，用于给Stream中
        //  元素做汇总的方法
        //练习：查找工资大于6000的员工，结果返回为一个List或Set

    }
}
