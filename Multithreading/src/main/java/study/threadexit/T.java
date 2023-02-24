package study.threadexit;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/30 14:08
 */
public class T extends Thread{
    int count = 0;
    /**
     * 设置一个控制变量
     */
    private boolean loop = true;
    @Override
    public void run() {
        //每隔50毫秒输出一句话
        while (loop){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("T 运行中....." + (++count));
        }
    }

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
