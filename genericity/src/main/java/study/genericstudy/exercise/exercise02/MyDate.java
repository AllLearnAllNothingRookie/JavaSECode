package study.genericstudy.exercise.exercise02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/19 14:24
 */
public class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    @Override
    public int compareTo(MyDate o) {
        //比较年  年份越小  年龄越大
        if (this.year - o.year > 0){
            return  -1;
        }else if (this.year - o.year < 0){
            return  1;
        }else {
            //年相同比较月   相同年 月份越小 年龄越大
            if (this.month - o.month > 0){
                return  -1;
            }else if (this.month - o.month < 0){
                return  1;
            }else {
                //年月相同比较日  相同的年月 日期越小 年龄越大
                if (this.day - o.day > 0){
                    return  -1;
                }else if (this.day - o.day < 0){
                    return  1;
                }else {
                    return  0;
                }
            }
        }
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return  year +
                " 年 " + month +
                " 月 " + day +
                " 日";
    }
}
