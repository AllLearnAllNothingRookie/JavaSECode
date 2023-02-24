package enumstudy.study.enumeration;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/25 21:58
 */
public class Season {
    /**
     * 名字
     */
    private String name;
    /**
     * 描述
     */
    private String desc;

    public Season() {
    }

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
