package typeconversion.stringbasic;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/10/2 20:28
 * @Version 1.0
 * String和基本类型之间的转换
 */
public class StringToBasic {
    public static void main(String[] args) {
        //基本类型转String
        //语法: 基本数据类型的值 +""
        int n1 = 10;
        float f1 = 1.1f;
        double d1 = 4.5;
        boolean b1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

        //String转基本类型
        String strInt = "123";
        //String -> int
        int numInt = Integer.parseInt(strInt);
        System.out.println(numInt);
        //String -> double
        String strDouble = "12.4";
        double numDouble = Double.parseDouble(strDouble);
        System.out.println(numDouble);
        //String -> byte
        String strByte = "12";
        byte numByte = Byte.parseByte(strByte);
        System.out.println(numByte);
        //String -> float
        String strFloat = "12.4";
        float numFloat = Float.parseFloat(strFloat);
        System.out.println(numFloat);
        //String -> short
        String strShort = "128";
        short numShort = Short.parseShort(strShort);
        System.out.println(numShort);
        //String -> long
        String strLong = "124854";
        long numLong = Long.parseLong(strLong);
        System.out.println(numLong);
        //String -> boolean
        String strBoolean = "123";
        //"true"转换后为true 否则转转为false
       boolean numBoolean = Boolean.parseBoolean(strBoolean);
        System.out.println(numBoolean);
        //String -> char
        String strChar = "aaaa";
        char numChar = strChar.charAt(0);
        System.out.println(numChar);
    }
}
