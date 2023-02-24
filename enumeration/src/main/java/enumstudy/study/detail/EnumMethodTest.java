package enumstudy.study.detail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/26 14:20
 * todo: Enum类的常用方法
 *  1. public final String name()返回此枚举常量的名称，与其枚举声明中声明的完全相同。 大多数程序员应该使用toString()方法，因为toString方法可能会返回一个更加用户友好的名称。 该方法主要用于专门的情况，其中正确性取决于获得确切的名称，这从发布到发布不会有所不同。
 *       结果   这个枚举常数的名称
 *  2.public static <T extends Enum<T>> T valueOf(类<T> enumType,String name)返回具有指定名称的指定枚举类型的枚举常量。
 *      该名称必须与用于声明此类型的枚举常量的标识符完全一致。 （不允许使用外来空白字符。）
 *      请注意，对于特定枚举类型T ，可以使用该枚举上隐式声明的public static T valueOf(String)方法，而不是使用此方法将名称映射到相应的枚举常量。
 *      枚举类型的所有常量可以通过调用该类型的隐式public static T[] values()方法来获得。
 *     参数类型
 *          T - 要返回其常量的枚举类型
 *      参数
 *          enumType - 类返回常量的枚举类型的 类对象
 *          name - 常量返回的名称
 *      结果 具有指定名称的指定枚举类型的枚举常量
 *      异常
 *          IllegalArgumentException - 如果指定的枚举类型没有指定名称的常量，或者指定的类对象不表示枚举类型
 *          NullPointerException - 如果 enumType或 name为null
 *  3.public final int ordinal()返回此枚举常数的序数（其枚举声明中的位置，其中初始常数的序数为零）。
 *      大多数程序员将不会使用这种方法。 它被设计为使用复杂的基于枚举的数据结构，如EnumSet和EnumMap 。
 *      结果   这个枚举常数的序数
 *  详细见API文档
 */
public class EnumMethodTest {
    public static void main(String[] args) {
        EnumMethod autumn = EnumMethod.AUTUMN;
        //name方法:输出枚举对象的名字
        System.out.println(autumn.name());
        // ordinal方法:输出该枚举对象的次序 从0开始编号即枚举对象定义使的顺序
        System.out.println(autumn.ordinal());
        //values:返回枚举类中定义的枚举对象
        EnumMethod[] values = EnumMethod.values();
        for (EnumMethod value : values) {
            System.out.println(value);
        }
        //valueOf:将字符串转换为枚举对象，要求字符串必须为已有的常量名，否则报错
        //No enum constant enumstudy.study.detail.EnumMethod.SPRING1
        //System.out.println(EnumMethod.valueOf("SPRING1"));
        System.out.println(EnumMethod.valueOf("SPRING"));
        //Exception in thread "main" java.lang.IllegalArgumentException: No enum constant enumstudy.study.detail.EnumMethod.SPRINg
        //System.out.println(EnumMethod.valueOf("SPRINg"));
        //compareTo:比较两个枚举常量，比较的就是编号(ordinal方法的值)
        //  -1: 当前对象小于传入的对象    0: 当前对象等于传入的对象  1: 当前对象大于传入的对象
        System.out.println(EnumMethod.SUMMER.compareTo(EnumMethod.SUMMER));
        // toString:重写了就返回重写的方法，没有重写就返回name，即枚举类对象的名字

    }
}
