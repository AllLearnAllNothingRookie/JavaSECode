package study.polymorphic.study.instanceofstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/27 21:34
 *  todo:
 *      instanceof:比较操作符
 *        使用 引用名 instanceof 要判断的类型
 *          用于判断对象的运行类型是否为XX类型，或者为XX类型的子类
 *          ==判断对象的运行类型是否为XX类型或者是XX类型的子类==
 */
public class Instanceof {
    public static void main(String[] args) {

        AA aa = new AA();
        BB bb = new BB();
        // todo:instanceof用于判断对象的类型是否为XX类型，或者为XX类型的子类
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);
        // a:编译类型 AA  运行类型BB
        AA a = new BB();
        // todo: 说明判断对象的运行类型是否为XX类型或者是XX类型的子类
        System.out.println(a instanceof  AA);
        System.out.println(a instanceof  BB);
        System.out.println("===========运行类型为Object=================");
        Object object = new Object();
        System.out.println(object instanceof  AA);
        System.out.println(object instanceof  BB);
        //修改运行类型
        System.out.println("===========改运行类型为AA=================");
        object = new AA();
        System.out.println(object instanceof  AA);
        System.out.println(object instanceof  BB);
        //修改运行类型
        System.out.println("===========改运行类型为BB=================");        object = new BB();
        System.out.println(object instanceof  AA);
        System.out.println(object instanceof  BB);
    }
}
