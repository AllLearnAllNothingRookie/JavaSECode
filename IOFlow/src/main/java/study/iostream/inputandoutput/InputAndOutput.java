package study.iostream.inputandoutput;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/8 21:00
 * todo:标准输入输出流
 *                                     类型               默认设备
 *      System.in  标准输入           InputStream          键盘
 *      System.out 标准输出           PrintStream          显示器
 *todo: System.in  public final static InputStream in = null;
 *      System.in 编译类型   InputStream
 *      System.in 运行类型   BufferedInputStream
 *todo:System.out   public final static PrintStream out = null;
 *      System.out  编译类型   PrintStream
 *      System.out  运行类型   PrintStream
 */
public class InputAndOutput {
    public static void main(String[] args) {
        /**
         * System.in  public final static InputStream in = null;
         *      System.in 编译类型   InputStream
         *      System.in 运行类型   BufferedInputStream
         * 表示标准输入  键盘
         */
        System.out.println(System.in.getClass());
        /**
         * System.out   public final static PrintStream out = null;
         *     System.out  编译类型   PrintStream
         *     System.out  运行类型   PrintStream
         * 表示标准输出  显示器
         */
        System.out.println(System.out.getClass());
    }
}
