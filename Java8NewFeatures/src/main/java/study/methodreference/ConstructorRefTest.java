package study.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import org.junit.Test;

/**
 * 一、构造器引用
 *      和方法引用类似，函数式接口的抽象方法的形参列表和构造器的形参列表一致。
 *      抽象方法的返回值类型即为构造器所属的类的类型
 *
 * 二、数组引用
 *     大家可以把数组看做是一个特殊的类，则写法与构造器引用一致。
 *
 * Created by shkstart
 */
public class ConstructorRefTest {
	//构造器引用
    //Supplier中的T get()
    //Employee的空参构造器：Employee()
    @Test
    public void test1(){
        Supplier<Employee> sup = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };
        //lambda表达式
        Supplier<Employee> supplier = () -> new Employee();
        //方法引用
        Supplier supp = Employee::new;
    }

	//Function中的R apply(T t)
    //Employee的有参构造器：Employee(int id)
    @Test
    public void test2(){
        Function<Integer,Employee> function = new Function<Integer, Employee>() {
            @Override
            public Employee apply(Integer integer) {
                return new Employee(integer);
            }
        };
        //lambda表达式
        Function<Integer,Employee> fun = id -> new Employee(id);
        //方法引用
        Function<Integer,Employee> func = Employee::new;

    }

	//BiFunction中的R apply(T t,U u)
    ////Employee的空参构造器：Employee(int id, String name)
    @Test
    public void test3(){
        BiFunction<Integer,String,Employee> fun = new BiFunction<Integer, String, Employee>() {
            @Override
            public Employee apply(Integer integer, String s) {
                return new Employee(integer,s);
            }
        };
        //lambda表达式
        BiFunction<Integer,String,Employee> function = (id,name) -> new Employee(id,name);
        //方法引用
        BiFunction<Integer,String,Employee> func = Employee::new;
    }

	//数组引用
    //Function中的R apply(T t)
    //
    @Test
    public void test4(){
        Function<Integer,String[]> function = new Function<Integer, String[]>() {
            @Override
            public String[] apply(Integer integer) {
                return new String[integer];
            }
        };
        //lambda表达式
        Function<Integer,String[]> fun = length -> new String[length];
        //方法(数组)引用
        Function<Integer,String[]> func = String[] ::new;

    }
}
