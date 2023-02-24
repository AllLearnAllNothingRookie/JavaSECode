package study.superstudy.study.superdetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/25 10:32
 */
public class SuperDetail {
    public static void main(String[] args) {
        Current current = new Current();
        current.testFiled();
        current.testMethod();
        current = new Current("rookie",23,"IT",13564,100);

    }
}
