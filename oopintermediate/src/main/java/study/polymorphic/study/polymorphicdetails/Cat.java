package study.polymorphic.study.polymorphicdetails;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/27 20:23
 */
public class Cat extends  Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
    //cat特有的方法
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
