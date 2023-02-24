package study.getcpunum;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/29 20:28
 */
public class CpuNum    {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //获取当前计算机cpu数量/核心数
        int cpuNum = runtime.availableProcessors();
        System.out.println("当前计算机cpu个数为:" + cpuNum);
    }
}
