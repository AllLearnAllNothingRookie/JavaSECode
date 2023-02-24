package exercise.exercise05;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/1 20:57
 */
public class Racer extends Thread{
    /**
     * 运动员名字
     */
    private String name;
    /**
     * 每米需要时间，单位毫秒
     */
    private  long runTime;
    /**
     * 每10米的休息时间，单位毫秒
     */
    private long restTime;
    /**
     * 全程距离单位米
     */
    private long distance;
    /**
     * 跑完全程的总时间
     */
    private long time;
    /**
     * 是否跑完全程
     */
    private boolean finished;

    public Racer(String name, long distance, long runTime, long restTime) {
        this.name = name;
        this.runTime = runTime;
        this.restTime = restTime;
        this.distance = distance;
    }

    @Override
    public void run() {
        long sum = 0;
        long start = System.currentTimeMillis();
        while (sum < distance){
            System.out.println(name + "正在努力奔跑");
            try {
                Thread.sleep(runTime);
            } catch (InterruptedException e) {
                System.out.println(name + "在奔跑的时候发生了意外情况");
               // throw new RuntimeException(e);
                return;
            }
            sum ++;
                try {
                    if (sum % 10 == 0 && sum < distance) {
                        System.out.println(name + "已经跑了" + sum + "正在休息....");
                        Thread.sleep(restTime);
                    }
                } catch (InterruptedException e) {
                    System.out.println(name + "在奔跑的时候发生了意外情况");
                    //throw new RuntimeException(e);
                    return;
                }
            }
        long end = System.currentTimeMillis();
        time = end - start;
        System.out.println(name + "跑了" + sum + "米，已经到达终点，用时" +( (double) time / 1000.0) + "秒");
        finished = true;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
