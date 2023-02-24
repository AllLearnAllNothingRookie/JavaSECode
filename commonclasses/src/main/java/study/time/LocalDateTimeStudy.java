package study.time;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/3 9:46
 * todo:第三代日期类
 *   前面两代日期类的不足：
 *      JDK1.0中包含了一个日期类java.util.Date类，但是它的大多数方法已经在JDK1.1引入
 *      Calender类之后被弃用了。
 *     Calendar存在的问题:
 *          1. 可变性:像日期时间这样的类应该是不可变的
 *          2. 偏移性:Date中的年份是从1900年开始的，而月份都从0开始
 *          3. 格式化:格式化只对Date有用，Calender则不行
 *          4. 此外，它们也不是线程安全的，不能处理闰秒(每隔两天，多出1s)
 *todo:第三代时间类 ：JDK8中加入 LocalDate(日期) LocalTime(时间) LocalDateTime(日期时间)
 *      LocalDate ： 只包含日期，可以获得日期字段
 *      LocalTime ：只包含时间，可以获取时间字段
 *      LocalDateTime ： 包含日期 + 时间 ，可以获取日期和时间字段
 *      Instant: 时间戳，类似Date提供了一系列和Date类转换的方式
 *todo：第三代日期格式化：DateTimeFormatter
 *      DateTimeFormatter使用和SimpleDateFormat类似
 *      DateTimeFormatter dtf = DateTimeFormatter.ofPattern(格式);
 *      String format = dtf.format(时间日期);
 */
public class LocalDateTimeStudy {
    public static void main(String[] args) {
        // 第三代日期类
        // 使用now()返回当前日期时间的对象
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println("年：" + dateTime.getYear());
        //返回对应的月份的英文表示
        System.out.println("月：" + dateTime.getMonth());
        //返回对应月份的数字表示
        System.out.println("月：" + dateTime.getMonthValue());
        System.out.println("日：" + dateTime.getDayOfMonth());
        System.out.println("时：" + dateTime.getHour());
        System.out.println("分：" + dateTime.getMinute());
        System.out.println("秒：" + dateTime.getSecond());
        //对时间进行操作
        //当前时间加天数
        LocalDateTime dateTime1 = dateTime.plusDays(4);
        System.out.println(dateTime1);
        //当前时间减天数
        LocalDateTime dateTime2 = dateTime.minusDays(3);
        System.out.println(dateTime2);
        //获取年月日
        LocalDate date  = LocalDate.now();
        System.out.println(date);
        System.out.println("年：" + date.getYear());
        //返回对应的月份的英文表示
        System.out.println("月：" + date.getMonth());
        //返回对应月份的数字表示
        System.out.println("月：" + date.getMonthValue());
        System.out.println("日：" + date.getDayOfMonth());

        //时间
        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println("时：" + time.getHour());
        System.out.println("分：" + time.getMinute());
        System.out.println("秒：" + time.getSecond());

        //第三代时间日期 格式化
        // DateTimeFormatter使用和SimpleDateFormat类似
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dtf.format(dateTime);
        System.out.println(format);
        //解析
        TemporalAccessor parse = dtf.parse("2023-01-03 10:11:28");
        System.out.println(parse);

        //Instant
        //通过now获取当前时间戳
        Instant instant = Instant.now();
        System.out.println(instant);
        //Instant转换为Date
        Date from = Date.from(instant);
        System.out.println(from);
        //Date -> Instant
        Instant instant1 = from.toInstant();
        System.out.println(instant1);
    }
}

