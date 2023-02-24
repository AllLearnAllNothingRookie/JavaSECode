package tankgame03;

import javax.swing.*;


/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/28 20:38
 */
public class TankGame03 extends JFrame {
    MyPanel myPanel = null;
    public static void main(String[] args) {
        new TankGame03();
    }

    public TankGame03() {
        myPanel = new MyPanel();
        //启动面板线程
        new Thread(myPanel).start();
        Shot.myPanel = myPanel;
        //加入面板即游戏的绘图区
        this.add(myPanel);
        this.setSize(1000,750);
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
