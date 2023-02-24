package alanrookie.homework.homework11;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 22:00
 * 求程序运行的结果
 */
public class HomeWork11 {
    int count = 9;
    public void count1(){
        this.count = 10;
        System.out.println("count=" + count);
    }
    public void count2(){
        System.out.println("count=" + count ++);
    }
    //任何一个类都可以有main方法
    public static void main(String[] args) {
        // new 类型(); 匿名对象 匿名对象使用后就不能使用了
        //创建后匿名对象都调用方法
        new HomeWork11().count1(); //10
        HomeWork11 homeWork11 = new HomeWork11();
        homeWork11.count2();  // 9
        homeWork11.count2();  // 10
    }
}
