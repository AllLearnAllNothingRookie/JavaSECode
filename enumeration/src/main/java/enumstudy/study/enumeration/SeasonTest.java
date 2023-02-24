package enumstudy.study.enumeration;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/25 22:02
 */
public class SeasonTest {
    public static void main(String[] args) {
        //对于季节而言它的对象是固定的，不会有更多
        // 当前的设计实现不能体现出季节的固定 ==> 枚举：即把对象一个一个列举出来的类就称为枚举类
        Season spring = new Season("春天","温暖");
        Season winter = new Season("冬天","寒冷");
        Season summer = new Season("夏天","炎热");
        Season autumn = new Season("秋天","凉爽");

    }
}
