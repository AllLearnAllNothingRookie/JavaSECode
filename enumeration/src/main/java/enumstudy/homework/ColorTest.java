package enumstudy.homework;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/27 15:36
 */
public class ColorTest {
    public static void main(String[] args) {
        Color color = Color.RED;
        color.show();
        switch (color){
            case RED:
                System.out.println("红色");
                break;
            case BLACK:
                System.out.println("黑色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            case GREEN:
                System.out.println("绿色");
            case YELLOW:
                System.out.println("黄色");
                break;
            default:
                System.out.println("其他颜色");
                break;
        }
    }
}
