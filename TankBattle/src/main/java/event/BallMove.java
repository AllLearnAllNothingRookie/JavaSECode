package event;

import javax.swing.*;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/28 21:51
 * 使用键盘控制小球移动  -- java事件控制
 */
public class BallMove extends JFrame {
    MyPanel myPanel;
    public static void main(String[] args) {
        new BallMove();
    }
    public BallMove(){
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(400,300);
        //可以监听到面板发生的键盘事件
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
