package exercise.exercise13;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/2 15:48
 */
public class Waiter extends Thread{
    private Workbench workbench;

    public Waiter(Workbench workbench) {
        this.workbench = workbench;
    }

    @Override
    public void run() {
       while (true){
           workbench.take();
       }
    }
}
