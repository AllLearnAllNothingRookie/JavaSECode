package homework.homework06;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/27 15:17
 */
public class Car {
    /**
     * 温度
     */
    private double temperature;

    /**
     * 空调
     */
    class Air{
        public void flow(){
            if (temperature >= 40){
                System.out.println("空调吹冷风");
                temperature = 26;
            }else if (temperature <= 0){
                System.out.println("空调吹暖风");
                temperature = 26;
            }else {
                System.out.println("空调不吹风");
            }
        }
    }

    public Car() {
    }

    public Car(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public void openAir(){
        new Air().flow();
    }
}
