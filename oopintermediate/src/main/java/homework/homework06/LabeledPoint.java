package homework.homework06;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 22:17
 */
public class LabeledPoint extends Point{
    private String labeled;

    public LabeledPoint() {
    }

    public LabeledPoint(String labeled,double x, double y) {
        super(x, y);
        this.labeled = labeled;
    }

    public String getLabeled() {
        return labeled;
    }

    public void setLabeled(String labeled) {
        this.labeled = labeled;
    }
}
