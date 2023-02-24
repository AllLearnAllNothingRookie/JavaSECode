package study.string;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/2 13:52
 * todo:StringBuffer
 *      1.java.lang.StringBuffer代表可变的字符序列，可以堆字符串内容进行增删
 *      2.很多方法与String相同，但是StringBuffer是可变长度的
 *      3.StingBuffer是一个容器
 *      4.StingBuffer的直接父类是AbstractStringBuilder
 *       实现了Serializable接口，即对象可以串行化
 *       在其父类中即AbstractStringBuilder中有属性char[] value;
 *       该value数组存放字符串数组，因此存放的位置在堆中
 *       5.StingBuffer是一个final修饰的类，所以不能被继承
 *
 * todo:String和StingBuffer的对比:
 *      1.String保存的是字符串常量，里面的值不能更改，每次String类的更新实际上就是更改地址，效率低
 *      2.StringBuffer保存的是字符串变量，里面的值可以更改，每次StingBuffer的更新，不用
 *        每次更改地址，效率高
 */
public class StringBufferStudy {
    public static void main(String[] args) {
        // 创建一个容量大小为16的char用于存放字符序列
        StringBuffer sb = new StringBuffer();
        // 构建一个字符缓冲区，它包含与指定的CharSequence相同的字符
        StringBuffer sb2 = new StringBuffer('a');
        // 构造一个不带字符，但是具有指定初始化容量的字符缓冲区，即对char[] 大小进行指定
        StringBuffer sb3 = new StringBuffer(20);
        // 构造一个字符缓冲区，并将其内容初始化为指定字符串内容
        // StringBuffer的char[]长度为 字符串长度 + 16
        // super(str.length() + 16);
        StringBuffer sb4 = new StringBuffer("hello");


        //String和StringBuffer之间相互转换
        // String -> StringBuffer
        //1.使用构造器
        String str = "hello ";
        StringBuffer stringBuffer = new StringBuffer(str);
        //2.使用append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(str);

        //StringBuffer -> String
        //1.使用StringBuffer提供的toString方法
        StringBuffer stringBuffer2 = new StringBuffer("rookie");
        String s = stringBuffer2.toString();
        //2.使用String的构造器
        String str1 = new String(stringBuffer2);

        String str2 = null;
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(str2);
        //4
        System.out.println(stringBuffer3.length() );
        //null
        System.out.println(stringBuffer3);
        //java.lang.NullPointerException
        //super(str.length() + 16); 此处报空指针异常null.length()
        StringBuffer stringBuffer4 = new StringBuffer(str2);
        System.out.println(stringBuffer4);
    }
}
