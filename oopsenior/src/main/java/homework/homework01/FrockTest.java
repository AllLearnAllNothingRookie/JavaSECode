package homework.homework01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/27 14:00
 */
public class FrockTest {
    public static void main(String[] args) {
        System.out.println(Frock.getCurrentNum());
        System.out.println(Frock.getCurrentNum());
        Frock frock1 = new Frock();
        System.out.println(frock1.getSerialNumber());
        Frock frock2 = new Frock();
        System.out.println(frock2.getSerialNumber());
    }
}
