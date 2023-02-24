package study.staticstudy.childgame;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/4 21:52
 */
public class ChildGame {
    public static void main(String[] args) {
        // 统计有多少小孩加入了游戏
        //todo:count不存在于oop中，其他地方不方便使用 ----> 类变量
        int count = 0;
        Child tom = new Child("tom");
        count ++;
        tom.join();
        Child jack = new Child("jack");
        count ++;
        jack.join();
        Child rookie= new Child("rookie");
        count ++;
        rookie.join();
        Child ken = new Child("ken");
        count ++;
        ken.join();
        System.out.println("共有" + count + "个小孩加入了游戏");
        System.out.println("======================使用类变量================");
        ChildPlus thomson = new ChildPlus("Thomson");
        thomson.join();
        ChildPlus jerry = new ChildPlus("Jerry");
        jerry.join();
        ChildPlus smith = new ChildPlus("smith");
        smith.join();
        // todo:类变量，可以通过类名来访问也可以通过对象名来访问
        System.out.println("共有" + ChildPlus.count + "个小孩加入了游戏");
    }
}
