package study.introduce;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/18 20:24
 */
public class Cat {
    public String name = "旺财";

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public void hi(){
        System.out.println("hi" + name);
    }
    public void cry(){
        System.out.println(name + "喵喵交叫");
    }
    public void method(){
    }
}
