package tankgame;

import java.awt.*;
import javax.swing.*;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/28 20:35
 * 坦克大战的绘图区
 */
public class MyPanel extends JPanel {
    /**
     * 坦克
     */
    Hero hero = null;

    public MyPanel() {
        //初始化坦克位置
        hero = new Hero(100,100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //填充矩形默认为黑色--绘制游戏界面大小
        g.fillRect(0,0,1000,750);
        drawTank(hero.getX(),hero.getY(),g,0,1);

    }

    /**
     * 绘制坦克
     * @param x  坦克左上角x坐标
     * @param y  坦克左上角y坐标
     * @param g  画笔
     * @param direct  方向(上下左右)
     * @param type  坦克类型(0：我们的坦克，1.敌人的坦克)
     */
    public static void drawTank(int x,int y,Graphics g,int direct,int type){
        //根据坦克的类型调整颜色
       switch (type){
           case 0:
               g.setColor(Color.cyan);
               break;
           case 1:
               g.setColor(Color.yellow);
               break;
           default:
       }
       //根据坦克的方方向绘制坦克
        switch (direct){
            //向上
            case 0:
                //绘制坦克
                //坦克左边轮子
                g.fill3DRect(x,y,10,60,false);
                //坦克身体
                g.fill3DRect(x + 10,y + 10,20,40,false);
                //坦克的旋转台
                g.fillOval(x + 10,y + 20,20,20);
                //坦克炮管
                g.drawLine(x + 20,y + 30,x + 20,y);
                //坦克右轮
                g.fill3DRect(x + 30,y,10,60,false);
                break;
            default:
        }
    }
}
