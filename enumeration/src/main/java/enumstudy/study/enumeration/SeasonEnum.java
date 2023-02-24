package enumstudy.study.enumeration;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/25 22:27
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
 *         1.使用关键字enum来替代class
 *         2. public final static  枚举类 枚举对象 = new 枚举类(参数列表);
 *             使用 枚举对象(参数列表)来表示枚举名
 *         3.如果有多个常量(对象)使用逗号间隔即可，常量后的 (对象) 表示构造器，只是简化了写法
 *         4.如果使用enum实现枚举，要求把定义的常量对象写在最前面
 *
 */
public enum SeasonEnum {
    /**
     * todo:使用enum关键字实现枚举类
     *  1.使用关键字enum来替代class
     *  2. public final static  枚举类 枚举对象 = new 枚举类(参数列表);
     *      使用 枚举对象(参数列表)来表示枚举名
     *  3.如果有多个常量(对象)使用逗号间隔即可，常量后的 (对象) 表示构造器，只是简化了写法
     *  4.如果使用enum实现枚举，要求把定义的常量对象写在最前面
     */
    SPRING("春天","温暖"),
    SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉爽"),
    WINTER("冬天","寒冷");
    /**
     * 名字
     */
    private String name;
    /**
     * 描述
     */
    private String desc;

    /**
     *
     * todo: 1.私有化构造器，防止外部new对象
     */
    private SeasonEnum() {
    }
    private  SeasonEnum(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    /**
     * todo：可以提供get方法
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
}
