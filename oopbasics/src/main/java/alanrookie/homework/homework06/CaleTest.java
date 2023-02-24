package alanrookie.homework.homework06;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 19:32
 */
public class CaleTest {
    public static void main(String[] args) {
        Cale cale = new Cale(6,3);
        double add = cale.add();
        double diff = cale.diff();
        double ride = cale.ride();
        Double merchant = cale.merchant();
        if (merchant == null){
            System.out.println("除数不能为0");
        }
        System.out.println("和为:" + add + "\t差为:" + diff +"\t乘积为:" + ride +"\t商为:" + merchant);
        Cale cale1 = new Cale(5,0);
         add = cale1.add();
         diff = cale1.diff();
         ride = cale1.ride();
        merchant = cale1.merchant();
        if (merchant == null){
            System.out.println("除数不能为0");
        }
        System.out.println("和为:" + add + "\t差为:" + diff +"\t乘积为:" + ride +"\t商为:" + merchant);
    }
}
