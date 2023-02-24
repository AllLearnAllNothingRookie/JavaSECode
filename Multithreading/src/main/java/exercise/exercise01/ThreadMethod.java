package exercise.exercise01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/1 15:44
 */
public class ThreadMethod {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 2;i <= 100;i += 2){
                    System.out.println("偶数线程：" + i);
                }
            }
        }).start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 1;i <= 100;i += 2){
                    System.out.println("奇数线程：" + i);
                }
            }
        }.start();
    }
}
