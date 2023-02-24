package study.wrapper;

import javax.swing.*;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/31 19:35
 */
public class IntegerExercise {
    public static void main(String[] args) {
        Integer integer1 = new Integer(1);
        Integer integer2 = new Integer(1);
        //false
        System.out.println(integer1 == integer2);
        // -128~127直接返回一个对象，否者就new一个对象
        //如果i在Integer.low(-128)~Integer.high(127),就直接从数组返回
        // 如果不在-128~127，就直接new Integer(i)
        Integer integer3 = 1;
        Integer integer4 = 1;
        //true
        System.out.println(integer3 == integer4);
        Integer integer5 = 128;
        Integer integer6 = 128;
        //false
        System.out.println(integer5 == integer6);

        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        //false
        System.out.println(i1 == i2);

        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        //false
        System.out.println(i3 == i4);

        Integer i5 = 127;
        Integer i6 = 127;
        //true
        System.out.println(i5 == i6);

        Integer i7 = 128;
        Integer i8 = 128;
        //false
        System.out.println(i7 == i8);

        Integer i9 = 127;
        Integer i10 = new Integer(127);
        //false
        System.out.println(i9 == i10);
        // todo:只要有基本数据类型则 == 判断的是值是否相等
        Integer i11 = 127;
        int i12 = 127;
        //true
        System.out.println(i11 == i12);
        // todo:只要有基本数据类型则 == 判断的是值是否相等
        Integer i13 = 128;
        int i14 = 128;
        //true
        System.out.println(i13 == i14);

        Integer i15 = 127;
        Integer i16 = 127;
        Integer i17 = i15 + 0;
        //true
        System.out.println(i17 == i15);
        Integer i18 = i16 + 0;
        //true
        System.out.println(i17 == i18);
    }
}
