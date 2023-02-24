package enumstudy.study.enumeration;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/25 22:08
 * todo: 枚举(enumeration简写 enum)
 *      1.枚举是一组常量的集合
 *      2.枚举是一种特殊的类，里面只包含一组有限的特定的对象
 *   枚举实现:
 *      1. 自定义类实现枚举
 *          1.必须要提供setXXX方法，因为枚举对象只通过为只读
 *          2.对枚举对象/属性使用final + static 共同修饰，实现底层优化[final static
 *              修饰的属性在调用时不会加载类]
 *           3.枚举对象名通常使用全大写，常量的命名规范
 *           4.枚举根据需要，也可以有多个属性
 *         实现步骤:
 *              1. 构造器私有化
 *              2. 本类创建一组对象(static修饰的，可以优化为final static修饰的)
 *              3. 对外暴露对象(通常为对象添加 public final static )
 *              4. 可以对外提供get方法，但是不要通过set方法
 *      2.使用enum关键字实现枚举
 */
public class SeasonEnumeration {
    /**
     * 名字
     */
    private String name;
    /**
     * 描述
     */
    private String desc;

    /**
     * 实现自定义枚举
     * todo: 1.私有化构造器，防止外部new对象
     */
    private SeasonEnumeration() {
    }

    private  SeasonEnumeration(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    /**
     * 实现自定义枚举
     * todo: 2.去掉setXXX方法，防止属性被修改
     */
    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "SeasonEnumeration{" +
                "name :" + name +
                "---- desc: " + desc ;
    }
    /**
     * 实现自定义枚举
     * todo: 3.在该类内部创建固定的对象
     *    优化：增加final修饰符
     */
    /**
     * 春天
     */
    public final static  SeasonEnumeration SPRING = new SeasonEnumeration("春天","温暖");
    /**
     * 夏天
     */
    public final static  SeasonEnumeration SUMMER = new SeasonEnumeration("夏天","炎热");
    /**
     * 秋天
     */
    public final static  SeasonEnumeration AUTUMN = new SeasonEnumeration("秋天","凉爽");
    /**
     * 冬天
     */
    public final static  SeasonEnumeration WINTER = new SeasonEnumeration("冬天","寒冷");
}
