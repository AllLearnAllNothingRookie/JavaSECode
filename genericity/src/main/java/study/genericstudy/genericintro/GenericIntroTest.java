package study.genericstudy.genericintro;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/18 16:40
 */
public class GenericIntroTest {
    public static void main(String[] args) {
        //泛型的数据类型时在创建类时指定的，即在编译期间确定数据类型
        GenericIntro<String> genericIntro = new GenericIntro<>("泛型学习");
        GenericIntro<Integer> genericIntro1 = new GenericIntro<>(100);
    }
}
