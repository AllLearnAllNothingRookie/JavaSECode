package enumstudy.study.detail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/26 14:19
 */
public enum EnumMethod {
    /**
     * 枚举对象
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
    EnumMethod() {
    }
    EnumMethod(String name, String desc) {
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
        return "EnumMethod{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
