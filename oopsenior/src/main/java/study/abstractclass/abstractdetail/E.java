package study.abstractclass.abstractdetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/8 22:17
 * todo:抽象类细节:
 *   1.抽象类不能被实例化
 *   2.抽象类不一定要包含抽象方法,也就是说抽象类可以没有abstract方法
 *   3.一旦类包含了abstract方法,则那个类必须被声明为abstract类
 *   4.abstract只能修饰类和方法,不能修饰属性和其他的
 *   5.抽象类可以有任意成员[抽象类的本质还是类]即一个类有的成员抽象类有
 *      ,比如:非抽象方法,构造器,静态属性等等
 *   6.抽象方法不能有方法体,即不能实现
 *      访问修饰符 abstract 方法名(参数列表);  //正确
 *      访问修饰符 abstract 方法名(参数列表){}  //错误
 *      访问修饰符 abstract 方法名(参数列表){
 *          方法体
 *      }  //错误
 *   7.如果一个类继承了抽象类,则他必须实现抽象类中所有的抽象方法,除非它自己也定义为抽象类
 *      1.抽象类继续抽象类可以实现父类抽象类中的部分方法,
 *       也可以实现全部方法,也可以不实现任何方法
 *      2.非抽象类继承抽象类必须实现抽象类中所有的方法
 *   8.抽象方法不能使用private,final,static来修饰,因为这些关键字和重写是相违背的。
 */
public abstract class E extends D{
    /**
     * todo:抽象类继续抽象类可以实现父类抽象类中的部分方法,
     *      也可以实现全部方法,也可以不实现任何方法
     */
    @Override
    public void eat() {
        System.out.println("吃饭");
    }

}
