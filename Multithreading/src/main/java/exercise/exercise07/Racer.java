package exercise.exercise07;

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
    private volatile boolean finished;
    /**
     * 用于标记是否继续跑，即线程结束的标记
     */
    private boolean runFlag = true;

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
        while (sum < distance && runFlag){
            System.out.println(name + "正在努力奔跑");
            try {
                Thread.sleep(runTime);
            } catch (InterruptedException e) {
                System.out.println(name + "未到达终点就停止");
                runFlag = false;
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
                    System.out.println(name + "未到达终点就停止");
                    runFlag = false;
                    //throw new RuntimeException(e);
                    return;
                }
            }
        long end = System.currentTimeMillis();
        time = end - start;
        System.out.println(name + "跑了" + sum + "米，已经到达终点，用时" +( (double) time / 1000.0) + "秒");
        finished = sum == distance ? true : finished;
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

    public boolean isRunFlag() {
        return runFlag;
    }

    public void setRunFlag(boolean runFlag) {
        this.runFlag = runFlag;
    }
}
