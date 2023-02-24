package study.reflection.getclassmsg;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 14:49
 */
public class SuperClassTest {
    public static void main(String[] args) {
        //类中
        System.out.println(Integer.class.getSuperclass());
        //基本数据类型
        System.out.println(int.class.getSuperclass());
        //void
        System.out.println(void.class.getSuperclass());
        //接口
        System.out.println(Runnable.class.getSuperclass());
        //基本数据类型数组
        System.out.println(int[].class.getSuperclass());
        //引用类型数组
        System.out.println(String[].class.getSuperclass());
    }
}
