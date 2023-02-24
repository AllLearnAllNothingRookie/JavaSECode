package homework.homework03;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/27 14:14
 */
public class CellPhoneTest {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.testWork();
        cellPhone.testWork(new Computer() {
            @Override
            public void work(int n1, int n2) {
                System.out.println("作为参数的匿名内部类");
                System.out.println(n1 + n2);
            }
        },30,40);
    }
}
