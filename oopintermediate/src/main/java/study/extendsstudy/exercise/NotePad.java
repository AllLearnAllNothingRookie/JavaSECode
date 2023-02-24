package study.extendsstudy.exercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/22 22:51
 */
public class NotePad extends Computer {
    private String color;

    public NotePad(String cpu, String memory, String disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void printInfo(){
        System.out.println("NotePad信息：");
        System.out.println(getDetails() + "\t" + "颜色为:" + color);
    }
}
