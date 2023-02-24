package study.reflection.getclassmsg;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/19 21:09
 * 通过反射获取类的结构信息
 */
public class GetClassMsg {
    public static void main(String[] args) throws ClassNotFoundException {
        //todo:Class类常用方法
        // 得到Class对象
        Class<?> personClass = Class.forName("study.reflection.getclassmsg.Person");
        //1.getName: 获取全类名
        System.out.println(personClass.getName());
        //2.getSimpleName:获取简单类名
        System.out.println(personClass.getSimpleName());
        //3.getFields：获取所有public修饰的属性，包含本类以及父类的属性
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("========================");
        //4.getDeclaredFields: 获取本类中所有属性
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("===================");
        //5.getMethods：获取所有public修饰的方法，包含本类以及父类的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("===============");
        //6.getDeclaredMethods:获取本类中所有的方法
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        System.out.println("============");
        //7.getConstructors:获取所有public修饰的构造器，包含本类的构造器
        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("=======================");
        //8.getDeclaredConstructors:获取本类所有的构造器
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("========================");
        //9.getPackage:以Package形式返回包信息
        System.out.println(personClass.getPackage());
        //getSuperclass:以Class形式返回父类信息
        System.out.println(personClass.getSuperclass());
        //10.getInterfaces:以Class[]形式返回接口信息
        System.out.println("========================");
        Class<?>[] interfaces = personClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
        System.out.println("================");
        //11.getAnnotations:以Class[]形式返回注解信息
        for (Annotation annotation : personClass.getAnnotations()) {
            System.out.println(annotation);
        }
        System.out.println("=============================");
        //todo:Field类常用方法
        //1.getModifiers:以int形式返回修饰符
        //   说明：默认修饰符是  0，public 是 1， private 是 2，protected 是 4
        //   ，static 是 8  final 是 16，若修饰符为 public static 则返回两者 int只相加的结果
        declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField + "修饰符 " + declaredField.getModifiers());
        }
        // 2.getType: 以Class形式返回属性类型
        System.out.println("================属性类型=================");
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField + "属性类型：" + declaredField.getType());
        }
        System.out.println("==========属性名===============");
        // 3.getName: 返回属性名
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField + "属性名:" + declaredField.getName());
        }
        //todo:Method
        //1.getModifiers:以int形式返回修饰符
        //   说明：默认修饰符是  0，public 是 1， private 是 2，protected 是 4
        //   ，static 是 8  final 是 16，若修饰符为 public static 则返回两者 int只相加的结果
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod + " 修饰符：" + declaredMethod.getModifiers() );
        }
        System.out.println("======================");
        //2.getReturnType:以Class形式获取返回类型
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod + " 返回类型：" + declaredMethod.getReturnType() );
        }
        System.out.println("==========================");
        //3.getName: 返回方法名
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod + " 方法名：" + declaredMethod.getName() );
        }
        System.out.println("==========================");
        //4.getParameterTypes：以Class[] 返回参数类型数组
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod );
            System.out.println("形参列表：");
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            if (parameterTypes.length == 0){
                System.out.println("无参");
            }else {
                for (Class<?> parameterType : parameterTypes) {
                    System.out.println(parameterType);
                }
            }
            System.out.println("---------------------------");
        }
        System.out.println("===========================");
        //todo:Constructor
        //1.getModifiers:以int形式返回修饰符
        //  说明：默认修饰符是  0，public 是 1， private 是 2，protected 是 4
        //  ，static 是 8  final 是 16，若修饰符为 public static 则返回两者 int只相加的结果
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor  + " 修饰符：" + declaredConstructor.getModifiers());
        }
        System.out.println("===============================");
        //2.getName:返回构造器名(全类名)
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor  + " 构造器名：" + declaredConstructor.getName());
        }
        System.out.println("======================");
        //3.getParameterTypes：以Class[] 返回参数类型数组
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
            System.out.println("参数列表:");
            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
            if (parameterTypes.length == 0){
                System.out.println("空参");
            }else {
                for (Class<?> parameterType : parameterTypes) {
                    System.out.println(parameterType);
                }
            }
            System.out.println("-------------------");
        }
    }
}
