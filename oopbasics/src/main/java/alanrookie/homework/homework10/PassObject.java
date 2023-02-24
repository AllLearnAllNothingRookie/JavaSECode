package alanrookie.homework.homework10;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 20:56
 * (2)定义一个类PassObject，在类中定义一个方法printAreas()，
 * 该方法的定义如下:public void printAreas(Circle c, int times)1/方法签名
 *  * (3)在printAreas方法中打印输出1到times之间的每个整数半径值，
 *  以及对应的面积列如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 */
public class PassObject {
    /**
     * 在printAreas方法中打印输出1到times之间的每个整数半径值以及对应的面积列
     * @param c  圆类
     * @param times  半径范围
     */
    public void printAreas(Circle c, int times){
        System.out.println("Radius\tArea");
        for (int i = 1;i <= times;i ++){
            //c.radius = i;
            c.setRadius(i);
            double area = c.findArea();
            System.out.println(c.radius + "\t\t" + area);
        }

    }
}
