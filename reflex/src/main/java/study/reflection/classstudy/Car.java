package study.reflection.classstudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/19 15:47
 */
public class Car {
    public String brand = "奔驰";
    public int price = 2000000;
    public  String color = "黑色";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
