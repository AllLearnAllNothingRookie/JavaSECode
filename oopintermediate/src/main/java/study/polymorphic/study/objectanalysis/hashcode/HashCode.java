package study.polymorphic.study.objectanalysis.hashcode;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/30 14:22
 * todo: Object对象会更具不同的对象返回不同的整数(这一般是通过将该对象的内部地址转换成一个整数
 *      来实现的)
 *       小结:
 *           1.hashCode方法能够提高具有哈希结构容器的效率
 *           2.两个引用,如果指向的是同一个对象,则哈希值肯定是一样的
 *           3.两个引用,如果指向的是不同对象,则哈希值是不一样的
 *           4.哈希值只要是更具地址来的,但是不能完全将哈希值等价于地址
 *           5.集合中hashCode如果需要的话,也会重写
 */
public class HashCode {
    public static void main(String[] args) {
        AA a = new AA();
        AA aa = new AA();
        AA aaa = aa;
        System.out.println("a.hashCode() = " + a.hashCode());
        System.out.println("aa.hashCode() = " + aa.hashCode());
        System.out.println("aaa.hashCode() = " + aaa.hashCode());

    }
}
