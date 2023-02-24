package tankgame02;

import javax.swing.*;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/28 20:38
 */
public class TankGame02 extends JFrame {
    MyPanel myPanel = null;
    public static void main(String[] args) {
        new TankGame02();
    }

    public TankGame02() {
        myPanel = new MyPanel();
        //加入面板即游戏的绘图区
        this.add(myPanel);
        this.setSize(1000,750);
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
