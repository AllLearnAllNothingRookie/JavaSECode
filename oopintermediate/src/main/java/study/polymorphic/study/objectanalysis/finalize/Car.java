package study.polymorphic.study.objectanalysis.finalize;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/30 15:26
 */
public class Car {
    private String name;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("关闭资源");
        super.finalize();
    }
}
