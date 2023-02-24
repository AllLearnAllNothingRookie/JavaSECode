package alanrookie.study.thisdetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 16:05
 */
public class ThisDetailTest {
    public static void main(String[] args) {
        ThisDetail thisDetail = new ThisDetail();
        System.out.println(thisDetail.name + " : " + thisDetail.age);
        thisDetail.fun01();
        ThisDetail thisDetail1 = new ThisDetail("hh");
        System.out.println(thisDetail1.name + " : " + thisDetail1.age);
        ThisDetail thisDetail2 = new ThisDetail(20);
        System.out.println(thisDetail2.name + " : " + thisDetail2.age);
    }
}
