package study.interfacestudy.interfacepolymorphism.polymorphicparameter;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/9 16:32
 */
public interface USBInterface {
    //规定接口的相关方法 --- 即规范

    /**
     * 开始工作
     */
    public abstract void start();

    /**
     * 停止工作
     */
    public abstract  void stop();
}
