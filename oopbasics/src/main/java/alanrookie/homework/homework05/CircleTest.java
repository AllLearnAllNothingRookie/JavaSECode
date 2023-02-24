package alanrookie.homework.homework05;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 19:14
 */
public class CircleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入圆的半径:");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        double perimeter = circle.perimeter();
        double area = circle.area();
        System.out.println("半径为" + radius + "的周长为:" + perimeter);
        System.out.println("半径为" + radius + "的面积为:" + area);
    }
}
