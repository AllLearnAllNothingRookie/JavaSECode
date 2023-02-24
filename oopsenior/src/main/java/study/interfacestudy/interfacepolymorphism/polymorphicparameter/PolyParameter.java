package study.interfacestudy.interfacepolymorphism.polymorphicparameter;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/10 16:43
 */
public class PolyParameter {
    public static void main(String[] args) {
        //接口多态体现
        // 接口类型变量可以指向实现了接口类的实例
        USBInterface usb = new Phone();
        work(usb);
        usb = new Camera();
        work(usb);
    }
    public static void work(USBInterface usbInterface){
        usbInterface.start();
        usbInterface.stop();
    }
}
