package tankgame03;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/28 20:34
 */
public class Tank {
    /**
     * 坦克的横坐标
     */
    private int x;
    /**
     * 坦克的纵坐标
     */
    private int y;
    /**
     * 坦克方向 (0:向上  1:向右 2:向下 3:向左)
     */
    private int direct;
    /**
     * 坦克速度
     */
    private int speed = 1;
    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * 向上移动
     */
    public void moveUp(){
        y -= speed;
    }

    /**
     * 向右移动
     */
    public void moveRight(){
        x += speed;
    }

    /**
     * 向下移动
     */
    public void moveDown(){
        y += speed;
    }

    /**
     * 向左移动
     */
    public void moveLeft(){
        x -=  speed;
    }

}
