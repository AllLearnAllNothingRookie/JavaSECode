package operator.study;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/20 14:21
 * @Version 1.0
 */
public class LogicOperator {
    /**
     * 逻辑运算符
     */
    public static void main(String[] args) {
        int age = 50;
        if (age > 18 && age < 90){
            System.out.println("ok100");
        }
        if (age > 18 & age < 90){
            System.out.println("ok100");
        }
        if (age > 18 && age < 30){
            System.out.println("ok200");
        }
        if (age > 18 & age < 30){
            System.out.println("ok200");
        }

        int a = 4;
        int b = 9;
        //对于&&短路于而言，如果第一个条件为false，后面的条件不在判断
        //对于&逻辑与而言，如果第一个条件为false，后面的条件仍然会判断
    /*    if (a < 1 && ++b < 50){
            System.out.println("0k300");
        }
        System.out.println("a = " + a + "\tb=" + b);*/
        if (a < 1 & ++b < 50){
            System.out.println("0k300");
        }
        System.out.println("a = " + a + "\tb=" + b);
    }
}
