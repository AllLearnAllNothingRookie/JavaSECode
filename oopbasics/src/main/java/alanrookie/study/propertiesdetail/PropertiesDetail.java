package alanrookie.study.propertiesdetail;

import javax.sound.midi.Soundbank;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/22 21:33
 * 属性细节
 */
public class PropertiesDetail {
    /**
     * 1. 属性的定义语法同变量  格式： 访问修饰符  属性类型 属性名；
     *  访问修饰符： 控制属性的访问范围
     *   四种访问修饰符: public、 protected、缺省(声明都不写  默认)、private
     */
    public  int age;
    /**
     * 2.属性的定义类型可以为任意类型，包含基本类型和引用类型
     */
    public  String name;
    public  double price;
    /**
     * 3.属性如果不赋值，有默认值，规则和数组一致
     *  byte 0 、short 0 、int 0 、long 0 、float 0.0
     *  double 0.0、char \u0000 、boolean false 、引用类型 null
     */
    /**
     * byte默认值  0
     */
    public byte byteValue;
    /**
     * short默认值  0
     */
    public short shortValue;
    /**
     * int默认值  0
     */
    public  int intValue;
    /**
     * long默认值  0
     */
    public long longValue;
    /**
     * float默认值  0.0l
     */
    public float floatValue;
    /**
     * double默认值  0.0
     */
    public double doubleValue;
    /**
     * char默认值  \u0000
     */
    public char charValue;
    /**
     * boolean默认值  false
     */
    public boolean booleanValue;
    /**
     * 引用类型默认值  null
     */
    public  String str;


}
