package draw;

import javax.swing.*;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/28 14:51
 * java演示在画板上画圆
 */
public class DrawCircle extends JFrame {
    //JFrame:可以看作一个窗口
    //定义一个面板
    private MyPanel panel;
    public static void main(String[] args) {
        new DrawCircle();
    }
    public DrawCircle(){
        //初始化面板
        panel = new MyPanel();
        //将面板放入到窗口中
        this.add(panel);
        //设置窗口大小
        this.setSize(1000,3000);
        //当点击窗口退出时，程序完全退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置可视
        this.setVisible(true);
    }
}
