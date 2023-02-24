package study.importexception;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/28 15:09
 * todo:NumberFormatException 数子格式不正确异常
 *    当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适当格式时，抛出该异常
 */
public class NumberFormatExceptionStudy {
    public static void main(String[] args) {
        String str = "2343q";
        //当字符串是非整数时，就会发生数字格式化异常
        //java.lang.NumberFormatException: For input string: "2343q"
        int num = Integer.parseInt(str);
        System.out.println(num);
    }
}
