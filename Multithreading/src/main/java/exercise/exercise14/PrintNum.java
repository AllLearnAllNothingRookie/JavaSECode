package exercise.exercise14;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/2 21:00
 */
public class PrintNum implements  Runnable{
    private int num = 1;

    @Override
    public void run() {
      while (true){
          synchronized (this){
              try {
                  this.notify();
                  if (num > 100){
                      break;
                  }
                  System.out.println(Thread.currentThread().getName() + ":" +num);
                  num ++;
                  this.wait();
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
      }
    }
}
