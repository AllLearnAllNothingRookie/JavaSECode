package study.importexception;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/28 14:54
 * todo: NullPointerException 空指针异常
 *      当应用程序试图在需要对象的地方使用null时，抛出该异常
 *
 */
public class NullPointerExceptionStudy {
    public static void main(String[] args) {
        String name = null;
        System.out.println(name.length());
    }
}
