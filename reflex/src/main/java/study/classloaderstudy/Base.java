package study.classloaderstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 21:04
 */
public class Base {
    private static int a = getNum() ;
    static {
        ++a;
        System.out.println("(2)a = " + a);
    }
    static {
        ++a;
        System.out.println("(3)a = " + a);
    }
    public static int getNum(){
        System.out.println("(1)a = " + a);
        return 1;
    }
}
