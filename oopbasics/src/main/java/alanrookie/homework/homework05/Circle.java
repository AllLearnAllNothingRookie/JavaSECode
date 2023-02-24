package alanrookie.homework.homework05;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 19:09
 * 定义一个Circle，定义半径，提供圆的周长和圆的面积的方法
 */
public class Circle {
    double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    /**
     * 计算圆的周长
     * @return  返回圆的周长
     */
    public double perimeter(){
        //没有重名的局部变量可以省略this
        return  2 * Math.PI * this.radius;
    }

    /**
     * 计算圆的面积
     * @return  返回圆的面积
     */
    public double area(){
        return Math.PI  * radius * radius;
    }
}
