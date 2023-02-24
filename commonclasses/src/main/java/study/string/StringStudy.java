package study.string;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/1 12:38
 * todo:  String
 *      1.String对象用于保存字符串，也就是一组字符序列
 *      2.字符串常量对象是用双引号括起来的字符序列
 *      3.字符串的字符使用Unicode字符编码，一个字符(不分字母还是汉字)占两个字符
 *      4. String类实现了Serializable表示String可以实现串行化，可以在网络中进行传输
 *      5.String实现类Comparable表示String可以相互比较大小
 *      6.String使用final修饰表示不能被其他类继承
 *      7.字符串保存数据时是保存到char数组中
 *          private final char value[];用于存放字符串内容
 *         并且value是final修饰的类型，即不可以修改，即数组指向的地址不可以修改
 *         但是数组里的元素可以修改
 *       8.String是一个final类，代表不可变的字符序列
 *       9.字符串是不可变的。一个字符串对象一旦被分配，其内容是不可变的
 *    String对象的两种创建方式:
 *     1. 直接赋值
 *         String str = "rookie";
 *         先从常量池中查看是否有对应的数据空间，如果有则直接指向，如果没有则重新创建
 *         然后指向。字符串变量最终指向的是常量池中的空间地址
 *     2. 调用构造器
 *          String str =  new String("alan");
 *         现在堆中创建空间，里面维护了value属性，指向常量池中的空间，如果常量池中没有对应的
 *         值则重新创建，如果有则直接通过value指向。字符串变量最终指向的是堆中的空间地址
 *     String a = "hello" + "abc";
 *     编译器回对其进行优化 等价于 String a = "helloabc";底层只创建了一个对象
 *     String str = "hello";
 *     str = "haha";  //底层创建了两个对象
 *     Sting a = "hello";   //在对象池中创建了a对象
 *     String b = "abc";    //在对象池中创建了a对象
 *     String c = a + b;
 *     // 1.先创建一个StringBuilder sb = new StringBuilder();
 *     // 2.sb.append(a);
 *     // 3.sb.append(b);
 *     // 4.调用sb.toSting()方法，即new String();
 *
 *
 */
public class StringStudy {
    public static void main(String[] args) {
        //String对象用于保存字符串，也就是一组字符序列
        String name = "rookie";
        //示例:使用final修饰引用类型
        final  char[] value = {'a','b','c'};
        //数组内部的元素可以被修改
        value[0] = 'H';
        char[] values = {'1','3',4};
        //但是数组指向的"地址"不能被修改
        //Cannot assign a value to final variable 'value'
        //value = values;

        /**
         * todo:String对象的两种创建方式:
         *   1. 直接赋值
         *   String str = "rookie";
         *    先从常量池中查看是否有对应的数据空间，如果有则直接指向，如果没有则重新创建
         *     然后指向。字符串变量最终指向的是常量池中的空间地址
         *   2. 调用构造器
         *    String str =  new String("alan");
         *    现在堆中创建空间，里面维护了value属性，指向常量池中的空间，如果常量池中没有对应的
         *    值则重新创建，如果有则直接通过value指向。字符串变量最终指向的是堆中的空间地址
         */
        //1.直接赋值
        String str1 = "rookie";
        String str2 = "rookie";
        //true
        System.out.println(str1 == str2 );
        //true
        System.out.println(str1.equals(str2));
        //2. 调用构造器
        String str3 = new String("alan");
        String str4 = new String("alan");
        //false
        System.out.println(str3 == str4);
        //true
        System.out.println(str3.equals(str4));

        String a = "rookie";
        String b = new String("rookie");
        //true
        System.out.println(a.equals(b));
        //false
        System.out.println(a == b);
        /*
        todo:intern():当调用intern方法时，
          如果池已经包含与equals(Object)方法确定的相当于此String对象的字符串，
          则返回来自池的字符串。 否则，此String对象将添加到池中，
          并返回对此String对象的引用。
          即返回常量池中字符串的地址，如果有则直接返回，没有则在常量池中创建并返回
         */
        //true
        System.out.println(a == b.intern());
        //false
        // b:指向堆空间地址    b.intern():指向常量池的空间地址
        System.out.println(b == b.intern());
        // todo: 字符串拼接字符串变量与原字符串不相等
        String c = a + "";
        //false
        System.out.println(a == c);
        // todo:字符串拼接字符串与原变量相等
        String d = "roo" + "kie";
        //true
        System.out.println(a == d);
        // todo:字符串拼接字符串与原变量相等
        String e = "rookie" + "";
        //true
        System.out.println(a == e);

        String f = "roo";
        //todo: 字符串拼接字符串变量与原字符串不相等
        String g = f + "kie";
        //false
        System.out.println(a == g);
        String h = "kie";
        //todo: 字符串拼接字符串变量与原字符串不相等
        String j = f + h;
        //false
        System.out.println(a == j);

        String string1 = "alan";
        String string2 = "rookie";
        String string3 = "alanrookie";
        String string4 = (string1 + string2).intern();
        //true
        System.out.println(string4 == string3);
        //true
        System.out.println(string3.equals(string4));

    }
}
