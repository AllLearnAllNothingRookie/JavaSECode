package homework.homework03;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/27 14:12
 */
public class CellPhone {
    public void testWork(){
        Computer computer = new Computer() {
            @Override
            public void work(int n1,int n2) {
                System.out.println("进行运算");
                System.out.println(n1 + n2);
            }
        };
        computer.work(10,20);
    }
    public void testWork(Computer computer,int d1,int d2){
        computer.work(d1,d2);
    }
}
