package homework.homework01;

import study.abstractclass.abstractdetail.F;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/27 13:56
 */
public class Frock {
    /**
     * 衣服出厂序列号起始值
     */
    private static  int currentNum = 100000;
    /**
     * 本件衣服的序列号
     */
    private int serialNumber;
    public Frock(){
        serialNumber = getCurrentNum();
    }
    public int getSerialNumber(){
        return serialNumber;
    }
    public static int getCurrentNum(){
        return  currentNum += 100;
    }

}
