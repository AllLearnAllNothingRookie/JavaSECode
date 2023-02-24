package study.interfacestudy.interfacepolymorphism.polymorphicarray;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/10 16:56
 */
public class Iphone implements USB{
    public void iphoneCould(){
        System.out.println("iphone coule");
    }

    @Override
    public void charge() {
        System.out.println("5w充电器");
    }

    @Override
    public void transferDate() {
        System.out.println("iphone软件");
    }
}
