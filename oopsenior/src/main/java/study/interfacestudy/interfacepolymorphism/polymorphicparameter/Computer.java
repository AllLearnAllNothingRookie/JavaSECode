package study.interfacestudy.interfacepolymorphism.polymorphicparameter;

import study.interfacestudy.study.USBInterface;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/9 16:37
 */
public class Computer {
    /**
     * todo:接口多态性
     *      1.多态参数怒
     *    参数可以接收实现了接口的类的对象实例
     */
    public void work(USBInterface usb){
        usb.start();
        usb.stop();
    }
}
