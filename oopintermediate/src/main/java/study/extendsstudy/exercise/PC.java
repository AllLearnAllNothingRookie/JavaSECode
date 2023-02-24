package study.extendsstudy.exercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/22 22:50
 */
public class PC extends  Computer{
    private String brand;
    //子类初始化子类信息，父类初始化父类信息
    public PC(String cpu, String memory, String disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println("PC信息：");
        System.out.println(getDetails() + "\t品牌为:" + brand);
    }
}
