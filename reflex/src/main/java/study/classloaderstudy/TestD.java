package study.classloaderstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 21:34
 * todo:当使用反射相关API动态使用某个类时，会对该类进行初始化
 */
public class TestD {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        //该句不会造成类初始化，只是加载类
        cl.loadClass("study.classloaderstudy.D");
        System.out.println("类加载已经完成");
        //会导致类初始化
        Class.forName("study.classloaderstudy.D");
    }
}
