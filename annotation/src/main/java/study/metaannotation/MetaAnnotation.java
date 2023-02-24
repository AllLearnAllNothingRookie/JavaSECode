package study.metaannotation;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/27 10:48
 * todo: JDK的元注解用于修饰其他注解
 *  1.@Retention:指定注解的作用范围: SOURCE、CLASS、RUNTIME
 *  2.@Target:指定注解可以在那些地方使用
 *  3.@Documented：指定注解是否会在javadoc中体现
 *  4.@Inherited:子类会继承父类的注解
 *  I:@Retention：
 *      只能用于修饰一个注解定义，用于指定该注解可以保留多长时间,@Retention包含一个
 *      RetentionPolicy类型的成员变量，使用@Retention是必须为该value成员变量指定值
 *     注解@Retention的三种值：
 *      1.RetentionPolicy.SOURCE:编译器使用之后，直接丢弃这种策略的注解
 *      2.RetentionPolicy.CLASS:编译器将把注解记录在class文件中，当运行java程序
 *        时，JVM不保留注解，时默认值
 *      3.RetentionPolicy.RUNTIME:编译器将把注解记录在class文件中，当运行java程序
 *        时，JVM会保留注解。程序可以通过反射获取该注解
 *  II.@Target:
 *      用于修饰注解定义，用于指定被修饰的注解能用以修饰那些程序元素，@Target也包含一个
 *      名为value的成员变量。
 *      TYPE:类、接口（包括注释类型）或枚举声明
 *          [Class, interface (including annotation type), or enum declaration]
 *      FIELD: 字段声明（包括枚举常量）
 *          [Field declaration (includes enum constants)]
 *      METHOD:方法声明
 *          [Method declaration]
 *      PARAMETER:正式参数声明
 *          [Formal parameter declaration]
 *      CONSTRUCTOR:构造函数声明
 *          [Constructor declaration]
 *      LOCAL_VARIABLE:局部变量声明
 *          [Local variable declaration]
 *      ANNOTATION_TYPE:注解类型声明
 *          [Annotation type declaration]
 *      PACKAGE:包声明
 *          [Package declaration]
 *      TYPE_PARAMETER:类型参数声明
 *          [Type parameter declaration]
 *      TYPE_USE:类型的使用
 *          [Use of a type]
 *  III:@Documented:
 *      用于指定该元注解修饰的注解类将被javadoc工具提取成文档，即在生产文档时，可以
 *      看到该注解
 *     说明:定于为Documented的注解必须设置Retention值为RUNTME
 *  IV:@Inherited:
 *      被@Inherited元注解修饰的注解将具有继承性，如果某个类使用了被@Inherited修饰
 *      的注解，则在其子类中自定具有该注解
 *    说明:实际应用中，使用较少
 *
 */
public class MetaAnnotation {
}
