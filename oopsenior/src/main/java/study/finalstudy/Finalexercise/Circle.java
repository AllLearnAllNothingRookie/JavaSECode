package study.finalstudy.Finalexercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/8 21:19
 */
public class Circle {
    private double radius;
    //定义时赋值
   // private final  double PI = 3.14;
    private final  double PI ;
    //代码块中赋值
    /*{
        PI = 3.14;
    }*/
    //构造器中赋值
    public Circle(){
        PI = 3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public Circle(double radius, double PI) {
        this.radius = radius;
        this.PI = PI;
    }
    public double calArea(){
        return  PI * radius * radius;
    }
}
