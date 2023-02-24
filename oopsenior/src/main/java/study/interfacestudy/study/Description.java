package study.interfacestudy.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/9 17:00
 */
public class Description implements InterfaceDescription{
    /**
     * 如果一个类实现一个接口，则需要该类实现接口中所有的抽象方法
     */
    @Override
    public void hi() {
        System.out.println("hi……");
    }
}
