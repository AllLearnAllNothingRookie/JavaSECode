package study.staticstudy.childgame;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/4 21:53
 */
public class Child {
    private String name;

    public Child() {
    }

    public Child(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name + "加入了游戏");
    }
}
