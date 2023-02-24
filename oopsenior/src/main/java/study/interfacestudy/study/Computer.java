package study.interfacestudy.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/9 16:37
 */
public class Computer {
    /**
     * 电脑里有usb接口
     */
    public void work(USBInterface usb){
        usb.start();
        usb.stop();
    }
}
