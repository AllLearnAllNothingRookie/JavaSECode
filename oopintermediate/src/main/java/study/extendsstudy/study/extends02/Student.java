package study.extendsstudy.study.extends02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/21 21:46
 * 学生类
 *
 *
 *
 * todo: 继承：继承可以解决代码复用，当多个类存在相同属性(变量)和方法时可以从这些类中
 *            抽象出父类在父类中定义这些相同的属性和方法，所以的子类不需要重新定义
 *            这些属性和方法，只需要通过extends来声明继承父类即可。
 *        继承的语法:
 *          class 子类 extends 父类{
 *              //子类特有的属性和方法
 *          }
 *        1.子类会自动拥有父类中定义的属性和方法
 *        2.父类又叫超类，基类
 *        3.子类又叫派生类
 *      继承的好处:
 *          1.提高了代码的复用性
 *          2.提高了代码的拓展性和维护性
 */
public class Student {
    //共有的属性
    public String name;
    public int age;
    private double score;

    //共有的方法

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public void info(){
        System.out.println("姓名:" + name + "\t年龄:" + age + "\t分数:" + score);
    }
}
