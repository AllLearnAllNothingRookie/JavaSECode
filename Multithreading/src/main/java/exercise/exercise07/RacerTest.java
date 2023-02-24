package exercise.exercise07;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/1 21:07
 * 编写龟兔赛跑多线程程序。假设赛跑长度为30米，兔子的速度为10米每秒，
 * 兔子跑完10米后休眠的时间为10秒；乌龟的速度为1米每秒，
 * 乌龟每跑完10米后休眠的时间为1秒。最后要等兔子和乌龟的线程结束，
 * 主线程才能公布最后的结果。
 */
public class RacerTest {
    public static void main(String[] args) throws InterruptedException {
        Racer rabbit = new Racer("兔子",30,100,10000);
        Racer tortoise = new Racer("乌龟",30,1000,1000);
        rabbit.start();
        tortoise.start();
        //让执行乌龟和兔子赛跑线程先执行完
        while (true){
            if (rabbit.isFinished() || tortoise.isFinished()){
                rabbit.setRunFlag(false);
                tortoise.setRunFlag(false);
                rabbit.interrupt();
                tortoise.interrupt();
                //只要有人跑完就结束比赛
                break;
            }else if (!rabbit.isRunFlag() && ! tortoise.isRunFlag()){
                //两个线程都遇到异常
                break;
            }
        }
        //宣布结果
        System.out.println("比赛结束");
        if (rabbit.isFinished() && tortoise.isFinished()){
            if (rabbit.getTime() < tortoise.getTime()){
                System.out.println("兔子赢");
            }else if (rabbit.getTime() > tortoise.getTime()){
                System.out.println("乌龟赢");
            }else {
                System.out.println("平局");
            }
        }else if (rabbit.isFinished() || tortoise.isFinished()){
            System.out.println(rabbit.isFinished() ? "兔子赢" : "乌龟赢");
        }else {
            System.out.println("兔子和乌龟都么有到达终点比赛取消");
        }
    }
}
