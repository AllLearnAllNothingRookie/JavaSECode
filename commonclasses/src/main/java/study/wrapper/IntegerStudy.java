package study.wrapper;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/30 21:17
 * todo:包装类和基本类型之间的转换 以int -> Integer为例子
 *   1.JDK5以前是手动装箱和手动拆箱
 *      装箱: 基本数据类型 -> 包装类型
 *      拆箱：包装类型 -> 基本数据类型
 *   2.JDK5以后(含JDK5)是自动装箱和自动拆箱
 *   3.自动装箱底层调用的是valueOf()方法
 *    其他包装类用法类似
 */
public class IntegerStudy {
    public static void main(String[] args) {
        //演示 int  <--> Integer的拆箱和装箱
        //JDK5以前手动装箱和手动拆箱
        //手动装箱
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
        //手动拆箱
        int n2 = integer.intValue();

        //JDK5以后 自动装箱和自动拆箱
        //自动装箱  底层使用的是Integer.valueOf(n3)方法
        int n3 = 200;
        Integer integer2 = n3;
        //自动拆箱   底层使用的是integer2.intValue()方法
        int n4 = integer2;
        //todo:输出1.0   三元运算符的结果是最大的数据类型，包装类也一样
        Object obj = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj);

        //todo:包装类和String相互转换
        //1. 包装类转String
        //自动装箱
        //方式1：
        Integer integer3 = 100;
        String str1 = integer3 + "";
        //方式2：
        String str2= integer3.toString();
        //方式3：
        String str3 = String.valueOf(integer3);

        //String -> 包装类
        //方式1：
        String str4 = "1234";
        //Integer.parseInt(str4) 返回int
        //自动装箱
        Integer integer4 = Integer.parseInt(str4);
        //方式2： 使用构造器
        Integer integer5 = new Integer(str4);

        //包装类常用方法 -具体见API文档
        //返回最大值
        System.out.println(Integer.MAX_VALUE);
        //返回包装类最小值
        System.out.println(Integer.MIN_VALUE);
        //判断是不是数字
        System.out.println(Character.isDigit('a'));
        //判断是不是字母
        System.out.println(Character.isLetter('a'));
        //判断是不是大写
        System.out.println(Character.isUpperCase('a'));
        //判断是不是小写
        System.out.println(Character.isLowerCase('a'));
        //判断是不是空格
        System.out.println(Character.isWhitespace('a'));
        //转成大写
        System.out.println(Character.toUpperCase('a'));
        //转成小写
        System.out.println(Character.toLowerCase('A'));
    }
}
