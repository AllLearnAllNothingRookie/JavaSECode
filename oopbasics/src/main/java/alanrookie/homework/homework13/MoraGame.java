package alanrookie.homework.homework13;

import java.util.Random;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 23:28
 * 猜拳游戏 ：
 *  有个人Tom设计他的成员变量.成员方法,可以和电脑猜拳.
 *   电脑每次都会随机生成0,1,2
 *  0表示石头1表示剪刀2表示布并要可以显示Tom的输赢次数(清单)
 *
 */
public class MoraGame {
    /**
     * 玩家出的拳
     */
    int  player;
    /**
     * 电脑出的拳
     */
    int computer;
    /**
     * 玩家赢的次数
     */
    int winCount;
    /**
     * 游戏次数
     */
    int gameCount;

    /**
     * 设置玩家出的拳
     * @param player
     */
    public void setPlayer(int player){
        this.player = player;
    }

    /**
     * 生成电脑出的拳
     */
    public void setComputer(){
        Random random = new Random();
        //生成一个随机数
        computer = random.nextInt(3);
    }

    /**
     * 比较
     *  0表示石头1表示剪刀2表示布
     *
     * @return 输出结果
     */
    public String vs(){
        if (player == 0 && computer == 1){
            return "你赢了";
        }else if (player == 1 && computer == 2){
            return "你赢了";
        }else if (player == 3 && computer == 1){
            return "你赢了";
        }else if (player == computer){
            return "平局";
        }else {
            return "你输了";
        }
    }

}
