package study.polymorphic.study.objectanalysis.tostring;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/30 14:37
 * todo:
 *      Object类的toString方法源码:
 *           getClass().getName() + "@" + Integer.toHexString(hashCode());
 *           getClass().getName():类的全类名(包名 + 类名)
 *           Integer.toHexString(hashCode()):将对象的HashCode值转换为16进制
 *      基本介绍:
 *          1.toString方法默认返回:全类名 + @ + 哈希值的十六进制
 *              子类往往重写toString方法,用于返回对象的属性信息
 *          2.重写toString方法,打印对象或则是拼接对象时，都会自动调用该对象的toString方法
 *          3.直接输出一个对象时,toString方法会被默认调用
 */
public class ToString {
    public static void main(String[] args) {
        Monster monster = new Monster("tom","Java",11000);
        // todo:直接输出一个对象时,toString方法会被默认调用
        System.out.println(monster);
        System.out.println(monster.toString());
        Monster monster1 = new Monster("小旋风","巡山",4500);
        System.out.println(monster1);
        //todo:打印对象或则是拼接对象时，都会自动调用该对象的toString方法
        System.out.println("字符串拼接:\t" + monster1);
    }
}
