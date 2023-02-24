package tankgame03;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;
import javax.swing.*;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/28 20:35
 * 坦克大战的绘图区
 */
public class MyPanel extends JPanel implements KeyListener,Runnable {
    /**
     * 坦克
     */
    Hero hero = null;
   static Shot shoot;
    /**
     * 敌人坦克
     */
    Vector<EnemyTank> enemyTanks = new Vector<>();
    /**
     * 敌人坦克数量
     */
    int enemyTankSize = 3;
    public MyPanel() {
        //初始化自己坦克位置
        hero = new Hero(100,100);
        //初始化敌人的坦克
        for (int i = 0;i < enemyTankSize;i ++){
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            enemyTank.setDirect(2);
            enemyTanks.add(enemyTank);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //填充矩形默认为黑色--绘制游戏界面大小
        g.fillRect(0,0,1000,750);
        drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),0);
        //画出发射的子弹
        if (hero.shot != null && hero.shot.isLive){
            g.setColor(Color.red);
           // g.fill3DRect(hero.shot.x,hero.shot.y,1,1,false);
            g.draw3DRect(hero.shot.x,hero.shot.y,1,1,false);
        }
        //画敌人的坦克
        for (int i = 0;i < enemyTanks.size();i ++){
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),1);
        }
    }

    /**
     * 绘制坦克
     * @param x  坦克左上角x坐标
     * @param y  坦克左上角y坐标
     * @param g  画笔
     * @param direct  方向(上下左右) (0:向上  1:向右 2:向下 3:向左)
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
       //根据坦克的方方向绘制坦克(0:向上  1:向右 2:向下 3:向左)
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
                //向右
            case 1:
                //绘制坦克
                //坦克左上边轮子
                g.fill3DRect(x,y,60,10,false);
                //坦克身体
                g.fill3DRect(x + 10,y + 10,40,20,false);
                //坦克的旋转台
                g.fillOval(x + 20,y + 10,20,20);
                //坦克炮管
                g.drawLine(x + 30,y + 20,x + 60,y + 20);
                //坦克下边轮
                g.fill3DRect(x ,y + 30,60,10,false);
                break;
                //向下
            case 2:
                //绘制坦克
                //坦克左边轮子
                g.fill3DRect(x,y,10,60,false);
                //坦克身体
                g.fill3DRect(x + 10,y + 10,20,40,false);
                //坦克的旋转台
                g.fillOval(x + 10,y + 20,20,20);
                //坦克炮管
                g.drawLine(x + 20,y + 30,x + 20,y + 60);
                //坦克右轮
                g.fill3DRect(x + 30,y,10,60,false);
                break;
                //向左
            case 3:
                //坦克左上边轮子
                g.fill3DRect(x,y,60,10,false);
                //坦克身体
                g.fill3DRect(x + 10,y + 10,40,20,false);
                //坦克的旋转台
                g.fillOval(x + 20,y + 10,20,20);
                //坦克炮管
                g.drawLine(x + 30,y + 20,x ,y + 20);
                //坦克下边轮
                g.fill3DRect(x ,y + 30,60,10,false);
                break;
            default:
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * 通过监听按钮，修改坦克方向
     * @param e 事件
     */
    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W){
            //向上
            //修改方向
            hero.setDirect(0);
            //修改坦克坐标
           // hero.setY(hero.getY() - 2);
            hero.moveUp();
        }else if (e.getKeyCode() == KeyEvent.VK_D){
            //向右
            hero.setDirect(1);
            //hero.setX(hero.getX() + 2);
            hero.moveRight();
        }else if (e.getKeyCode() == KeyEvent.VK_S){
            //向下
            hero.setDirect(2);
            //hero.setY(hero.getY() + 2);
            hero.moveDown();
        }else if (e.getKeyCode() == KeyEvent.VK_A){
            //向左
            hero.setDirect(3);
            //hero.setX(hero.getX() - 2);
            hero.moveLeft();
        }else if (e.getKeyCode() == KeyEvent.VK_J){
           //如果输出j则发射子弹
            hero.shotEnemyTank();
        }
        //重新绘制
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    /**
     * 每隔100毫秒刷新区域
     */
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("1111111111111111111111");
            //重新绘制
            this.repaint();
        }
    }
}
