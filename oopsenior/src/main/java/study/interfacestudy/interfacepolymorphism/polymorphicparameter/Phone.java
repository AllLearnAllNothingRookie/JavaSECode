package study.interfacestudy.interfacepolymorphism.polymorphicparameter;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/9 16:33
 */
public class Phone implements USBInterface {
    /**
     * Phone类实现USB接口  -- 必须实现接口定义的所有方法
     */
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
