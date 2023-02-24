package study.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/2 21:42
 * todo:第一代日期类Date
 *   Date:精确到毫秒，代表特定的瞬间
 *   SimpleDateFormat：格式和解析日期的类
 *   SimpleDateFormat格式化和解析日期的工具类，允许进行格式化(日期(Date) -> 文本(String))
 *        和解析(文本(String) -> 日期(Date))和规范化
 *
 */
public class DateStudy {
    public static void main(String[] args) throws ParseException {
        //获取当前系统时间
        //这里的Date为java.util.Date
        Date d1 = new Date();
        System.out.println("当前时间:" + d1);
        //对时间进行格式转换，可以指定相应的格式
        //这里格式使用的字符是规定好的
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String format = simpleDateFormat.format(d1);
        System.out.println(format);
        //通过指定毫秒数获取时间
        Date d2 = new Date(9234567);
        System.out.println(d2);
        format = simpleDateFormat.format(d2);
        System.out.println(format);

        //把一个格式化的字符串转换成对应的时间
        //此处的格式要和SimpleDateFormat的构造器中的时间一致，否则会报错
        String time = "2023年01月19日 10:33:54 星期四";
        Date parse = simpleDateFormat.parse(time);
        //输出时按照国外的格式
        System.out.println(parse);
        //获取时间对应的毫秒数
        System.out.println(parse.getTime());
    }
}
