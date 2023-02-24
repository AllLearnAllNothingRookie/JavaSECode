package homework.homework06;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/27 15:21
 */
public class CarTest {
    public static void main(String[] args) {
        System.out.println("============50度的车=============");
        Car car1 = new Car(50);
        car1.openAir();
        car1.setTemperature(60);
        System.out.println(car1.getTemperature());
        Car.Air air1 = car1.new Air();
        air1.flow();
        System.out.println(car1.getTemperature());
        System.out.println("============-10度的车=============");
        Car car2 = new Car(-10);
        System.out.println(car2.getTemperature());
        car2.openAir();
        car2.setTemperature(-22);
        Car.Air air2 = car2.new Air();
        air2.flow();
        System.out.println(car1.getTemperature());
        System.out.println("============25度的车=============");
        Car car3 = new Car(25);
        car3.openAir();
        car3.setTemperature(55);
        Car.Air air3 = car3.new Air();
        air3.flow();
        car3.setTemperature(-19);
        air3.flow();
    }
}
