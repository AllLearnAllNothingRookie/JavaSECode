package study.innerclass.study.anonymousinnerclass.exercise.exercise02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/11 14:11
 */
public class Exercise {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了！！！");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了！！！");
            }
        });
    }
}
