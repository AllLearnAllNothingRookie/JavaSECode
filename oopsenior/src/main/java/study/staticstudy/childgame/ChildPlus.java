package study.staticstudy.childgame;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/4 22:00
 */
public class ChildPlus {
    private String name;
    /**
     * todo:
     *  定义一个类变量(静态变量)
     *  该变量最大的特点是会被所有的ChildPlus类的实例共享
     *  类变量，可以通过类名来访问也可以通过对象名来访问
     */
    public static  int count = 0;

    public ChildPlus() {
        count ++;
    }

    public ChildPlus(String name) {
        count ++;
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
