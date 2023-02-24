package variable.study;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/9 21:28
 * @Version 1.0
 */
public class StringConvert {
    public static void main(String[] args) {
        /*
         * 基本类型  ->  String
         */
        int n1 = 100;
        float f1 = 1.1F;
        double d1 = 4.5;
        boolean b1 = true;
        //基本类型转String
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        /*
        * String -> 基本类型
         */
        String s5 = "123";
        //Sting转基本类型:使用基本类型对应的包装类里相应的方法，得到基本类型
        int num1 = Integer.parseInt(s5);
        double num2 = Double.parseDouble(s5);
        float num3 = Float.parseFloat(s5);
        long num4 = Long.parseLong(s5);
        byte num5= Byte.parseByte(s5);
        short num6 = Short.parseShort(s5);
        boolean num7 = Boolean.parseBoolean("true");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        //字符串转char:取出字符串里的某个字符
        char num8 = s5.charAt(0);
        System.out.println(num8);
        //如果字符串不是数字的话转换会出错
        String s6 = "hello";
        // 保存信息
        // Exception in thread "main" java.lang.NumberFormatException: For input string: "hello"
        int num9 = Integer.parseInt(s6);
    }
}
