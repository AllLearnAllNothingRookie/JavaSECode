package study.codeblock.codeblockdetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/6 21:01
 * todo:代码块细节
 *  1.static代码块也叫静态代码块,作用时对类进行初始化,而且随着类的加载而执行,并且只会执行
 *      一次,如果是普通代码块,则每创建一个对象就执行一次
 *  2.类什么时候被加载
 *      1.创建对象实时(new)
 *      2.创建子类对象实例,父类也会被加载
 *      3.使用类的静态成员时(静态属性,静态方法)
 *  3.普通的代码块,在创建对象实例时,会被隐式调用,创建一次对象就执行一次代码块
 *      如果使用类的静态成员时(直接用类.静态成员,没有创建对象),普通代码块并不会执行
 *  4.创建一个对象时,在一个类调用的顺序是:
 *      1.调用静态代码块和静态属性初始化(注意:静态属性初始化和静态代码块调用的优先级是一样的
 *          ,如果有多个静态代码块和多个静态变量初始化,则按照定义的顺序调用)
 *      2.调用普通代码块和普通属性的初始化(注意:普通属性初始化和普通代码块调用的优先级是一样的
 *          ,如果有多个普通代码块和多个普通属性初始化,则按照定义的顺序调用)
 *      3.调用构造方法
 *   5.构造方法(构造器)的最前面其实隐含了super()和调用普通代码块;
 *    静态代码块,静态属性初始化在类加载时就执行完毕,因此是优先于构造器和普通代码块执行的
 *   6.创建一个子类时，静态代码块,静态属性初始化,普通代码块,普通属性初始化,
 *      构造方法的调用顺序如下：
 *      1.父类的静态代码块和静态属性(优先级一样,按定义顺序执行)
 *      2.子类的静态代码块和静态属性(优先级一样,按定义顺序执行)
 *      3.父类的普通代码块和普通属性(优先级一样,按定义顺序执行)
 *      4.父类的构造方法
 *      5.子类的普通代码块和普通属性(优先级一样,按定义顺序执行)
 *      6.子类的构造方法
 *   7.静态代码块只能直接调用静态成员(静态方法,静态属性),普通代码块可以调用任意成员
 *
 *
 *
 */
public class CodeBlockDetail {
    public static void main(String[] args) {
        //todo:类加载的情况：
        // 1.创建对象实例的时候(new)
        System.out.println("==类加载的情况：1.创建对象实例的时候==");
         AA aa = new AA();
         //2.创建子类实例时,父类也会被加载,父类的静态成员先加载,子类的静态成员后加载
        System.out.println("==类加载的情况：2.创建子类实例时,父类也会被加载==");
        CC cc = new CC();
        // 3.使用类的静态成员时(静态属性,静态方法)
        System.out.println("==类加载的情况：3.使用类的静态成员时==");
        System.out.println(DD.age);
        System.out.println("=======静态代码块和普通代码块的执行次数==========");
        //todo：static代码块也叫静态代码块,作用时对类进行初始化,而且随着类的加载而执行,并且只会执行
        //      一次,如果是普通代码块,则每创建一个对象就执行一次
        EE ee = new EE();
        EE e = new EE();
        //todo:如果只是使用类的静态成员(没有创建对象),普通代码块不会执行
        System.out.println("==如果只是使用类的静态成员(没有创建对象),普通代码块不会执行==");
        System.out.println(FF.name);
        /**
         * todo:创建一个对象时,在一个类调用的顺序是:
         *  *      1.调用静态代码块和静态属性初始化(注意:静态属性初始化和静态代码块调用的优先级是一样的
         *  *          ,如果有多个静态代码块和多个静态变量初始化,则按照定义的顺序调用)
         *  *      2.调用普通代码块和普通属性的初始化(注意:普通属性初始化和普通代码块调用的优先级是一样的
         *  *          ,如果有多个普通代码块和多个普通属性初始化,则按照定义的顺序调用)
         *  *      3.调用构造方法
         */
        System.out.println("=======创建一个对象时,在一个类调用的顺序是:========");
        AAA aaa = new AAA();
        /**
         * todo:
         *  创建一个子类时，静态代码块,静态属性初始化,普通代码块,普通属性初始化,
         *        构造方法的调用顺序如下：
         *        1.父类的静态代码块和静态属性(优先级一样,按定义顺序执行)
         *        2.子类的静态代码块和静态属性(优先级一样,按定义顺序执行)
         *        3.父类的普通代码块和普通属性(优先级一样,按定义顺序执行)
         *        4.父类的构造方法
         *        5.子类的普通代码块和普通属性(优先级一样,按定义顺序执行)
         *        6.子类的构造方法
         */
        System.out.println("====创建一个子类时，静态代码块,静态属性初始化,普通代码块,普通属性初始化," +
                "构造方法的调用顺序=====");
        Cat cat = new Cat();
        /**
         * todo:静态代码块只能直接调用静态成员(静态方法,静态属性),普通代码块可以调用任意成员
         */
        System.out.println("===静态代码块只能直接调用静态成员(静态方法,静态属性),普通代码块可以调用任意成员===");
        Gog gog = new Gog();
    }
}
