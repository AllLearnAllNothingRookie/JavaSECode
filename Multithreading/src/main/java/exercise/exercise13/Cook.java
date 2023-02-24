package exercise.exercise13;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/2 15:47
 */
public class Cook extends Thread {
    private Workbench workbench;

    public Cook(Workbench workbench) {
        this.workbench = workbench;
    }

    @Override
    public void run() {
       while (true){
           workbench.put();
       }
    }
}
