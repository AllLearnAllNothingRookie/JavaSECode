package study.interfacestudy.interfacepolymorphism.polymorphicarray;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/10 16:57
 */
public class PolyArray {
    public static void main(String[] args) {
        //todo:接口多态: 2.多态数组  -> 接口类型数组
        //向上转型
        USB [] usbs = new USB[2];
        usbs[0] = new Iphone();
        usbs[1] = new XiaoMi();
        for (USB usb : usbs) {
            usb.charge();
            usb.transferDate();
            //向下转型
            if (usb instanceof  Iphone){
                Iphone iphone = (Iphone) usb;
                iphone.iphoneCould();
            }
            if (usb instanceof XiaoMi){
                XiaoMi mi = (XiaoMi) usb;
                mi.miCoule();
            }

        }
    }
}
