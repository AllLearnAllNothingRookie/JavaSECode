package study.extendsstudy.exercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/22 22:48
 */
public class Computer {
    private String cpu;
    private String memory;
    private String disk;

    public Computer(String cpu, String memory, String disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getDetails(){
       return "cpu为:" + cpu + "\t内存为:" + memory + "\t磁盘为:" + disk;
    }

}
