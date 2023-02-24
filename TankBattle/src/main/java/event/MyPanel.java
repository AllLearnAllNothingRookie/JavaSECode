package event;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/28 21:52
 * KeyListener :监听器，监听键盘事件
 */
public class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y =10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //填充小球 默认黑色
        g.fillOval(x,y,20,20);
    }

    /**
     * 监听字符输出 即 有字符输出时该方法就会触发
     * @param e 事件
     */
    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * 当某个键按下时，该方法会触发
     * @param e 事件
     */
    @Override
    public void keyPressed(KeyEvent e) {
       //System.out.println(e.getKeyCode() + "被按下");
        // System.out.println(e.getKeyChar() + "被按下");
        //根据用户按下的不同键，来处理小球移动


        if (e.getKeyCode() == KeyEvent.VK_DOWN){
            //向下
            y += 3;
        }else if (e.getKeyCode() == KeyEvent.VK_UP){
            //向上
            y -= 3;
        }else if (e.getKeyCode() == KeyEvent.VK_LEFT){
            //向左
            x -= 3;
        }else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            //向右
            x += 3;
        }
        //重新绘制
        this.repaint();
    }

    /**
     * 当某个键松开时，该方法会触发
     * @param e  事件
     */
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
