package study.methodreference;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.junit.Test;

/**
 * 方法引用的使用
 *
 * 1.使用情境：当要传递给Lambda体的操作，已经有实现的方法了，可以使用方法引用！
 *
 * 2.方法引用，本质上就是Lambda表达式，而Lambda表达式作为函数式接口的实例。所以
 *   方法引用，也是函数式接口的实例。
 *
 * 3. 使用格式：  类(或对象) :: 方法名
 *
 * 4. 具体分为如下的三种情况：
 *    情况1     对象 :: 非静态方法
 *    情况2     类 :: 静态方法
 *    情况3     类 :: 非静态方法
 *
 * 5. 方法引用使用的要求：要求接口中的抽象方法的形参列表和返回值类型与方法引用的方法的
 *    形参列表和返回值类型相同！（针对于情况1和情况2）
 *
 * Created by shkstart.
 */
public class MethodRefTest {

	// 情况一：对象 :: 实例方法
	//Consumer中的void accept(T t)
	//PrintStream中的void println(T t)
	@Test
	public void test1() {
		Consumer<String> con = str -> System.out.println(str);
		con.accept("北京");
		//方法引用
		PrintStream ps = System.out;
		Consumer<String> consumer = ps::println;
		consumer.accept("四川");
	}
	
	//Supplier中的T get()
	//Employee中的String getName()
	@Test
	public void test2() {
		Employee employee = new Employee(1001,"Tom",23,5699);
		Supplier<String> sup = () -> employee.getName();
		String s = sup.get();
		System.out.println(s);

		//方法引用
		Supplier<String> supplier = employee::getName;
		String s1 = supplier.get();
		System.out.println(s1);
	}

	// 情况二：类 :: 静态方法
	//Comparator中的int compare(T t1,T t2)
	//Integer中的int compare(T t1,T t2)
	@Test
	public void test3() {
		Comparator<Integer> com = (t1,t2) -> Integer.compare(t1,t2);
		int compare = com.compare(12, 34);
		System.out.println(compare);
		//方法引用
		Comparator<Integer> comparator = Integer::compare;
		int compare1 = comparator.compare(24, 24);
		System.out.println(compare1);
	}
	
	//Function中的R apply(T t)
	//Math中的Long round(Double d)
	@Test
	public void test4() {
		Function<Double,Long> fun = num -> Math.round(num);
		Long apply = fun.apply(12.6);
		System.out.println(apply);
		//方法引用
		Function<Double,Long> function = Math::round;
		Long apply1 = function.apply(35.6);
		System.out.println(apply1);
	}

	// 情况三：类 :: 实例方法  (有难度)
	// Comparator中的int comapre(T t1,T t2)
	// String中的int t1.compareTo(t2)
	@Test
	public void test5() {
		Comparator<String> com = (t1,t2) -> t1.compareTo(t2);
		int compare = com.compare("aaa", "aab");
		System.out.println(compare);
		//方法引用
		Comparator<String> comparator = String::compareTo;
		int compare1 = comparator.compare("abc", "ddd");
		System.out.println(compare1);
	}

	//BiPredicate中的boolean test(T t1, T t2);
	//String中的boolean t1.equals(t2)
	@Test
	public void test6() {
		BiPredicate<String,String>  bi = (t1,t2) -> t1.equals(t2);
		boolean test = bi.test("abc", "abc");
		System.out.println(test);
		//方法引用
		BiPredicate<String,String> biPredicate = String::equals;
		boolean test1 = biPredicate.test("ccf", "pdd");
		System.out.println(test1);
	}
	
	// Function中的R apply(T t)
	// Employee中的String getName();
	@Test
	public void test7() {
		Function<Employee,String> function = (e) -> e.getName();
		Employee employee = new Employee(1001,"Tom",23,5699);
		String apply = function.apply(employee);
		System.out.println(apply);
		//方法引用
		Function<Employee,String > fun = Employee::getName;
		String name = fun.apply(employee);
		System.out.println(name);
	}

}
