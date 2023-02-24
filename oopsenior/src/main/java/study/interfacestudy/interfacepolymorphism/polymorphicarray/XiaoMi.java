package study.interfacestudy.interfacepolymorphism.polymorphicarray;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/10 16:56
 */
public class XiaoMi implements USB{
    public void miCoule(){
        System.out.println("小米云");
    }

    @Override
    public void charge() {
        System.out.println("120w快充");
    }

    @Override
    public void transferDate() {
        System.out.println("安卓软件");
    }
}
