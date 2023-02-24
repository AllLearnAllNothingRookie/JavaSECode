package typeconversion.stringbasic;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/10/2 20:53
 * @Version 1.0
 * String基本类型转换细节
 */
public class StringToBasicDetail {
    public static void main(String[] args) {
        // 1. 在将Sting类型转换为基本数据类型时，要确保Sting类型能够转成有效的数据
        // 比如可以将"123"转换成一个整数，但是不能将"hello"转成一个整数
        // 2. 如果格式不正确，就会抛出异常，程序就会终止
        String str1 = "123";
        //正确
        int n1 = Integer.parseInt(str1);
        System.out.println(n1);
        String str2 = "1hello2";
        //报错  java.lang.NumberFormatException: For input string: "1hello2"
       //  int n2 = Integer.parseInt(str2);
       //  System.out.println(n2);
        //注意: String -> boolean  如果字符串是"true"则转换后结果为true 反之转换后结果为false
        String str3 = "true";
        String str4 = "false";
        //false
        boolean b1 = Boolean.parseBoolean(str1);
        System.out.println(b1);
        //false
        boolean b2 = Boolean.parseBoolean(str2);
        System.out.println(b2);
        // true
        boolean b3 = Boolean.parseBoolean(str3);
        System.out.println(b3);
        //false
        boolean b4 = Boolean.parseBoolean(str4);
        System.out.println(b4);
    }
}
