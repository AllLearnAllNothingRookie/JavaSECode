package alanrookie.study.object01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/22 21:13
 */
public class CatTest {
    public static void main(String[] args) {
        // 实例化一个对象
        // 1. new Cat() 表示创建一个对象
        // 2. Cat cat = new Cat() 把创建的对象赋值给一个变量
        Cat cat = new Cat();
        cat.name = "小白";
        cat.age = 3;
        cat.color = "白色";
        cat.weight = 10;
        // 创建一个对象
        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 4;
        cat2.color = "花色";
        cat2.weight = 2;
        //使用
        // 访问对象属性
        System.out.println("第一只猫的信息:\n姓名: " + cat.name + ",年龄:" + cat.age + ",颜色:" + cat.color + ",体重:" + cat.weight);
        System.out.println("第一只猫的信息:\n姓名: " + cat2.name + ",年龄:" + cat2.age + ",颜色:" + cat2.color + ",体重:" + cat2.weight);
    }
}
