package typeconversion.forceconversion.study;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/10/2 19:49
 * @Version 1.0
 * 强制类型转换
 */
public class ForceConvert {
    public static void main(String[] args) {
        //会造成精度损失
        int num = (int) 1.9;
        // 1
        System.out.println(num);
        int num1 = 1000;
        //会造成数据溢出
        byte b = (byte) num1;
        System.out.println(b);
    }
}
