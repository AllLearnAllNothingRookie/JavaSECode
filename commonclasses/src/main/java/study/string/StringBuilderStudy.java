package study.string;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/2 16:03
 * todo:StringBuilder
 *      1.是一个可变的字符序列，此类提供了一个与StringBuffer兼容的API,但是不保证同步[StringBuilder
 *      不是线程安全的]，该类被设计用作StringBuffer的一个简易替换，用在字符串缓冲区被单个线程使用的时候，
 *      如果有可能 ，建议优先采用该类，因为在大对数实现中，它比StingBuffer要快
 *      2.在StringBuilder上的主要操作是append和insert方法，可重载这些方法，已接受任意类型的
 *      数据
 *   StringBuffer和StringBuilder均代表可变的字符序列，方法是一样的，所以和使用StingBuffer一样
 *   1.继承了AbstractStringBuilder类
 *   2.实现了Serializable接口，说明StringBuilder对象可以串行化(可以网络传输，也可以保存到文件)
 *   3.StringBuilder是final修饰的类，不能被继承
 *   4. StringBuilder对象的字符序列仍然是存在在父类AbstractStringBuilder的char[] value;属性
 *      中，因此字符序列存在在堆中
 *
 *todo:String,StringBuffer,StringBuilder的区别
 *     1.StringBuffer和StringBuilder非常类似，均代表可变的字符序列，而且方法也一样
 *     2.String：不可变字符序列，效率低，但是复用率高
 *     3.StringBuffer：可变字符序列，效率较高，线程安全
 *     4.StringBuilder：可变字符序列，效率最高，线程不安全
 *  String使用注意说明:
 *      String s = "a"; //创建一个字符串
 *      s += "b"; //实际上原来的"a"字符串对象已经丢弃了，现在有产生了一个字符串是 s + "b"(也就是
 *      "ab").如果多次执行这些改变字符串内容的操作，回导致大量副本字符串对象存留在内存中，降低效率
 *      。如果将这些操作放到循环中，会极大的影响程序性能，
 *     结论:如果对String做大量修改，不要使用String
 *   1.如果字符串存在的修改操作，一般使用StringBuffer或StringBuilder
 *   2.如果字符串存在的修改操作，并在单线程情况下，使用StringBuilder
 *   3.如果字符串存在的修改操作，并在多线程情况下，使用StringBuffer
 *   4.如果字符串很少修改，被多个对象引用，使用String，比如配置信息等
 *
 */
public class StringBuilderStudy {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
    }
}
