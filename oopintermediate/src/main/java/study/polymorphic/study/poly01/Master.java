package study.polymorphic.study.poly01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/27 12:46
 */
public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //主人给动物喂食
    //喂狗
    public void feed(Dog dog,Bone bone){
        System.out.println("主人" + name +"给" + dog.getName() + "喂" + bone.getName());
    }
    //喂猫
    public void feed(Cat cat,Fish fish){
        System.out.println("主人" + name +"给" + cat.getName() + "喂" + fish.getName());
    }
    // 问题: 如果动物很多，食物也很多则feed方法会有很多的重载不利于代码的维护 -- 解决方案：多态
    //使用多态优化
    public void feed(Animal animal,Food food){
        System.out.println("多态");
        System.out.println("主人" + name +"给" + animal.getName() + "喂" + food.getName());
    }
    public void feedPloy(Animal animal,Food food){
        System.out.println("主人" + name +"给" + animal.getName() + "喂" + food.getName());
    }
}
