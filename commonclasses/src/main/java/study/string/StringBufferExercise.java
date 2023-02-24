package study.string;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/2 15:05
 * 要求价格的小数点前每三位用逗号分隔如 123,456.78964
 */
public class StringBufferExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入金额:");
        double price = input.nextDouble();
        String str = price + "";
        StringBuffer sb = new StringBuffer();
        int count = 0;
        System.out.println(str);
        String[] split = str.split("[.]");
        //对字符串进行循环
        for (int i = split[0].length() - 1;i >= 0;i --){
            count ++;
            sb.insert(0,split[0].charAt(i) );
                if (count % 3 == 0 &&  i != 0){
                    sb.insert(0,',');
                }
            }
        if (split.length == 2){
            sb.append(".");
            sb.append(split[1]);
        }
        System.out.println(sb);

        //思路2：找到小数点在小数点前3为插入一个逗号
        System.out.println("请输入金额:");
        String priceStr = "123.89";
        StringBuffer stringBuffer = new StringBuffer(priceStr);
        int index = stringBuffer.lastIndexOf(".");
        if (index == -1){
            for (int i = sb.length() - 3;i > 0; i -=3){
                stringBuffer.insert(i,",");
            }
        }else {
            for (int i = index - 3;i > 0;i -= 3){
                stringBuffer.insert(i,",");
            }
        }
        System.out.println(stringBuffer);
    }
}
