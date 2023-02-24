package enumstudy.exercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/26 14:42
 */
public class WeekTest {
    public static void main(String[] args) {
        System.out.println("====所有星期的信息如下:====");
        Week[] weeks = Week.values();
        for (Week week : weeks) {
            System.out.println(week);
        }
    }
}
