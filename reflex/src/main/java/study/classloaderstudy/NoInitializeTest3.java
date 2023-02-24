package study.classloaderstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 22:12
 * todo:使用某个类声明数组不会导致该类初始化
 */
public class NoInitializeTest3 {
    public static void main(String[] args) {
        MyClass[] arr = new MyClass[5];
        System.out.println(arr.length);
    }
}
