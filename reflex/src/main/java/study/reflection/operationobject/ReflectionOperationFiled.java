package study.reflection.operationobject;

import java.lang.reflect.Field;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 11:03
 * todo: 反射操作属性
 *      1.根据属性名获取Filed对象
 *          Filed f = clazz对象.getDeclaredFiled(属性名)
 *      2.爆破：
 *          f.setAccessible(true);
 *      3.访问
 *        赋值
 *        f.set(对象,值);
 *        取值
 *        f.get(对象);
 *      4.如果是静态属性，则set和get中的对象参数可以写成null
 */
public class ReflectionOperationFiled {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //获取Student类对应的Class对象
        Class<?> cls = Class.forName("study.reflection.operationobject.Student");
        // 创建对象
        Object stuent = cls.newInstance();
        // 使用反射获取属性  -- getField: 得到public修饰的属性
        Field age = cls.getField("age");
        //给属性赋值
        age.set(stuent,14);
        //获取属性的值
        System.out.println(age.get(stuent));
        System.out.println(stuent);
        //反射操作私有属性
        Field name = cls.getDeclaredField("name");
        //爆破
        name.setAccessible(true);
        //赋值
        name.set(stuent,"jack");
        //取值
        System.out.println(name.get(stuent));
        System.out.println(stuent);

        //通过反射操作静态属性
        Field score = cls.getDeclaredField("score");
        //爆破
        score.setAccessible(true);
        //方式1：
        //赋值
        score.set(stuent,67);
        //取值
        System.out.println(score.get(stuent));
        System.out.println(stuent);
        //方式2：
        //静态属性的对象参数可以写为null
        score.set(null,89);
        //取值
        System.out.println(score.get(null));
        System.out.println(stuent);


    }
}
