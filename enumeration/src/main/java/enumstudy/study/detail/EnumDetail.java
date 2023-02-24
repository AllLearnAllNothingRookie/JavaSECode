package enumstudy.study.detail;


/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/26 13:45
 * todo:enum实现枚举细节:
 *      1.当使用enum关键字开发一个枚举类时，默认或继承Enum类，而且枚举类使一个final类
 *      2.传统的public final static 枚举类  枚举对象 = new 枚举类(参数列表);
 *          简化为 枚举对象(参数列表)设计同样调用了构造器
 *      3.如果使用无参构造器创建枚举对象，则实参列表和小括号都可以省略
 *      4.如果有多个枚举对象，每个枚举对象中间使用逗号","间隔，最后一个枚举对象使用分号结束
 *      5.枚举对象必须放在枚举类的首行
 *      6.使用enum关键字之后，就不能再继承其他类了，因为enum会隐式继承Enum类，而
 *          Java使单继承，也不能被其他类继承，因为默认使用final修饰
 *      7.枚举类和普通类一样，可以实现接口:
 *          enum 类名 implements 接口1,接口2,……{}
 */

/**
 * todo: public enum EnumDetail extends WeekTest {
 *      报错信息:No extends clause allowed for enum
 */

/**
 * enum枚举类实现接口
 */
public enum EnumDetail implements InterA,InterB{
    //枚举对象
    /**
     * todo:如果有多个枚举对象，每个枚举对象中间使用逗号","间隔，最后一个枚举对象使用分号结束
     *      枚举对象必须放在枚举类的首行
     */
    SPRING("春天","春暖花开"),
    /**
     * todo:如果使用无参构造器创建枚举对象，则实参列表和小括号都可以省略
     */
    SUMMER,
    /**
     * todo:如果使用无参构造器创建枚举对象，不省略实参列表和小括号
     */
    AUTUMN(),
    WINTER("冬天","寒风凛凛");
    //属性
    private String name;
    private String desc;
    //构造器：默认私有可以不写
    EnumDetail(){

    }
    EnumDetail(String name,String desc){
        this.name = name;
        this.desc = desc;
    }
    //get方法
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
