package homework.homework01;

import java.time.Instant;
import study.threadexit.T;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/31 15:42
 * 1.在主线程中启动两个线程
 * 2.第1个线程循环随机待遇100以内的整数
 * 3.直到第2个线程从键盘读取到"Q"命令时结束两个线程
 * todo: 思路1：以通知的方式结束线程1
 *       思路2：可以将线程1设置为守护线程
 */
public class Homework01 {
    public static void main(String[] args) {
        OutputThread outputThread = new OutputThread();
        Thread output = new Thread(outputThread);
        Thread input = new Thread(new InputThread(outputThread));
        output.start();
        input.start();
    }
}
