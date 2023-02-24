package study.interfacestudy.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/9 16:31
 * todo:接口就是给出一些没有实现的方法,封装到一起,当木某个类要使用的时候,在根据具体情况把这些方法
 *      写出来
 *     语法:
 *      interface 接口名{
 *           //属性
 *          //方法
 *      }
 *      实现接口语法:
 *      访问权限修饰符 class 类名 implements 接口名{
 *          //类的属性
 *          //类的方法
 *          //实现接口中的方法[必须实现接口的全部抽象方法]
 *      }
 *      小结:
 *         1.在JDK7.0前接口中所有的方法都没有方法体[即全部是抽象方法]
 *         2.在JDK8.0以后接口中可以有静态方法,默认方法,也就是说接口中可以有具体实现
 */
public class InterfaceStudy {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Phone phone = new Phone();
        Computer computer = new Computer();
        //把手机接入到计算机
        computer.work(phone);
        //把相机接入工作
        computer.work(camera);
    }
}
