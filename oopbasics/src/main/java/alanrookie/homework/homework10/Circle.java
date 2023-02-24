package alanrookie.homework.homework10;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 20:56
 * (1)定义一个Circle类，包含一个double型的radius属性代表圆的半径，一findArea()方法返回圆的面积。
 * (2)定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下:public void printAreas(Circle c, int times)1/方法签名
 * (3)在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积列如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。

 */
public class Circle {
    /**
     * 半径
     */
    double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    /**
     * 返回圆的面积
     * @return 面积
     */
    public double findArea(){
        return Math.PI * this.radius * this.radius;
    }
}
