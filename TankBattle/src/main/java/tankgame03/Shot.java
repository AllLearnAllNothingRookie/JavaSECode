package tankgame03;

import java.awt.*;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/3 20:20
 */
public class Shot implements Runnable{
    static MyPanel myPanel;
    /**
     * 发射炮弹的x坐标
     */
     int x ;
    /**
     * 发射跑弹的y坐标
     */
    int y;
    /**
     * 炮弹方向 (0:向上  1:向右 2:向下 3:向左)
     */
    int direct;
    /**
     * 炮弹速度
     */
    int speed = 10;
    /**
     * 当前子弹是否存活
     */
    boolean isLive = true;
    public Shot(int x, int y,int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        //子弹出边界 或打中敌人是消失
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            switch (direct){
                case 0:
                    y -= speed;
                    break;
                case 1:
                    x += speed;
                    break;
                case 2:
                    y += speed;
                    break;
                case 3:
                    x -= speed;
                    break;
                default:
            }
            if (!(x >= 0 && x <= 1000 && y >=0 && y <= 750)){
                System.out.println("子弹线程退出");
                isLive = false;
                break;
            }
            System.out.println(x + "-" + y);
        }
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

}
