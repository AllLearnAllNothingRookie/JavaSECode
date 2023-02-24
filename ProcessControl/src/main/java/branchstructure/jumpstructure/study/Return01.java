package branchstructure.jumpstructure.study;

import java.nio.channels.NonReadableChannelException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/6 22:33
 */
public class Return01 {
    public static void main(String[] args) {
        for (int i = 0;i <= 5;i ++){
            if (i == 3){
               // break;
               // continue;
                return;
            }
            System.out.println(i);
        }
        System.out.println("go on ……");
    }
}
