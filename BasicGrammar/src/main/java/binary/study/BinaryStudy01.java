package binary.study;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/20 20:25
 * @Version 1.0
 */
public class BinaryStudy01 {
    /**
     * 几种进制
     */
    public static void main(String[] args) {
        //二进制
        int num1 = 0b1011;
        //十进制
        int num2 = 1011;
        //八进制
        int num3 = 01011;
        //十六进制
        int num4 = 0x1011;
        //都按照十进制输出
        //11
        System.out.println("num1 =  " + num1);
        //1011
        System.out.println("num2 =  " + num2);
        //521
        System.out.println("num3 =  " + num3);
        //4113
        System.out.println("num4 =  " + num4);
    }
}
