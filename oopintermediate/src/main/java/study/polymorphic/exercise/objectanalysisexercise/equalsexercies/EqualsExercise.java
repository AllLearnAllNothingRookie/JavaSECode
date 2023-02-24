package study.polymorphic.exercise.objectanalysisexercise.equalsexercies;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/30 10:28
 */
public class EqualsExercise {
    public static void main(String[] args) {
        Person tom = new Person("tom",18,'M');
        Person jack = new Person("jack",12,'M');
        Person tom1 = new Person("tom",18,'M');
        Person tom2 = new Person("tom2",18,'M');
        Person tom3 = new Person("tom",19,'M');
        Person tom4 = new Person("tom",18,'W');
        System.out.println(tom.equals(jack)); //f
        System.out.println(tom.equals(tom1)); //t
        System.out.println(tom.equals(tom2)); //f
        System.out.println(tom.equals(tom3)); //f
        System.out.println(tom.equals(tom4)); //f
        System.out.println(tom.equals(tom));  //t
        System.out.println(tom.equals(null)); //f
        System.out.println("=============================");
        //todo: == ：基本类型，两个类型不相同(如果可以自动类型转换)就可以进行比较,比较的是值
        //      不能自动类型转换则不能比较
        int it = 65;
        float f = 65.00000f;
        char c = 'A';
        byte bt = 65;
        short s = 65;
        long l = 65L;
        double d = 65.0;
        System.out.println("============int=========");
        System.out.println(it == f);  // t
        System.out.println(it == c);  // t
        System.out.println(it == bt);  // t
        System.out.println(it == s);  // t
        System.out.println(it == l);  // t
        System.out.println(it == d);  // t
        System.out.println("============byte=========");
        System.out.println(bt == f);  // t
        System.out.println(bt == c);  // t
        System.out.println(bt == s);  // t
        System.out.println(bt == l);  // t
        System.out.println(bt == d);  // t
        System.out.println(bt == it);  // t
        System.out.println("============short=========");
        System.out.println(s == f);  // t
        System.out.println(s == c);  // t
        System.out.println(s == it);  // t
        System.out.println(s == l);  // t
        System.out.println(s == d);  // t
        System.out.println(s == bt);  // t
        System.out.println("============long=========");
        System.out.println(l == f);  // t
        System.out.println(l == c);  // t
        System.out.println(l == it);  // t
        System.out.println(l == s);  // t
        System.out.println(l == d);  // t
        System.out.println(l == bt);  // t
        System.out.println("============float=========");
        System.out.println(f == l);  // t
        System.out.println(f == c);  // t
        System.out.println(f == it);  // t
        System.out.println(f == s);  // t
        System.out.println(f == d);  // t
        System.out.println(f == bt);  // t
        System.out.println("============double=========");
        System.out.println(d == f);  // t
        System.out.println(d == c);  // t
        System.out.println(d == it);  // t
        System.out.println(d == s);  // t
        System.out.println(d == l);  // t
        System.out.println(d == bt);  // t
        System.out.println("============char=========");
        System.out.println(c == f);  // t
        System.out.println(c == l);  // t
        System.out.println(c == it);  // t
        System.out.println(c == s);  // t
        System.out.println(c == d);  // t
        System.out.println(c == bt);  // t
        boolean b = true;
        //java: 不可比较的类型: boolean和float
        // System.out.println(b == f);
        //java: 不可比较的类型: boolean和int
        // System.out.println(b == it);
        //java: 不可比较的类型: boolean和double
        // System.out.println(b == d);
        //java: 不可比较的类型: boolean和short
        // System.out.println(b == s);
        //java: 不可比较的类型: boolean和long
        // System.out.println(b == l);
        // java: 不可比较的类型: boolean和char
        // System.out.println(b == c);
        //todo： == ：两个引用类型如果类型不相同不能进行比较
        //java: 不可比较的类型: java.lang.String和java.util.Date
        //System.out.println("111" == new Date());
    }
}
