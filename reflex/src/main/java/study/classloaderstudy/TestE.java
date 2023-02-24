package study.classloaderstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 21:43
 * todo"当初始化子类时，如果父类没有被初始化，则会先初始化父类
 */
public class TestE extends EBase{
    static {
        System.out.println("子类初始化");
    }

    public static void main(String[] args) {

    }
}
