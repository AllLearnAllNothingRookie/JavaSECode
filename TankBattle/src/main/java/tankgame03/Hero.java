package tankgame03;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/28 20:35
 */
public class Hero extends Tank {
    /**
     * 定义一个shot对象，表示射击
     */
    Shot shot = null;
    public Hero(int x, int y) {
        super(x, y);
    }

    /**
     * 创建shot对象，根据当前坦克的方向和位置
     */
    public void shotEnemyTank(){
        switch (getDirect()){
            case 0:
                shot = new Shot(getX() + 20,getY(),0);
                break;
            case 1:
                shot = new Shot(getX() + 60,getY() + 20,1);
                break;
            case 2:
                shot = new Shot(getX() + 20,getY() + 60,2);
                break;
            case 3:
                shot = new Shot(getX(),getY() + 20,3);
                break;
            default:
        }
        //启动子弹线程
        new Thread(shot).start();
    }
}
