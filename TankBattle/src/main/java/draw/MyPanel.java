package draw;

import java.awt.*;
import javax.swing.*;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/28 14:52
 */
public class MyPanel extends JPanel {
    // 1.定义一个类继承JPanel

    /**
     * 绘图方法
     * Graphics:可以理解为画笔，提供了很多绘图的方法
     * @param g  the <code>Graphics</code> context in which to paint
     */
    @Override
    public void paint(Graphics g) {
        //调用父类的方法完成初始化
        super.paint(g);
        //绘制圆形
        //x - 要绘制的椭圆的左上角的 x坐标。
        //y - 要绘制的椭圆的左上角的 y坐标。
        //width - 要绘制的椭圆的宽度。
        //height - 要绘制的椭圆的高度。
        //width和height相等则是一个圆
        g.drawOval(10,10,100,100);

        //画直线 drawLine(int x1,int y1,int x2,int y2)
        //x1,y1起点坐标 x2,y2终点坐标
        g.drawLine(120,10,200,100);
        //画矩形边框 drawRect(int x,int y,int width,int height)
        //x,y 要绘制的椭圆的左上角的 x坐标和 y坐标 width：宽度  height：高度
        g.drawRect(230,10,100,100);
        //画填充矩形
        //1.先设置画笔颜色
        g.setColor(Color.red);
        g.fillRect(10,120,100,100);

        //画填充椭圆
        g.setColor(Color.blue);
        g.fillOval(120,120,100,100);
        //画图片 drawImage(Image img,int x,int y,....)
        //1.加载图片资源 -- 获取图片资源
        Image image = Toolkit.getDefaultToolkit().getImage(
                MyPanel.class.getResource("/bg.png"));
        g.drawImage(image,10,230,175,221,this);

        //设置画笔字体和颜色
        //颜色
        g.setColor(Color.green);
        //字体
        g.setFont(new Font("宋体",Font.BOLD,50));
        //画字符串  x,y指字体左下角的坐标
        g.drawString("啥也想学啥也不会的菜鸟",100,700);
    }


}
