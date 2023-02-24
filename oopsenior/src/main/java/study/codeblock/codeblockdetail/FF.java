package study.codeblock.codeblockdetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/6 22:00
 */
public class FF {
    public static  String name = "FF";
    static {
        System.out.println("FF的静态代码块");
    }
    {
        System.out.println("FF的普通代码块");
    }
}
