package homework.homework01;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/31 15:45
 */
public class InputThread implements Runnable{
    OutputThread outputThread;

    public InputThread(OutputThread outputThread) {
        this.outputThread = outputThread;
    }

    Scanner input = new Scanner(System.in);
    @Override
    public void run() {
        while (true){
            System.out.println("请输入字符[Q退出]:");
            String s = input.nextLine();
            char c = 'a';
            if (s.length() != 0){
                c = s.charAt(0);
            }
            if (c == 'Q'){
                outputThread.loop = false;
                break;
            }
        }
    }
}
