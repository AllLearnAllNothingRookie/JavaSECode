package branchstructure.homework;


/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/8 20:58
 *  某人有100000元，没经过一次路口，需要缴费
 *    当现金大于50000时每次交5%
 *    当现金小于50000时每次交1000
 */
public class HomeWork01 {
    public static void main(String[] args) {
        // 现金
        double money = 100000;
        // 经过得路口
        int count = 0;
        while (money >= 0){
            if (money >= 50000){
                money *= (1 - 0.05);
            }else if (money >= 1000){
                money -= 1000;
            }else {
                break;
            }
            count ++;
        }
        System.out.println("可以经过" + count + "个路口");
        System.out.println("最后剩余的现金为:" + money + "元");
    }
}
