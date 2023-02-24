package study.staticstudy.staticmethod;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/4 23:22
 * todo: 类方法介绍:
 *      类方法也叫静态方法
 *      语法格式:
 *          1.访问修饰符  static 数据返回类型  方法名(){} [推荐]
 *          2.static  访问修饰符   数据返回类型  方法名(){}
 *       类方法的调用: 前提要满足访问修饰符的访问权限和范围
 *          1.类名.类方法名  [推荐]
 *          2.对象名.类方法名
 * 统计学生学费总和
 */
public class Student {
    /**
     * 学生姓名
     */
    private String name;
    /**
     * 累计学生学费
     */
    public  static  double totalMoney = 0;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 交学费
     */
    public void playFee(double fee){
        Student.totalMoney += fee;
    }

    /**
     * todo:当方法使用static修饰后方法为静态方法
     *      静态方法可以访问静态变量
     */
    public static void showFee(){
        System.out.println("总学费是:" + totalMoney);
    }
 }
