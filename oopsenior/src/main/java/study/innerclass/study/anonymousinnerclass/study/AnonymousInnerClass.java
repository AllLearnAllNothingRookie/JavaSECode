package study.innerclass.study.anonymousinnerclass.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/11 12:42
 * todo:匿名内部类
 *      匿名内部类本质是类,是一个内部类,该类没有名字,同时还是一个对象
 *      说明:匿名内部类是定义在外部类的局部位置,比如方法中,并且没有类名
 *      1.匿名内部类的基本语法
 *      new 类或接口(参数列表){
 *          类体
 *      }
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();
    }
}
