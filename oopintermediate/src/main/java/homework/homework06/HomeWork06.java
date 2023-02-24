package homework.homework06;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 22:13
 * 设计一个Point类，其中x和y坐标可以通过构造器提供，提供一个子类LabeledPoint,其中设置一个
 * 构造器可以接受标签和x,y坐标，写出对应的构造器即可
 */
public class HomeWork06 {
    public static void main(String[] args) {
        Point point = new Point(10,23);
        LabeledPoint labeledPoint = new LabeledPoint("标签1",20,34);
    }
}
