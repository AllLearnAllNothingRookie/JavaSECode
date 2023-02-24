package study.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.Test;
import study.methodreference.Employee;
import study.methodreference.EmployeeData;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/22 11:23
 * todo: 创建Stream
 *   方式1： 通过集合
 *         Java8的Collection接口被扩展，提供了两个获取流的方法：
 *           default Stream<E> stream(): 返回一个顺序流
 *           default Stream<E> parallelStream(): 返回一个并行流
 *  方式2： 通过数组
 *         Java8中的Arrays的静态方法 Stream() 可以获取数组流：
 *         static <T> Stream<T>  Stream(T[] array): 返回一个流
 *         重载形式，能够处理对于基本类型的数组：
 *         public static IntStream stream(int[] array)
 *         public static LongStream stream(long[] array)
 *         public static DoubleStream stream(double[] array)
 *  方式3: 通过Stream的of()
 *         可以调用Stream类静态方法 of(),通过显示值创建一个流。它可以接收任意数量的参数
 *         public static<T> Stream<T> of(T... values):返回一个流
 *  方式4： 创建无限流
 *          可以使用静态方法Stream.iterate()和Stream.generate(),创建无限流
 *          迭代：
 *           public static <T> Stream<T> iterate(final T seed,final UnaryOperator<T> f)
 *          生成
 *           public static <T> Stream<T> generate(Supplier<T> s)
 */
public class CreateStream {
    /**
     * 方式1： 通过集合
     */
    @Test
    public void test(){
        List<Employee> employees = EmployeeData.getEmployees();
        //default Stream<E> stream(): 返回一个顺序流
        Stream<Employee> stream = employees.stream();
        // default Stream<E> parallelStream(): 返回一个并行流
        Stream<Employee> employeeStream = employees.parallelStream();
    }
    /**
     * 方式2： 通过数组
     */
    @Test
    public void test2(){
        int[] arr = {1,2,3,4,5,6};
        //调用Arrays类的 static <T> Stream<T>  Stream(T[] array): 返回一个流
        IntStream stream = Arrays.stream(arr);

        Employee tom = new Employee(1001, "tom");
        Employee jerry = new Employee(1002, "jerry");
        Employee jack = new Employee(1003, "jack");
        Employee[] employees = {tom,jack,jerry};
        Stream<Employee> employeeStream = Arrays.stream(employees);
    }
    /**
     * 方式3: 通过Stream的of()
     */
    @Test
    public void test3(){
        //public static<T> Stream<T> of(T... values):返回一个流
        Stream<Integer> integerStream = Stream.of(1, 3, 5, 7, 4, 2, 8, 11, 34, 53);

    }
    /**
     * 方式4： 创建无限流
     */
    @Test
    public void test4(){
        //迭代：
        //public static <T> Stream<T> iterate(final T seed,final UnaryOperator<T> f)
       //遍历前10个偶数
        Stream.iterate(0,t -> t + 2).limit(10).forEach(System.out::println);
        // 生成
        // public static <T> Stream<T> generate(Supplier<T> s)
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
