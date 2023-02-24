package homework.homework01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/3 10:30
 * 将字符串中指定的位置进行反转
 */
public class HomeWork01 {
    public static void main(String[] args) {
        String str = "123456";
        String reverse = reverse(str, 0, 5);
        System.out.println(reverse);
        str = "123456";
        reverse = reverse(str, 0, 4);
        System.out.println(reverse);
    }

    /**
     *  其他方法:可以将字符串转换为数组对数组进行操作
     * @param str
     * @param start
     * @param end
     * @return
     */
    public static  String reverse(String str,int start,int end){
        //todo:验证时写出正确的情况取反则是不正确的
        if (str != null){
            throw new NullPointerException("str不能为null");
        }
        //判断范围
        if (start < 0 || end >= str.length()){
            throw new StringIndexOutOfBoundsException("字符串下标不符合规范");
        }
        if (start > end){
            throw new StringIndexOutOfBoundsException("start必须小于end");
        }
        //先将截取0-start处的字符到新的字符串中
        StringBuilder sb = new StringBuilder(str.length());
        if (start != 0){
            sb.append(str.substring(0,start));
        }
        //对指定位置的字符串进行反转
        for (int i = end ;i >= start;i --){
            sb.append(str.charAt(i));
        }
        //截取end-str.length()处的字符到新的字符串中
        if (end < str.length() - 1){
            sb.append(str.substring(end + 1,str.length()));
        }
        return sb.toString();
    }
}
