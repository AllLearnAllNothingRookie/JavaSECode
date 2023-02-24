package study.classloaderstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 21:06
 */
public class ClinitTest extends Base{
    private static int b = getNum();
    static {
        ++b;
        System.out.println("(5)a = " + b);
    }
    static {
        ++b;
        System.out.println("(6)a = " + b);
    }
    public static int getNum(){
        System.out.println("(4)a = " + b);
        return 1;
    }
    public static void main(String[] args) {

    }
}
