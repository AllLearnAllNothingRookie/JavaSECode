package study.time;

import java.util.Calendar;
import sun.misc.Cleaner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/2 22:12
 * todo:第二代时间类Calendar(日历类)
 *  public abstract class Calendar implements Serializable, Cloneable, Comparable<Calendar>
 *      Calendar类是一个抽象类，它为特定瞬间与一组如YEAR、MONTH、DAY_OF_MONTH、HOUR
 *      等日历字段之间的转换提供了一些方法，并为操作日历自带吧提供了一些方法
 *     1.Calendar类是一个抽象类,并且构造器是私有化的，可以通过getInstance()来获取实例
 *     2. Calendar类提供了大量的方法和字段
 *     3.Calendar没有提供对应的格式化类，需要自行组合输出
 *     4.如果需要按照24小时进制获取时间Calendar.HOUR 替换为Calendar.HOUR_OF_DAY
 */
public class CalendarStudy {
    public static void main(String[] args) {
        //创建日历对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        //2.获取日历对象中的某个字段
        System.out.println(calendar.get(Calendar.YEAR));
        // 月份从0开始范围为[0,11],因此获取当前月份时需要加一
        System.out.println(calendar.get(Calendar.MONDAY) + 1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        //12小时格式
        System.out.println(calendar.get(Calendar.HOUR));
        //24小时格式
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        //Calendar没有专门的格式化方法，所以需要程序员自己组合显示
        System.out.println(calendar.get(Calendar.YEAR) + "年" + (calendar.get(Calendar.MONTH) + 1) +
                "月" + calendar.get(Calendar.DAY_OF_MONTH) + "日 " + calendar.get(Calendar.HOUR) + "时" +
                calendar.get(Calendar.MINUTE) + "分" + calendar.get(Calendar.SECOND) + "秒");
    }
}
