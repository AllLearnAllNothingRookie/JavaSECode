package tankgame;

import java.awt.*;
import javax.swing.*;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/28 20:38
 */
public class TankGame01 extends JFrame {
    MyPanel myPanel = null;
    public static void main(String[] args) {
        new TankGame01();
    }

    public TankGame01() {
        myPanel = new MyPanel();
        //加入面板即游戏的绘图区
        this.add(myPanel);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
