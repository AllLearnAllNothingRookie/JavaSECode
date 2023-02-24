package study.polymorphic.study.poly01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/27 12:49
 */
public class Poly {
    public static void main(String[] args) {
        Master master = new Master("rookie");
        Dog dog = new Dog("旺财");
        Bone bone = new Bone("肉骨头");
        master.feed(dog,bone);
        System.out.println("=======================");
        Cat cat = new Cat("tom");
        Fish fish = new Fish("秋刀鱼");
        master.feed(cat,fish);
        //todo：调用是优先调用与实参与形参类型一致的方法
        master.feed(dog,bone);
        master.feed(cat,fish);

        Pig pig = new Pig("佩奇");
        Rice rice = new Rice("人吃剩的米饭");
        // Master中没有对应的方法，调用多态参数的方法
        master.feed(pig,rice);

        System.out.println("======================多态==============================");
        // 使用多态
        master.feedPloy(dog,bone);
        master.feedPloy(cat,fish);
    }
}
