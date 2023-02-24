package study.staticstudy.staticmethod;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/4 23:18
 * todo: 类方法介绍:
 *      类方法也叫静态方法
 *      语法格式:
 *          1.访问修饰符  static 数据返回类型  方法名(){} [推荐]
 *          2.static  访问修饰符   数据返回类型  方法名(){}
 *       类方法的调用: 前提要满足访问修饰符的访问权限和范围
 *          1.类名.类方法名  [推荐]
 *          2.对象名.类方法名
 *   todo:类方法的经典使用场景:
 *        当方法中不涉及到任何和对象相关的成员,则可以将方法设计成静态方法提高开发效率
 *       如:工具类中的方法
 * 统计学生学费总和
 */
public class StaticMethod {
    public static void main(String[] args) {
        Student tom = new Student("tom");
        tom.playFee(3457.9);
        //使用 类名.静态方法名 访问
        Student.showFee();
        Student jack = new Student("jack");
        jack.playFee(3456.99);
        //使用 对象名.静态方法名 访问
        jack.showFee();
        //使用工具类
        System.out.println(MyTools.calSum(10,20));
    }
}
