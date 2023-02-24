package study.interfacestudy.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/9 16:35
 */
public class Camera implements USBInterface {
    @Override
    public void start() {
        System.out.println("相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作");
    }
}
