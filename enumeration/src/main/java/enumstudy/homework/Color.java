package enumstudy.homework;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/27 15:29
 */
public enum Color implements Inter{
    /**
     * 红色
     */
    RED(255,0,0),
    /**
     * 蓝色
     */
    BLUE(0,0,255),
    /**
     * 黑色
     */
    BLACK(0,0,0),
    /**
     * 黄色
     */
    YELLOW(255,255,0),
    /**
     * 绿色
     */
    GREEN(0,255,0);
    /**
     * 红色值
     */
    private int redValue;
    /**
     * 绿色值
     */
    private int greenValue;
    /**
     * 蓝色值
     */
    private int blueValue;

    /**
     * 无参构造器
     */
    Color() {
    }

    /**
     * 有参构造器
     * @param redValue
     * @param greenValue
     * @param blueValue
     */
    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    /**
     * get方法
     * @return
     */
    public int getRedValue() {
        return redValue;
    }

    public int getGreenValue() {
        return greenValue;
    }

    public int getBlueValue() {
        return blueValue;
    }

    @Override
    public String toString() {
        return "Color{" +
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue +
                '}';
    }

    @Override
    public void show() {
        System.out.println(name() + "三色值为值:红色 " + redValue + ",绿色 " + greenValue + ",蓝色 " + blueValue);
    }
}
